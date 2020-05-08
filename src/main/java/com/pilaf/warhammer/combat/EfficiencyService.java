package com.pilaf.warhammer.combat;

public class EfficiencyService {

    public Report calculateEfficiency(Unit unit1, Unit unit2){
        double unit1AttackEfficiency = calculateHitsToWin(unit1, unit2);
        double unit2AttackEfficiency = calculateHitsToWin(unit2, unit1);
        double overallEfficiency = unit1AttackEfficiency / unit2AttackEfficiency;
        return new Report(unit1.getName(),
                unit2.getName(),
                unit1AttackEfficiency,
                unit2AttackEfficiency,
                overallEfficiency,
                (overallEfficiency * 1000) / unit1.getCost()
        );
    }

   public double calculateHitsToWin(Unit unit, Unit target){
        double hitPointsToWin = target.getHitPointsPerUnit() * target.getUnitAmount();
        return hitPointsToWin / (unit.calculateAttackChance(target) * unit.calculateAverageDamage(target) * unit.calculateSpeedModifier() * unit.calculateUnitAmountSizeBonus(target));
    }
}
