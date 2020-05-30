package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class CauseTerror implements SkillsEffect {
    @Override
    public Skills getSkillName() {
        return Skills.CAUSE_TERROR;
    }

    @Override
    public Target getTarget() {
        return Target.ENEMY;
    }

    @Override
    public double calculateLeadershipAfterEffect(Unit unit, Unit target, double leadership) {
        if (target.getSkillsList().contains(Skills.IMMUNE_TO_PSYCHOLOGY) || target.getSkillsList().contains(Skills.CAUSE_TERROR)){
            return leadership;
        } else {
            return leadership - 13;
        }
    }
}
