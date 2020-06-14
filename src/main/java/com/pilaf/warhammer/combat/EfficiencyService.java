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
    private final UnitSizeAttackHelper unitSizeAttackHelper;
    public static final int EFFICIENCY_STANDARD = 200;

    public Report calculateEfficiency(Unit unit1, Unit unit2) {
        Report report = new Report();
        BigDecimal unit2DefenceEfficiency = calculateHitsToWin(unit1, unit2, report);
        BigDecimal unit1DefenceEfficiency = calculateHitsToWin(unit2, unit1, null);
        BigDecimal overallUnit1Efficiency = unit1DefenceEfficiency.divide(unit2DefenceEfficiency, 2, RoundingMode.HALF_UP);
        report.setUnit1(unit1.getName());
        report.setUnit2(unit2.getName());
        report.setAttackEfficiency(toAttackEfficiency(unit2DefenceEfficiency));
        report.setDefenceEfficiency(toDefenceEfficiency(unit1DefenceEfficiency));
        report.setOverallScore(overallUnit1Efficiency);
        report.setEfficiencyGold(calculateEfficiencyGold(unit1DefenceEfficiency, unit2DefenceEfficiency, unit1.getCost(), unit2.getCost()));
        return report;
    }

    private BigDecimal toDefenceEfficiency(BigDecimal unit1DefenceEfficiency) {
        return unit1DefenceEfficiency.divide(BigDecimal.valueOf(EFFICIENCY_STANDARD), 2, RoundingMode.HALF_UP);
    }

    private BigDecimal toAttackEfficiency(BigDecimal unit2DefenceEfficiency) {
        return BigDecimal.valueOf(EFFICIENCY_STANDARD).divide(unit2DefenceEfficiency, 2, RoundingMode.HALF_UP);
    }

    private BigDecimal calculateEfficiencyGold(BigDecimal unit1DefenceEfficiency, BigDecimal unit2DefenceEfficiency, int cost, int unit2Cost) {
        BigDecimal unit1ResultPerGold = unit1DefenceEfficiency.divide(new BigDecimal(cost), 2, RoundingMode.HALF_UP);
        BigDecimal unit2ResultPerGold = unit2DefenceEfficiency.divide(new BigDecimal(unit2Cost), 2, RoundingMode.HALF_UP);
        return unit1ResultPerGold.divide(unit2ResultPerGold, 2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateHitsToWin(Unit unit, Unit target, Report report) {
        BigDecimal hitPointsToWin = BigDecimal.valueOf(disciplineHelper.calculateDamageToHitToLoseDiscipline(unit, target));
        BigDecimal attackChance = BigDecimal.valueOf(unitService.calculateAttackChance(unit, target)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal averageDamage = BigDecimal.valueOf(unitService.calculateAverageDamage(unit, target)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal speedMod = BigDecimal.valueOf(unitService.calculateSpeedModifier(unit)).setScale(2, RoundingMode.HALF_UP);
        BigDecimal unitAmountMod = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, target);

        BigDecimal allAttackBonuses = attackChance
                .multiply(averageDamage)
                .multiply(speedMod)
                .multiply(unitAmountMod);
        if (report != null){
            report.setChangeToHit(attackChance);
            report.setAverageDamage(averageDamage);
            report.setUnitAmountModifier(unitAmountMod);
        }

        BigDecimal result = hitPointsToWin.divide(allAttackBonuses, 0, RoundingMode.HALF_UP);
        return result;
    }
}
