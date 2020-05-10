package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public interface SkillsEffect {

    Skills getSkillName();
    Target getTarget();
    default  double calculateAttackAfterEffect(double attack){
        return attack;
    }
    default double calculateDefenceAfterEffect(double defence){
        return defence;
    }
    default double calculateDamageAfterEffect(double damage){
        return damage;
    }
    default double calculateSpeedAfterEffect(double speed){
        return speed;
    }
    default double calculateArmorAfterEffect(double armor){
        return armor;
    }
    default double calculateChargeAfterEffect(double charge){
        return charge;
    }
    default boolean isConnectedToLeadership(){
        return false;
    }




}
