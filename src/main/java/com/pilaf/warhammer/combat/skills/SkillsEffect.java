package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public interface SkillsEffect {

    Skills getSkillName();
    Target getTarget();
    default  double calculateAttackAfterEffect(Unit unit, Unit target, double attack){
        return attack;
    }
    default double calculateDefenceAfterEffect(Unit unit, Unit target, double defence){
        return defence;
    }
    default double calculateDamageAfterEffect(Unit unit, Unit target, double damage){
        return damage;
    }
    default double calculateSpeedAfterEffect(Unit unit, Unit target, double speed){
        return speed;
    }
    default double calculateArmorAfterEffect(Unit unit, Unit target, double armor){
        return armor;
    }
    default double calculateChargeAfterEffect(Unit unit, Unit target, double charge){
        return charge;
    }
    default boolean isConnectedToLeadership(){
        return false;
    }




}
