package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class StrenthInNumbers implements SkillsEffect {

    @Override
    public Skills getSkillName() {
        return Skills.STRENTH_IN_NUMBERS;
    }

    @Override
    public Target getTarget() {
        return Target.UNIT;
    }

    @Override
    public double calculateDefenceAfterEffect(Unit unit, Unit target, double defence) {
        return defence + (8/2);
    }

    @Override
    public double calculateSpeedAfterEffect(Unit unit, Unit target, double speed) {
        return speed * (0.96);
    }

    @Override
    public double calculateLeadershipAfterEffect(Unit unit, Unit target, double leadership) {
        return leadership + (6/2);
    }
}
