package com.pilaf.warhammer.combat;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ChargeHelper {
    private static final int CHARGE_BONUS_TIMEOUT = 15;

    @Autowired
    private final CombatConfig combatConfig;

    public double calculateBonusAttack(Unit unit, Unit target){
        if (shouldNotCalculateBonus(unit, target)){
            return 0;
        }
        return unit.getAttack() * calculateChargeBonusModifier(unit.getChargeBonus());
    }

    public double calculateBonusDamage(double damage, Unit unit, Unit target){
        if (shouldNotCalculateBonus(unit, target)){
            return 0;
        }
        return damage * calculateChargeBonusModifier(unit.getChargeBonus()) * (damage / (unit.getDamage() + unit.getApDamage()));
    }


    private boolean shouldNotCalculateBonus(Unit unit, Unit target) {
        return (combatConfig.getChargeStatus() == ChargeStatus.NONE
                || unit.getSkillsList().contains(Skills.CHARGE_DEFENCE_EXPERT)
                || (unit.getSkillsList().contains(Skills.CHARGE_DEFENCE_AGAINST_LARGE) && target.getSize() == Size.LARGE)
                || target.getSkillsList().contains(Skills.CHARGE_DEFENCE_EXPERT)
                || (target.getSkillsList().contains(Skills.CHARGE_DEFENCE_AGAINST_LARGE) && unit.getSize() == Size.LARGE));
    }

    private double calculateChargeBonusModifier(int chargeBonus) {
        double sum = 0;
        for (int second = 0; second < CHARGE_BONUS_TIMEOUT; second++){
            sum += (chargeBonus * (CHARGE_BONUS_TIMEOUT - second)/CHARGE_BONUS_TIMEOUT);
        }
        if (combatConfig.getChargeStatus() == ChargeStatus.CYCLE){
           sum =  sum / CHARGE_BONUS_TIMEOUT;
        } else if (combatConfig.getChargeStatus() == ChargeStatus.STANDARD){
            sum = sum / (CHARGE_BONUS_TIMEOUT * 2);
        } else if (combatConfig.getChargeStatus() == ChargeStatus.LOW){
            sum = sum / (CHARGE_BONUS_TIMEOUT * 4);
        }
        return sum /100;
    }
}
