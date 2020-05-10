package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class PoisonAttack implements SkillsEffect {


    @Override
    public Skills getSkillName() {
        return Skills.POISON_ATTACK;
    }

    @Override
    public Target getTarget() {
        return Target.ENEMY;
    }

    @Override
    public double calculateAttackAfterEffect(double attack) {
        return attack;
    }

    @Override
    public double calculateDefenceAfterEffect(double defence) {
        return defence;
    }

    @Override
    public double calculateDamageAfterEffect(double damage) {
        return damage * 0.8;
    }

    @Override
    public double calculateSpeedAfterEffect(double speed) {
        return speed * 0.8;
    }

    @Override
    public double calculateArmorAfterEffect(double armor) {
        return armor;
    }


}
