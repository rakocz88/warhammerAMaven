package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.unitstore.DwarfsUnitStore;
import com.pilaf.warhammer.unitstore.GreenskinsUnitStore;
import com.pilaf.warhammer.unitstore.LizadrmenUnitStore;
import com.pilaf.warhammer.unitstore.WoodElfsUnitStore;

import java.util.Arrays;
import java.util.List;

public class R120x75 implements RXxX {
    @Override
    public List<DmgInTimePeriodResult> getResults() {
        DmgInTimePeriodResult dmgInTimePeriodResult1 = new DmgInTimePeriodResult(LizadrmenUnitStore.SkinkCohort(), DwarfsUnitStore.Miners());
        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit1(6000,5597,5266,4955,4622,4294,4026,3778,3573,3370,3178,2970,2671,2501,2326,2203,2057,1943,1880);
        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit2(5700,5036,4771,4470,4284,4052,3944,3642,3417,3255,3007,2844,2573,2414,2218,1948,1628,1415,1225);
        DmgInTimePeriodResult dmgInTimePeriodResult2 = new DmgInTimePeriodResult(GreenskinsUnitStore.Goblins(), WoodElfsUnitStore.EternalGuard());
        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit1(6720,6083,5829,5523,5297,5098,4889,4594,4401,4189,4006,3859,3754,3597,3301,3156,2993,2710,2456,2291,2133,2018,1817,1660);
        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit2(5400,4680,4413,4223,4063,3848,3703,3485,3187,2988,2796,2606,2582,2360,2219,1950,1786,1710,1509,1342,1167,1050,897,769);
        return Arrays.asList(dmgInTimePeriodResult1, dmgInTimePeriodResult2);
    }
}
