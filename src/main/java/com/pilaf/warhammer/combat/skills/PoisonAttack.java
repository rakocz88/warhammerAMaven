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
    public double calculateDamageAfterEffect(Unit unit, Unit target, double damage) {
        return damage * 0.8;
    }

    @Override
    public double calculateSpeedAfterEffect(Unit unit, Unit target, double speed) {
        return speed * 0.8;
    }


}
