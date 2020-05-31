package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class Charmed implements SkillsEffect {

    @Override
    public Skills getSkillName() {
        return Skills.CHARMED;
    }

    @Override
    public Target getTarget() {
        return Target.ENEMY;
    }

    @Override
    public double calculateAttackAfterEffect(Unit unit, Unit target, double attack) {
        return attack - 9;
    }
}
