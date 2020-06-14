package com.pilaf.warhammer.combat;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
public class CombatConfig {

    private ChargeStatus chargeStatus;
    private List<DisciplineModifier> disciplineModifierList;
    private boolean skipLeadership;
}
