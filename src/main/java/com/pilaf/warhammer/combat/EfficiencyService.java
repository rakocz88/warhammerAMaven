package com.pilaf.warhammer.combat;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class EfficiencyService {

    public Report calculateEfficiency(Unit unit1, Unit unit2){
        BigDecimal unit2DefenceEfficiency = calculateHitsToWin(unit1, unit2);
        BigDecimal unit1DefenceEfficiency = calculateHitsToWin(unit2, unit1);
        BigDecimal overallUnit1Efficiency = unit1DefenceEfficiency.divide(unit2DefenceEfficiency, 2 ,RoundingMode.HALF_UP);

        return new Report(unit1.getName(),
                unit2.getName(),
                unit1DefenceEfficiency,
                unit2DefenceEfficiency,
                overallUnit1Efficiency,
                calculateEfficiencyGold(overallUnit1Efficiency, unit1.getCost(), unit2.getCost())
        );
    }

    private BigDecimal calculateEfficiencyGold(BigDecimal overallEfficiency, int cost, int unit2Cost) {
        BigDecimal multiplied = overallEfficiency.multiply(new BigDecimal(unit2Cost));
        return multiplied.divide(new BigDecimal(cost), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateHitsToWin(Unit unit, Unit target){
        BigDecimal hitPointsToWin = BigDecimal.valueOf(target.getHitPointsPerUnit()).multiply(BigDecimal.valueOf(target.getUnitAmount()));
        BigDecimal allAttackBonuses = BigDecimal.valueOf(unit.calculateAttackChance(target)).multiply(
                BigDecimal.valueOf(unit.calculateAverageDamage(target))
                .multiply(BigDecimal.valueOf(unit.calculateSpeedModifier()))
                .multiply(BigDecimal.valueOf(unit.calculateUnitAmountSizeBonus(target)))
        );
        BigDecimal result =  hitPointsToWin.divide(allAttackBonuses, 0, RoundingMode.HALF_UP);
        return result;
       }
}
