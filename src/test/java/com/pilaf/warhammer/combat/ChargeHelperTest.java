package com.pilaf.warhammer.combat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ChargeHelperTest {

    @Mock
    private CombatConfig combatConfig;

    @InjectMocks
    private ChargeHelper chargeHelper;

    @Test
    void chargeTest1(){
        // aaa12
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().damage(100).apDamage(100).chargeBonus(15).attack(100).skillsList(new ArrayList<>()).build();
        Unit unit2 = Unit.builder().skillsList(new ArrayList<>()).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(4);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(8);
    }

    @Test
    void chargeTest2(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().damage(100).apDamage(100).chargeBonus(60).attack(100).skillsList(new ArrayList<>()).build();
        Unit unit2 = Unit.builder().skillsList(new ArrayList<>()).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(16);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(32);
    }

    @Test
    void chargeTest3(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.STANDARD);
        Unit unit1 = Unit.builder().damage(100).apDamage(100).chargeBonus(60).attack(100).skillsList(new ArrayList<>()).build();
        Unit unit2 = Unit.builder().skillsList(new ArrayList<>()).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(8);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(16);
    }

    @Test
    void chargeAbsorbTest1(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().size(Size.SMALL).damage(100).apDamage(100).chargeBonus(60).attack(100).skillsList(new ArrayList<>()).build();
        Unit unit2 = Unit.builder().skillsList(Collections.singletonList(Skills.CHARGE_DEFENCE_EXPERT)).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(0);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(0);

    }

    @Test
    void chargeAbsorbTest2(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().size(Size.SMALL).damage(100).apDamage(100).chargeBonus(60).attack(100)
                .skillsList(Collections.singletonList(Skills.CHARGE_DEFENCE_EXPERT)).build();
        Unit unit2 = Unit.builder().skillsList(Collections.emptyList()).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(0);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(0);
    }

    @Test
    void chargeAbsorbTest3(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().size(Size.LARGE).damage(100).apDamage(100).chargeBonus(60).attack(100)
                .skillsList(Collections.singletonList(Skills.CHARGE_DEFENCE_EXPERT)).build();
        Unit unit2 = Unit.builder().skillsList(Collections.singletonList(Skills.CHARGE_DEFENCE_AGAINST_LARGE)).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(0);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(0);
    }

    @Test
    void chargeAbsorbTest4(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().size(Size.SMALL).damage(100).apDamage(100).chargeBonus(60).attack(100)
                .skillsList(Collections.emptyList()).build();
        Unit unit2 = Unit.builder().skillsList(Collections.singletonList(Skills.CHARGE_DEFENCE_AGAINST_LARGE)).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(16);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(32);
    }

    @Test
    void shouldNotCalculateChargeBonusIfTargetIsFlyingAndUnitIsNot(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().size(Size.SMALL).damage(100).apDamage(100).chargeBonus(60).attack(100)
                .skillsList(Collections.emptyList()).build();
        Unit unit2 = Unit.builder().skillsList(Collections.singletonList(Skills.FLYING)).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(0);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(0);
    }

    @Test
    void shouldCalculateChargeBonusIfTargetIsFlyingAndUnitIsFlying(){
        when(combatConfig.getChargeStatus()).thenReturn(ChargeStatus.CYCLE);
        Unit unit1 = Unit.builder().size(Size.SMALL).damage(100).apDamage(100).chargeBonus(60).attack(100)
                .skillsList(Collections.singletonList(Skills.FLYING)).build();
        Unit unit2 = Unit.builder().skillsList(Collections.singletonList(Skills.FLYING)).build();
        double result = Math.round(chargeHelper.calculateBonusDamage(100, unit1, unit2));
        assertThat(result).isEqualTo(16);
        double resultAttack = Math.round(chargeHelper.calculateBonusAttack(unit1, unit2));
        assertThat(resultAttack).isEqualTo(32);
    }
}
