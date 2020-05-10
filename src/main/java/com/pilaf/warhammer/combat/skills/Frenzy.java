package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;

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
    public double calculateAttackAfterEffect(double attack) {
        return attack + 8;
    }

    @Override
    public double calculateDamageAfterEffect(double damage) {
        return damage * 1.15;
    }

    @Override
    public double calculateChargeAfterEffect(double charge) {
        return charge * 1.08;
    }

    @Override
    public boolean isConnectedToLeadership() {
        return true;
    }
}
