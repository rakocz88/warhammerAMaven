package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.combat.attackersamount.AttackersAmountService;
import com.pilaf.warhammer.unitstore.BretoniaUnitStore;
import com.pilaf.warhammer.unitstore.DarkElvenUnitStore;
import com.pilaf.warhammer.unitstore.EmpireUnitStore;
import com.pilaf.warhammer.unitstore.WarriorsOfChaosUnitStore;

import java.util.Arrays;
import java.util.List;

public class R90x90 implements RXxX {

    @Override
    public boolean doubleCheck() {
        return true;
    }

    @Override
    public List<DmgInTimePeriodResult> getResults() {
        return null;
    }
}
