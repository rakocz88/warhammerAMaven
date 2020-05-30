package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class MartialProwess implements SkillsEffect {

    @Override
    public Skills getSkillName() {
        return Skills.MARTIAL_PROWES;
    }

    @Override
    public Target getTarget() {
        return Target.UNIT;
    }

    @Override
    public double calculateAttackAfterEffect(Unit unit, Unit target, double attack) {
        return attack + (2/2);
    }

    @Override
    public double calculateDefenceAfterEffect(Unit unit, Unit target, double defence) {
        return defence + (12/2);
    }
}
