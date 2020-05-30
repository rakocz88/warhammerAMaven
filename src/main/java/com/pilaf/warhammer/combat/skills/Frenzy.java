package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class Frenzy implements SkillsEffect {
    @Override
    public Skills getSkillName() {
        return Skills.FRENZY;
    }

    @Override
    public Target getTarget() {
        return Target.UNIT;
    }

    @Override
    public double calculateAttackAfterEffect(Unit unit, Unit target, double attack) {
        return SkillsHelper.calculateBonusDependingOnDisciplineAdd(unit, attack, 8);
    }



    @Override
    public double calculateDamageAfterEffect(Unit unit, Unit target, double damage) {
        return SkillsHelper.calculateBonusDependingOnDisciplineMultiply(unit, damage, 1.15);
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
