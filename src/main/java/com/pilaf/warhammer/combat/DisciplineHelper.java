package com.pilaf.warhammer.combat;

import com.pilaf.warhammer.combat.skills.SkillsModifierHelper;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DisciplineHelper {

    private final CombatConfig combatConfig;
    private final SkillsModifierHelper skillsModifierHelper;

    public int calculateFightPenalty(double fightEfficiency) {
        if (fightEfficiency <= 0.5) {
            return DisciplineModifier.LOSES_2.penalty;
        } else if (0.9 > fightEfficiency && fightEfficiency > 0.5) {
            return DisciplineModifier.LOSES.penalty;
        } else {
            return 0;
        }
    }

    public int calculateDamageToHitToLoseDiscipline(Unit unit2, Unit target) {
        double leadershipAfterEffects = skillsModifierHelper.calculateLeadershipAfterEffect(target.getLeadership(), target, unit2);
        if (target.getSkillsList().contains(Skills.UNBREAKABLE)){
            return target.getHitPointsPerUnit() * target.getUnitAmount();
        }
        int initialPenalty = sumUpInitialPenalty();
        int disciplineLeft = (int)leadershipAfterEffects + initialPenalty;
        return calculateDamageUnitUnitLosesAllLeadership(target, disciplineLeft);
    }

    private int calculateDamageUnitUnitLosesAllLeadership(Unit unit, int disciplineLeft) {
        if (combatConfig.isSkipLeadership()){
            return  Math.round(unit.getHitPointsPerUnit() * unit.getUnitAmount());
        }
        double percentReachableBeforeLeadershipIsZero = (1 - (0.75 - (((double) disciplineLeft) / 100)));
        int damageBeforeLeadershipIsZero =  (int) Math.round(unit.getHitPointsPerUnit() * unit.getUnitAmount() * percentReachableBeforeLeadershipIsZero);
        return damageBeforeLeadershipIsZero > (unit.getUnitAmount() * unit.getHitPointsPerUnit())
                ? (unit.getUnitAmount() * unit.getHitPointsPerUnit())
                : damageBeforeLeadershipIsZero;
    }

    private int sumUpInitialPenalty() {
        return combatConfig.getDisciplineModifierList().stream().map(disciplineModifier -> disciplineModifier.penalty).reduce(0, Integer::sum);
    }


    @Value
    public static class DisciplineDamageModel {
        int minAmount;
        int maxAmount;
        int penalty;
    }

    @Value
    public static class DisciplineModifierModel {
        String name;
        int level;
        int penalty;
    }
}
