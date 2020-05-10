package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Unit;

@FunctionalInterface
public interface SkillEffectAttribute {
    double effect(double attribute);
}
