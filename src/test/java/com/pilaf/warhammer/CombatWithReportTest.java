package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.CombatWithReport;
import org.junit.jupiter.api.Test;

public class CombatWithReportTest {


    @Test
    void test1(){
        CombatWithReport combatWithReport = new CombatWithReport();
        combatWithReport.report();
    }
}
