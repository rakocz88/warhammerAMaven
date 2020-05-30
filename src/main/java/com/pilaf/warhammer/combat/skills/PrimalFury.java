package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class PrimalFury implements SkillsEffect {
    @Override
    public Skills getSkillName() {
        return Skills.PRIMAL_FURY;
    }

    @Override
    public Target getTarget() {
        return Target.UNIT;
    }

    @Override
    public double calculateAttackAfterEffect(Unit unit, Unit target, double attack) {
        return SkillsHelper.calculateBonusDependingOnDisciplineAdd(unit, attack, 5);
    }

    @Override
    public double calculateSpeedAfterEffect(Unit unit, Unit target, double speed) {
        return SkillsHelper.calculateBonusDependingOnDisciplineMultiply(unit, speed, 1.12);
    }

    @Override
    public double calculateChargeAfterEffect(Unit unit, Unit target, double charge) {
        return SkillsHelper.calculateBonusDependingOnDisciplineMultiply(unit, charge, 1.08);
    }

    @Override
    public boolean isConnectedToLeadership() {
        return true;
    }
}
