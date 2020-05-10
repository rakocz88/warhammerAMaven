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

    public double calculateSpeedAfterEffect(double speed){
        return speed * 0.8;
    }

    public double calculateDefenceAfterEffect(double defence){

        return defence * 0.9;
    }

}
