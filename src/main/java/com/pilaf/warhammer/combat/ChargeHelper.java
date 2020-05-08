package com.pilaf.warhammer.combat;

public class ChargeHelper {
    private static final int CHARGE_BONUS_TIMEOUT = 15;

    public static double calculateBonusAttack(Unit unit, Unit target){
        if (shouldNotCalculateBonus(unit, target)){
            return 0;
        }
        return unit.getAttack() * calculateChargeBonusModifier(unit.getChargeBonus());
    }

    public static double calculateBonusDamage(double damage, Unit unit, Unit target){
        if (shouldNotCalculateBonus(unit, target)){
            return 0;
        }
        return damage * calculateChargeBonusModifier(unit.getChargeBonus()) * (damage / (unit.getDamage() + unit.getApDamage()));
    }


    private static boolean shouldNotCalculateBonus(Unit unit, Unit target) {
        return (CombatConfig.getChargeStatus() == ChargeStatus.NONE
                || unit.getSkillsList().contains(Skills.CHARGE_DEFENCE_EXPERT)
                || (unit.getSkillsList().contains(Skills.CHARGE_DEFENCE_AGAINST_LARGE) && target.getSize() == Size.LARGE)
                || target.getSkillsList().contains(Skills.CHARGE_DEFENCE_EXPERT)
                || (target.getSkillsList().contains(Skills.CHARGE_DEFENCE_AGAINST_LARGE) && unit.getSize() == Size.LARGE));
    }

    private static double calculateChargeBonusModifier(int chargeBonus) {
        double sum = 0;
        for (int second = 0; second < CHARGE_BONUS_TIMEOUT; second++){
            sum += (chargeBonus * (CHARGE_BONUS_TIMEOUT - second)/CHARGE_BONUS_TIMEOUT);
        }
        if (CombatConfig.getChargeStatus() == ChargeStatus.CYCLE){
           sum =  sum / CHARGE_BONUS_TIMEOUT;
        } else if (CombatConfig.getChargeStatus() == ChargeStatus.STANDARD){
            sum = sum / (CHARGE_BONUS_TIMEOUT * 2);
        }
        return sum /100;
    }
}
