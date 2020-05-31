package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

public class SunderedArmor implements SkillsEffect {

    @Override
    public Skills getSkillName() {
        return Skills.SUNDER_ARMOR;
    }

    @Override
    public Target getTarget() {
        return Target.ENEMY;
    }

    @Override
    public double calculateArmorAfterEffect(Unit unit, Unit target, double armor) {
        int armorAfterReduction = (int) armor - 30;
        if (armorAfterReduction < 0){
            return 0;
        } else {
            return armorAfterReduction;
        }
    }
}
