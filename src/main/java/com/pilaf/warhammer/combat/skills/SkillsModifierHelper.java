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
        calculatedStat = applyEffects(calculatedStat, unit, "calculateAttackAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target,  "calculateAttackAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // defence
    public double calculateDamageAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, "calculateDamageAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target,  "calculateDamageAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // defence
    public double calculateDefenceAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, "calculateDefenceAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target,  "calculateDefenceAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // charge
    public double calculateChargeAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, "calculateChargeAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target,  "calculateChargeAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // charge
    public double calculateSpeedAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, "calculateSpeedAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target,  "calculateSpeedAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    // charge
    public double calculateArmorAfterEffect(double stat, Unit unit, Unit target) {
        double calculatedStat = stat;
        calculatedStat = applyEffects(calculatedStat, unit, "calculateArmorAfterEffect", Target.UNIT);
        calculatedStat = applyEffects(calculatedStat, target,  "calculateArmorAfterEffect", Target.ENEMY);
        return calculatedStat;
    }

    private double applyEffects(double stat, Unit unit, String methodToInvoke, Target target) {
        List<SkillsEffect> skillsEffectsList =  unit.getSkillsList().stream()
                .filter(skills -> skills != null)
                .map(skills -> skillsFactory.create(skills))
                .filter(skillsEffect -> skillsEffect.getTarget() == target)
                .collect(Collectors.toList());
        double calculatedStat = stat;
        for (SkillsEffect skillEffect: skillsEffectsList){
            Method foundMethod=  Arrays.asList(ReflectionUtils.getAllDeclaredMethods(SkillsEffect.class)).stream().filter(
                    method -> method.getName().equals(methodToInvoke)
            ).findFirst().orElseThrow();
            calculatedStat = (double )ReflectionUtils.invokeMethod(foundMethod, skillEffect, stat);
        }
        return calculatedStat;
    }
}
