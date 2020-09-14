package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.unitstore.*;

import java.util.Arrays;
import java.util.List;

public class R120x60 implements RXxX {
    @Override
    public List<DmgInTimePeriodResult> getResults() {
       DmgInTimePeriodResult dmgInTimePeriodResult = new DmgInTimePeriodResult(LizadrmenUnitStore.SkinkCohort(), SkavenUnitStore.StormverminSwordAndShield());
       dmgInTimePeriodResult.addHealthInTimePeriodsForUnit1(6000,4060,3343);
       dmgInTimePeriodResult.addHealthInTimePeriodsForUnit2(7860,7739,7697);
       DmgInTimePeriodResult dmgInTimePeriodResult1 = new DmgInTimePeriodResult(SkavenUnitStore.StormverminSwordAndShield(), WarriorsOfChaosUnitStore.Chosen());
//       dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit1(7440,6348,5928,5594,5251,5012,4618,4399,4084,3713,3421,3162,2859,2236);
//       dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit2(7860,7496,7279,7102,6930,6778,6569,6371,6257,6108,5895,5625,5480,5291);
       DmgInTimePeriodResult dmgInTimePeriodResult2 = new DmgInTimePeriodResult(SkavenUnitStore.StormverminSwordAndShield(), DwarfsUnitStore.Slayers());
       dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit1(7440,6166,5839,5433,5148);
       dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit2(6480,4183,3370,2525,1875);
        DmgInTimePeriodResult dmgInTimePeriodResult4 = new DmgInTimePeriodResult(SkavenUnitStore.ClanratSpearsShields(), DwarfsUnitStore.Slayers());
        dmgInTimePeriodResult4.addHealthInTimePeriodsForUnit1(7200, 4865, 4254, 3769);
        dmgInTimePeriodResult4.addHealthInTimePeriodsForUnit2(6480, 5925, 5584, 5336);
        DmgInTimePeriodResult dmgInTimePeriodResult5 = new DmgInTimePeriodResult(SkavenUnitStore.ClanratSpearsShields(), DwarfsUnitStore.Slayers());
        dmgInTimePeriodResult5.addHealthInTimePeriodsForUnit1(7200, 5229, 4675, 3945, 3561, 2840);
        dmgInTimePeriodResult5.addHealthInTimePeriodsForUnit2(6480, 5694, 5376, 5231, 4983, 4661);
        DmgInTimePeriodResult dmgInTimePeriodResult6 = new DmgInTimePeriodResult(SkavenUnitStore.ClanratSpearsShields(), DwarfsUnitStore.Slayers());
        dmgInTimePeriodResult6.addHealthInTimePeriodsForUnit1(7200, 5036, 4446, 3901);
        dmgInTimePeriodResult6.addHealthInTimePeriodsForUnit2(6480, 5851, 5326, 4986);
        DmgInTimePeriodResult dmgInTimePeriodResult7 = new DmgInTimePeriodResult(SkavenUnitStore.ClanratSpearsShields(), DwarfsUnitStore.Slayers());
        dmgInTimePeriodResult7.addHealthInTimePeriodsForUnit1(7200, 5089,4355,3654);
        dmgInTimePeriodResult7.addHealthInTimePeriodsForUnit2(6480,5932,5591,5254);
        DmgInTimePeriodResult dmgInTimePeriodResult8 = new DmgInTimePeriodResult(GreenskinsUnitStore.Goblins(), DwarfsUnitStore.Slayers());
        dmgInTimePeriodResult8.addHealthInTimePeriodsForUnit1(6720, 4665, 3795);
        dmgInTimePeriodResult8.addHealthInTimePeriodsForUnit2(6480, 5512, 5246);
        DmgInTimePeriodResult dmgInTimePeriodResult9 = new DmgInTimePeriodResult(GreenskinsUnitStore.Goblins(), DwarfsUnitStore.Slayers());
        dmgInTimePeriodResult9.addHealthInTimePeriodsForUnit1(6720,4214,3407);
        dmgInTimePeriodResult9.addHealthInTimePeriodsForUnit2(6480,5275,4912);
       return Arrays.asList(dmgInTimePeriodResult4, dmgInTimePeriodResult5, dmgInTimePeriodResult6, dmgInTimePeriodResult7,
               dmgInTimePeriodResult8, dmgInTimePeriodResult9);
    }
}
