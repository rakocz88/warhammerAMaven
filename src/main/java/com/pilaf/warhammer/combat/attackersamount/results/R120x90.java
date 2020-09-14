package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.unitstore.*;

import java.util.Arrays;
import java.util.List;

public class R120x90 implements RXxX {
    @Override
    public List<DmgInTimePeriodResult> getResults() {
        DmgInTimePeriodResult dmgInTimePeriodResult01 = new DmgInTimePeriodResult(GreenskinsUnitStore.Goblins(), EmpireUnitStore.Swordsman());
        dmgInTimePeriodResult01.addHealthInTimePeriodsForUnit1(6720, 5815, 5469, 5274, 5003, 4621, 4246, 3908, 3477, 3176, 2921, 2558, 2263, 1938);
        dmgInTimePeriodResult01.addHealthInTimePeriodsForUnit2(6210, 5685, 5227, 4882, 4686, 4380, 4136, 3918, 3694, 3525, 3299, 3132, 3009, 2752);
        DmgInTimePeriodResult dmgInTimePeriodResult02 = new DmgInTimePeriodResult(LizadrmenUnitStore.SkinkCohort(), DarkElvenUnitStore.Dreadspears());
        dmgInTimePeriodResult02.addHealthInTimePeriodsForUnit1(6000, 5391, 5002, 4694, 4249, 3981, 3592, 3331, 2993, 2684, 2379, 2080, 1799, 1430);
        dmgInTimePeriodResult02.addHealthInTimePeriodsForUnit2(5670, 5204, 4910, 4761, 4641, 4565, 4374, 4286, 4139, 4005, 3942, 3839, 3672, 3459);
        DmgInTimePeriodResult dmgInTimePeriodResult1 = new DmgInTimePeriodResult(SkavenUnitStore.ClanratSpearsShields(), EmpireUnitStore.Swordsman());
        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit1(7200,5290,5981,5568,5271,4918,4566,4262,3898,3480,3217,2965);
        dmgInTimePeriodResult1.addHealthInTimePeriodsForUnit2(6210,5847,5532,5335,5150,5005,4744,4560,4393,4150,3932,3717);
        DmgInTimePeriodResult dmgInTimePeriodResult2 = new DmgInTimePeriodResult(SkavenUnitStore.ClanratSpearsShields(), EmpireUnitStore.Swordsman());
        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit1(7200,6058,5612,5292,4932,4705,4451,4192,3978,3631,3181,2866);
        dmgInTimePeriodResult2.addHealthInTimePeriodsForUnit2(6210,5853,5635,5419,5162,4881,4644,4438,4197,3987,3852,3626);
        DmgInTimePeriodResult dmgInTimePeriodResult3 = new DmgInTimePeriodResult(GreenskinsUnitStore.Goblins(), EmpireUnitStore.Swordsman());
        dmgInTimePeriodResult3.addHealthInTimePeriodsForUnit1(5720,5870,5587,5266,4954,4575,4225,3916,3588,3209,2907,2667);
        dmgInTimePeriodResult3.addHealthInTimePeriodsForUnit2(6210,5455,5185,4795,4488,4257,4011,3722,3479,3319,3114,3002);
        DmgInTimePeriodResult dmgInTimePeriodResult4 = new DmgInTimePeriodResult(SkavenUnitStore.StormverminSwordAndShield(), EmpireUnitStore.Greatswords());
        dmgInTimePeriodResult4.addHealthInTimePeriodsForUnit1(7440,6329,5961,5562,5129,4725,4354,3927,3369,2936);
        dmgInTimePeriodResult4.addHealthInTimePeriodsForUnit2(6840,5661,5305,4933,4590,4166,3566,3193,2933,2515);
        DmgInTimePeriodResult dmgInTimePeriodResult5 = new DmgInTimePeriodResult(SkavenUnitStore.StormverminSwordAndShield(), EmpireUnitStore.Greatswords());
        dmgInTimePeriodResult5.addHealthInTimePeriodsForUnit1(7440,5976,5502,5107,4648,4306,3854,3542);
        dmgInTimePeriodResult5.addHealthInTimePeriodsForUnit2(6840,5848,5372,4967,4580,4209,3785,3308);
        return Arrays.asList(
                dmgInTimePeriodResult01, dmgInTimePeriodResult02,
                dmgInTimePeriodResult1, dmgInTimePeriodResult2, dmgInTimePeriodResult3, dmgInTimePeriodResult4,
                dmgInTimePeriodResult5
                );
    }
}
