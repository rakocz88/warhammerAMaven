package com.pilaf.warhammer.combat;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class UnitSizeAttackHelperTest {

    private UnitSizeAttackHelper unitSizeAttackHelper = new UnitSizeAttackHelper();

    @Test
    void shouldReturnForArmy120(){
        Unit unit = Unit.builder().unitAmount(120).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(1.2).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void shouldReturnForArmy90(){
        Unit unit = Unit.builder().unitAmount(90).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(1.1).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void shouldReturnForArmy75(){
        Unit unit = Unit.builder().unitAmount(75).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(1.05).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void shouldReturnForArmy60(){
        Unit unit = Unit.builder().unitAmount(60).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(1).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void shouldReturnForArmy36(){
        Unit unit = Unit.builder().unitAmount(36).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(0.92).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void shouldReturnForArmy24(){
        Unit unit = Unit.builder().unitAmount(24).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(0.92).setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    void shouldReturnForArmy12(){
        Unit unit = Unit.builder().unitAmount(12).build();
        BigDecimal result = unitSizeAttackHelper.calculateUnitAmountSizeBonus(unit, null);
        assertThat(result).isEqualTo(BigDecimal.valueOf(0.76).setScale(2, RoundingMode.HALF_UP));
    }

}
