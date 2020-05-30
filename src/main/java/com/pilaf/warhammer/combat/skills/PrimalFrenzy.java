package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class PrimalFrenzy implements SkillsEffect {
    @Override
    public Skills getSkillName() {
        return Skills.PRIMAL_FRENZY;
    }

    @Override
    public Target getTarget() {
        return Target.UNIT;
    }

    @Override
    public double calculateAttackAfterEffect(Unit unit, Unit target, double attack) {
        return attack + 5;
    }

    @Override
    public double calculateSpeedAfterEffect(Unit unit, Unit target, double speed) {
        return speed * 1.12;
    }

    @Override
    public double calculateChargeAfterEffect(Unit unit, Unit target, double charge) {
        return charge + 1.08;
    }

    @Override
    public boolean isConnectedToLeadership() {
        return true;
    }
}
