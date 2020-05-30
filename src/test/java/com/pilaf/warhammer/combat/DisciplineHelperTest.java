package com.pilaf.warhammer.combat;

import com.pilaf.warhammer.combat.skills.SkillsModifierHelper;
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

    @Mock
    private SkillsModifierHelper skillsModifierHelper;

    @InjectMocks
    private DisciplineHelper disciplineHelper;

    @Test
    void shouldCalculateDamage(){

        when(combatConfig.getDisciplineModifierList()).thenReturn(Collections.EMPTY_LIST);
        Unit unit = Unit.builder().hitPointsPerUnit(10).unitAmount(10).leadership(50).skillsList(Collections.emptyList()).build();
        when(skillsModifierHelper.calculateLeadershipAfterEffect(50, unit, null)).thenReturn(50d);
        int result = disciplineHelper.calculateDamageToHitToLoseDiscipline(unit, unit);
        assertThat(result).isEqualTo(75);
    }

    @Test
    void shouldCalculateDamage_2(){
        when(combatConfig.getDisciplineModifierList()).thenReturn(Collections.EMPTY_LIST);
        Unit unit = Unit.builder().hitPointsPerUnit(10).unitAmount(10).leadership(20).skillsList(Collections.emptyList()).build();
        when(skillsModifierHelper.calculateLeadershipAfterEffect(20, unit, null)).thenReturn(20d);
        int result = disciplineHelper.calculateDamageToHitToLoseDiscipline(unit, unit);
        assertThat(result).isEqualTo(45);
    }

    @Test
    void shouldCalculateDamage_3(){

        when(combatConfig.getDisciplineModifierList()).thenReturn(Collections.EMPTY_LIST);
        Unit unit = Unit.builder().hitPointsPerUnit(10).unitAmount(10).leadership(120).skillsList(Collections.emptyList()).build();
        when(skillsModifierHelper.calculateLeadershipAfterEffect(120, unit, null)).thenReturn(120d);
        int result = disciplineHelper.calculateDamageToHitToLoseDiscipline(unit, unit);
        assertThat(result).isEqualTo(100);
    }
}
