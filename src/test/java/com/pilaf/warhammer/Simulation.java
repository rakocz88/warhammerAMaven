package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.ChargeStatus;
import com.pilaf.warhammer.combat.CombatConfig;
import com.pilaf.warhammer.combat.CombatWithReport;
import com.pilaf.warhammer.combat.Report;
import com.pilaf.warhammer.unitstore.DarkElvenUnitStore;
import com.pilaf.warhammer.unitstore.EmpireUnitStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;

@SpringBootTest(classes = {WarhammerTwAnalizeApplication.class})
@ExtendWith(SpringExtension.class)
public class Simulation {

    @Autowired
    private CombatWithReport combatWithReport;

    @Test
    void simulation1(){
        combatWithReport.init(
                EmpireUnitStore.all(),
                DarkElvenUnitStore.all()


        );
//        combatWithReport.init(
//                Collections.singletonList(EmpireUnitStore.),
//                Collections.singletonList(EmpireUnitStore.test()));
        List<Report> reports =  combatWithReport.report();
        reports.stream().forEach(report -> System.out.println(report));
    }
}
