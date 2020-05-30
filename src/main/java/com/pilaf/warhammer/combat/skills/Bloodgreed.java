package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class Bloodgreed implements SkillsEffect {
    @Override
    public Skills getSkillName() {
        return Skills.BLOODGREED;
    }

    @Override
    public Target getTarget() {
        return Target.UNIT;
    }

    @Override
    public double calculateLeadershipAfterEffect(Unit unit, Unit target, double leadership) {
        return leadership + 15;
    }
}
