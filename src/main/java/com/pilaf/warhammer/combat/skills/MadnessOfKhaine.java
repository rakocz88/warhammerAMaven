package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class MadnessOfKhaine implements SkillsEffect {
    @Override
    public Skills getSkillName() {
        return Skills.MADNESS_OF_KHAINE;
    }

    @Override
    public Target getTarget() {
        return Target.ENEMY;
    }

    @Override
    public double calculateSpeedAfterEffect(Unit unit, Unit target, double speed){
        return speed * 0.8;
    }

    @Override
    public double calculateDefenceAfterEffect(Unit unit, Unit target, double defence){

        return defence * 0.9;
    }

}
