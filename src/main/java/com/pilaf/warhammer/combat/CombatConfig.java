package com.pilaf.warhammer.combat;


import lombok.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Value
public class CombatConfig {

    private ChargeStatus chargeStatus;
    private List<DisciplineModifier> disciplineModifierList;
}
