package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;
import org.springframework.stereotype.Component;

public class SkillsHelper {

    public static double calculateBonusDependingOnDisciplineMultiply(Unit unit, double unitValue, double bonus) {
        if (unit.getSkillsList().contains(Skills.UNBREAKABLE)){
            return unitValue * bonus;
        } else {
            return unitValue * ((bonus+1)/2);
        }
    }

    public static double calculateBonusDependingOnDisciplineAdd(Unit unit, double unitValue, double bonusValue) {
        if (unit.getSkillsList().contains(Skills.UNBREAKABLE)){
            return unitValue + bonusValue;
        } else {
            return unitValue + (bonusValue/2);
        }
    }
}
