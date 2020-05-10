package com.pilaf.warhammer.combat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DisciplineHelperTest {

    @Mock
    private CombatConfig combatConfig;

    @InjectMocks
    private DisciplineHelper disciplineHelper;

    @Test
    void shouldCalculateDamage(){
        when(combatConfig.getDisciplineModifierList()).thenReturn(Collections.EMPTY_LIST);
        Unit unit = Unit.builder().hitPointsPerUnit(10).unitAmount(10).leadership(50).build();
        int result = disciplineHelper.calculateDamageToHitToLoseDiscipline(unit);
        assertThat(result).isEqualTo(60);
    }

    @Test
    void shouldCalculateDamage_2(){
        when(combatConfig.getDisciplineModifierList()).thenReturn(Collections.EMPTY_LIST);
        Unit unit = Unit.builder().hitPointsPerUnit(10).unitAmount(10).leadership(20).build();
        int result = disciplineHelper.calculateDamageToHitToLoseDiscipline(unit);
        assertThat(result).isEqualTo(30);
    }
}
