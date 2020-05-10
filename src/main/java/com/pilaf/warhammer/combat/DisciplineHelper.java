package com.pilaf.warhammer.combat;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DisciplineHelper {

    private final CombatConfig combatConfig;

    public int calculateFightPenalty(double fightEfficiency) {
        if (fightEfficiency <= 0.5) {
            return DisciplineModifier.LOSES_2.penalty;
        } else if (0.9 > fightEfficiency && fightEfficiency > 0.5) {
            return DisciplineModifier.LOSES.penalty;
        } else {
            return 0;
        }
    }

    public int calculateDamageToHitToLoseDiscipline(Unit unit) {
        int initialPenalty = sumUpInitialPenalty();
        int disciplineLeft = unit.getLeadership() + initialPenalty;
        return calculateDamageUnitUnitLosesAllLeadership(unit, disciplineLeft);
    }

    private int calculateDamageUnitUnitLosesAllLeadership(Unit unit, int disciplineLeft) {
        double percentReachableBeforeLeadershipIsZero = (1 - (0.9 - (((double) disciplineLeft) / 100)));
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
