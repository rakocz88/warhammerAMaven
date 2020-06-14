package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.unitstore.*;

import java.util.Arrays;
import java.util.List;

public class R90x120 implements RXxX {
    @Override
    public List<DmgInTimePeriodResult> getResults() {
        DmgInTimePeriodResult dmgInTimePeriodResult1 = new DmgInTimePeriodResult(EmpireUnitStore.Swordsman(), GreenskinsUnitStore.Goblins() );
        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit1(6210, 5685, 5227, 4882, 4686, 4380, 4136, 3918, 3694, 3525, 3299, 3132, 3009, 2752);
        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit2(6720, 5815, 5469, 5274, 5003, 4621, 4246, 3908, 3477, 3176, 2921, 2558, 2263, 1938);
        DmgInTimePeriodResult dmgInTimePeriodResult2 = new DmgInTimePeriodResult(DarkElvenUnitStore.Dreadspears(), LizadrmenUnitStore.SkinkCohort());
        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit1(5670, 5204, 4910, 4761, 4641, 4565, 4374, 4286, 4139, 4005, 3942, 3839, 3672, 3459);
        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit2(6000, 5391, 5002, 4694, 4249, 3981, 3592, 3331, 2993, 2684, 2379, 2080, 1799, 1430);
        return Arrays.asList(dmgInTimePeriodResult1, dmgInTimePeriodResult2);
    }
}
