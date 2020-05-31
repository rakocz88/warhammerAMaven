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
        assertThat(attackEffect).isEqualTo(104);
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
        assertThat(damageEffect).isEqualTo(108);
    }

    @Test
    void shouldFrenzyWorkBetterOnUnbreakableUnit(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.FRENZY, Skills.UNBREAKABLE)
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
        assertThat(chargeEffect).isEqualTo(104);
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
        assertThat(damage).isEqualTo(86);
    }

    @Test
    void shouldRowdyIncreaseUnitLeadership(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.ROWDY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit1, unit2));
        assertThat(leadership).isEqualTo(104);
    }

    @Test
    void shouldBloodgreedIncreaseUnitLeadership(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.BLOODGREED)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit1, unit2));
        assertThat(leadership).isEqualTo(115);
    }

    @Test
    void shouldCauseFearDecreaseEnemyLeadership(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_FEAR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(92);
    }

    @Test
    void shouldCauseFearNotWorkOnImmuneToPsychology(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_FEAR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.IMMUNE_TO_PSYCHOLOGY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(100);
    }

    @Test
    void shouldCauseFearNotWorkOnCauseFear(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_FEAR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_FEAR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(100);
    }

    @Test
    void shouldCauseFearNotWorkOnCauseTerror(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_FEAR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_TERROR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(100);
    }

    @Test
    void shouldCauseTerrorDecreaseEnemyLeadership(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_TERROR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(87);
    }

    @Test
    void shouldCauseTerrorNotWorkOnImmuneToPsychology(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_TERROR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.IMMUNE_TO_PSYCHOLOGY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(100);
    }

    @Test
    void shouldCauseTerrorNotWorkOnCauseTerror(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_TERROR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_TERROR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(100);
    }

    @Test
    void shouldCauseTerrorWorkOnCauseFear(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_TERROR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList(Skills.CAUSE_FEAR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit2, unit1));
        assertThat(leadership).isEqualTo(87);
    }

    @Test
    void shouldMartialProwessIncreaseAttackAndDefence(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.MARTIAL_PROWES)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int attack = (int) Math.round(skillsModifierHelper.calculateAttackAfterEffect(100, unit1, unit2));
        int defence = (int) Math.round(skillsModifierHelper.calculateDefenceAfterEffect(100, unit1, unit2));
        assertThat(attack).isEqualTo(101);
        assertThat(defence).isEqualTo(106);
    }


    @Test
    void shouldMartialMasteryIncreaseAttackAndDefence(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.MARTIAL_MASTERY)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int attack = (int) Math.round(skillsModifierHelper.calculateAttackAfterEffect(100, unit1, unit2));
        int defence = (int) Math.round(skillsModifierHelper.calculateDefenceAfterEffect(100, unit1, unit2));
        assertThat(attack).isEqualTo(104);
        assertThat(defence).isEqualTo(106);
    }

    @Test
    void shouldStrenthInNumbersIncreaseDefenceAndLeadership(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.STRENTH_IN_NUMBERS)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int defence = (int) Math.round(skillsModifierHelper.calculateDefenceAfterEffect(100, unit1, unit2));
        int leadership = (int) Math.round(skillsModifierHelper.calculateLeadershipAfterEffect(100, unit1, unit2));
        assertThat(defence).isEqualTo(104);
        assertThat(leadership).isEqualTo(103);
    }

    @Test
    void shouldCharmedDecreaseEnemyAttack(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.CHARMED)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int attack = (int) Math.round(skillsModifierHelper.calculateAttackAfterEffect(100, unit2, unit1));
        assertThat(attack).isEqualTo(91);
    }

    @Test
    void shouldSunderArmorDecreeaseArmor(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.SUNDER_ARMOR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).armor(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int attack = (int) Math.round(skillsModifierHelper.calculateArmorAfterEffect(100, unit2, unit1));
        assertThat(attack).isEqualTo(70);
    }

    @Test
    void shouldSunderArmorNotDecreaseArmorBellow0(){
        Unit unit1 = Unit.builder().skillsList(
                Arrays.asList(Skills.SUNDER_ARMOR)
        ).attack(100).damage(100).apDamage(100).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        Unit unit2 = Unit.builder().skillsList(
                Arrays.asList()
        ).attack(100).damage(100).apDamage(100).armor(20).hitPointsPerUnit(100).unitAmount(10).defence(100).speed(100).build();
        int attack = (int) Math.round(skillsModifierHelper.calculateArmorAfterEffect(20, unit2, unit1));
        assertThat(attack).isEqualTo(0);
    }

}
