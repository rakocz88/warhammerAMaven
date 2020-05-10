package com.pilaf.warhammer.skills;

import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;
import com.pilaf.warhammer.combat.skills.SkillsFactory;
import com.pilaf.warhammer.combat.skills.SkillsModifierHelper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class SkillsModifierHelperTest {

    SkillsFactory skillsFactory = new SkillsFactory();
    SkillsModifierHelper skillsModifierHelper = new SkillsModifierHelper(skillsFactory);

    @Test
    void shouldFrenzyIncreaseUnitAttack(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.FRENZY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int attackEffect = (int) Math.round(skillsModifierHelper.calculateAttackAfterEffect(100, unit1, unit2));
        assertThat(attackEffect).isEqualTo(108);
    }


    @Test
    void shouldFrenzyIncreaseDamage(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.FRENZY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int damageEffect = (int) Math.round(skillsModifierHelper.calculateDamageAfterEffect(100, unit1, unit2));
        assertThat(damageEffect).isEqualTo(115);
    }

    @Test
    void shouldFrenzyIncreaseChargeBonus(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.FRENZY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int chargeEffect = (int) Math.round(skillsModifierHelper.calculateChargeAfterEffect(100, unit1, unit2));
        assertThat(chargeEffect).isEqualTo(108);
    }

    @Test
    void shouldEnemyPoisonDecreaseDamage(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.POISON_ATTACK)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int damage = (int) Math.round(skillsModifierHelper.calculateDamageAfterEffect(100, unit1, unit2));
        assertThat(damage).isEqualTo(80);
    }

    @Test
    void shouldDecreaseDefence2(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.MADNESS_OF_KHAINE)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int defence = (int) Math.round(skillsModifierHelper.calculateDefenceAfterEffect(100, unit2, unit1));
        assertThat(defence).isEqualTo(90);
    }

    @Test
    void shouldSkillsStack(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.FRENZY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.POISON_ATTACK)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int damage = (int) Math.round(skillsModifierHelper.calculateDamageAfterEffect(100, unit1, unit2));
        assertThat(damage).isEqualTo(92);
    }

}
