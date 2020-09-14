package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.unitstore.*;

import java.util.Arrays;
import java.util.List;

public class R60x120 implements RXxX {
    @Override
    public List<DmgInTimePeriodResult> getResults() {
//        DmgInTimePeriodResult dmgInTimePeriodResult = new DmgInTimePeriodResult(SkavenUnitStore.StormverminSwordAndShield(), LizadrmenUnitStore.SkinkCohort());
//        dmgInTimePeriodResult.addHealthInTimePeriodsForUnit1(7860,7739,7697);
//        dmgInTimePeriodResult.addHealthInTimePeriodsForUnit2(6000,4060,3343);
//        DmgInTimePeriodResult dmgInTimePeriodResult1 = new DmgInTimePeriodResult(WarriorsOfChaosUnitStore.Chosen(), SkavenUnitStore.StormverminSwordAndShield());
////        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit1(7860,7496,7279,7102,6930,6778,6569,6371,6257,6108,5895,5625,5480,5291);
////        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit2(7440,6348,5928,5594,5251,5012,4618,4399,4084,3713,3421,3162,2859,2236);
//        DmgInTimePeriodResult dmgInTimePeriodResult2 = new DmgInTimePeriodResult( DwarfsUnitStore.Slayers(), SkavenUnitStore.StormverminSwordAndShield());
//        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit1(6480,4183,3370,2525,1875);
//        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit2(7440,6166,5839,5433,5148);
//        return Arrays.asList(dmgInTimePeriodResult, dmgInTimePeriodResult1, dmgInTimePeriodResult2);
        DmgInTimePeriodResult dmgInTimePeriodResult4 = new DmgInTimePeriodResult(DwarfsUnitStore.Slayers(), SkavenUnitStore.ClanratSpearsShields());
        dmgInTimePeriodResult4.addHealthInTimePeriodsForUnit1(6480, 5925, 5584, 5336);
        dmgInTimePeriodResult4.addHealthInTimePeriodsForUnit2(7200, 4865, 4254, 3769);

        DmgInTimePeriodResult dmgInTimePeriodResult5 = new DmgInTimePeriodResult(DwarfsUnitStore.Slayers(), SkavenUnitStore.ClanratSpearsShields());
        dmgInTimePeriodResult5.addHealthInTimePeriodsForUnit1(6480, 5694, 5376, 5231, 4983, 4661);
        dmgInTimePeriodResult5.addHealthInTimePeriodsForUnit2(7200, 5229, 4675, 3945, 3561, 2840);
        DmgInTimePeriodResult dmgInTimePeriodResult6 = new DmgInTimePeriodResult(DwarfsUnitStore.Slayers(), SkavenUnitStore.ClanratSpearsShields());
        dmgInTimePeriodResult6.addHealthInTimePeriodsForUnit1(6480, 5851, 5326, 4986);
        dmgInTimePeriodResult6.addHealthInTimePeriodsForUnit2(7200, 5036, 4446, 3901);
        DmgInTimePeriodResult dmgInTimePeriodResult7 = new DmgInTimePeriodResult(DwarfsUnitStore.Slayers(), SkavenUnitStore.ClanratSpearsShields());
        dmgInTimePeriodResult7.addHealthInTimePeriodsForUnit1(6480,5932,5591,5254);
        dmgInTimePeriodResult7.addHealthInTimePeriodsForUnit2(7200, 5089,4355,3654);
        DmgInTimePeriodResult dmgInTimePeriodResult8 = new DmgInTimePeriodResult(DwarfsUnitStore.Slayers(), GreenskinsUnitStore.Goblins());
        dmgInTimePeriodResult8.addHealthInTimePeriodsForUnit1(6480, 5512, 5246);
        dmgInTimePeriodResult8.addHealthInTimePeriodsForUnit2(6720, 4665, 3795);
        DmgInTimePeriodResult dmgInTimePeriodResult9 = new DmgInTimePeriodResult(DwarfsUnitStore.Slayers(), GreenskinsUnitStore.Goblins());
        dmgInTimePeriodResult9.addHealthInTimePeriodsForUnit1(6480,5275,4912);
        dmgInTimePeriodResult9.addHealthInTimePeriodsForUnit2(6720,4214,3407);
        return Arrays.asList(dmgInTimePeriodResult4, dmgInTimePeriodResult5, dmgInTimePeriodResult6, dmgInTimePeriodResult7,
                dmgInTimePeriodResult8, dmgInTimePeriodResult9);
    }
}
