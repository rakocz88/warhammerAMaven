package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.unitstore.*;

import java.util.Arrays;
import java.util.List;

public class R120x120 implements RXxX {

    @Override
    public boolean doubleCheck() {
        return true;
    }

    public List<DmgInTimePeriodResult> getResults(){
        DmgInTimePeriodResult peasentMobGoblins = new DmgInTimePeriodResult(BretoniaUnitStore.PeasantMob(), GreenskinsUnitStore.Goblins());
        peasentMobGoblins.addHealthInTimePeriodsForUnit1(6480, 5156, 4574, 4103, 3525);
        peasentMobGoblins.addHealthInTimePeriodsForUnit2(6720, 6130, 5916, 5725, 5443);
        DmgInTimePeriodResult goblinSkinks = new DmgInTimePeriodResult(GreenskinsUnitStore.Goblins(), LizadrmenUnitStore.SkinkCohort());
        goblinSkinks.addHealthInTimePeriodsForUnit1(6720, 5903, 5606, 5246, 5011, 4747, 4523, 4226, 3981, 3734, 3464, 3193, 2901, 2547, 2301);
        goblinSkinks.addHealthInTimePeriodsForUnit2(6000, 4899, 4522, 4222, 3840, 3567, 3296, 2921, 2641, 2355, 2142, 1869, 1547, 1390, 1168);
        return Arrays.asList(peasentMobGoblins, goblinSkinks);
    }
}
