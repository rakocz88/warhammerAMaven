package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Unit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SkillsModifierHelper {

    private final SkillsFactory skillsFactory;

    // attack
    public double calculateAttackAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, target, "calculateAttackAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target, unit, "calculateAttackAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // defence
    public double calculateDamageAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, target,"calculateDamageAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target, unit, "calculateDamageAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // defence
    public double calculateDefenceAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, target, "calculateDefenceAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target, unit,  "calculateDefenceAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // charge
    public double calculateChargeAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, target ,"calculateChargeAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target, unit,"calculateChargeAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // charge
    public double calculateSpeedAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, target ,"calculateSpeedAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target, unit, "calculateSpeedAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // charge
    public double calculateArmorAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, target, "calculateArmorAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target, unit, "calculateArmorAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    private double applyEffects(double stat, Unit unit, Unit target, String methodToInvoke, Target targetEnum) {
        List<SkillsEffect> skillsEffectsList = unit.getSkillsList().stream()
                .map(skills -> skillsFactory.create(skills))
                .filter(skills -> skills != null)
                .filter(skillsEffect -> skillsEffect.getTarget() == targetEnum)
                .collect(Collectors.toList());
        double calculatedStat = stat;
        for (SkillsEffect skillEffect : skillsEffectsList) {
            Method foundMethod = Arrays.asList(ReflectionUtils.getAllDeclaredMethods(SkillsEffect.class)).stream().filter(
                    method -> method.getName().equals(methodToInvoke)
            ).findFirst().orElseThrow();
            calculatedStat = (double) ReflectionUtils.invokeMethod(foundMethod, skillEffect, unit, target, stat);
        }
        return calculatedStat;
    }
}
