package com.pilaf.warhammer.combat;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
@RequiredArgsConstructor
@Slf4j
public class EfficiencyService {

    private final UnitService unitService;
    private final DisciplineHelper disciplineHelper;
    public static final int EFFICIENCY_STANDARD = 300;

    public Report calculateEfficiency(Unit unit1, Unit unit2){
        BigDecimal unit2DefenceEfficiency = calculateHitsToWin(unit1, unit2);
        BigDecimal unit1DefenceEfficiency = calculateHitsToWin(unit2, unit1);
        BigDecimal overallUnit1Efficiency = unit1DefenceEfficiency.divide(unit2DefenceEfficiency, 2 ,RoundingMode.HALF_UP);

        return new Report(unit1.getName(),
                unit2.getName(),
                toAttackEfficiency(unit2DefenceEfficiency),
                toDefenceEfficiency(unit1DefenceEfficiency),
                overallUnit1Efficiency,
                calculateEfficiencyGold(overallUnit1Efficiency, unit1.getCost(), unit2.getCost())
        );
    }

    private BigDecimal toDefenceEfficiency(BigDecimal unit1DefenceEfficiency) {
        return unit1DefenceEfficiency.divide(BigDecimal.valueOf(EFFICIENCY_STANDARD), 2, RoundingMode.HALF_UP);
    }

    private BigDecimal toAttackEfficiency(BigDecimal unit2DefenceEfficiency) {
        return BigDecimal.valueOf(EFFICIENCY_STANDARD).divide(unit2DefenceEfficiency, 2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateEfficiencyGold(BigDecimal overallEfficiency, int cost, int unit2Cost) {
        BigDecimal multiplied = overallEfficiency.multiply(new BigDecimal(unit2Cost));
        return multiplied.divide(new BigDecimal(cost), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateHitsToWin(Unit unit, Unit target){
        //BigDecimal hitPointsToWin = BigDecimal.valueOf(target.getHitPointsPerUnit()).multiply(BigDecimal.valueOf(target.getUnitAmount()));
        BigDecimal hitPointsToWin = BigDecimal.valueOf(disciplineHelper.calculateDamageToHitToLoseDiscipline(target));
        BigDecimal allAttackBonuses = BigDecimal.valueOf(unitService.calculateAttackChance(unit, target)).multiply(
                BigDecimal.valueOf(unitService.calculateAverageDamage(unit, target))
                .multiply(BigDecimal.valueOf(unitService.calculateSpeedModifier(unit)))
                .multiply(BigDecimal.valueOf(unitService.calculateUnitAmountSizeBonus(unit, target)))
        );

        BigDecimal result =  hitPointsToWin.divide(allAttackBonuses, 0, RoundingMode.HALF_UP);
        log.info("All attack values {} to {} is {}", unit.getName(), target.getName(), allAttackBonuses);
        log.info("Hit points to reach {} to {} is {}", unit.getName(), target.getName(), hitPointsToWin);
        log.info("hit to win {} {} is {}", unit.getName(), target.getName(), result);
        return result;
       }
}
