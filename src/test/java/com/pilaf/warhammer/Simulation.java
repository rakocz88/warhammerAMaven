package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.*;
import com.pilaf.warhammer.unitstore.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest(classes = {WarhammerTwAnalizeApplication.class})
@ExtendWith(SpringExtension.class)
public class Simulation {

    @Autowired
    private CombatWithReport combatWithReport;

    @Test
    void simulation1() {
        List<Unit> listA = new ArrayList<>();
        List<Unit> listB = new ArrayList<>();
//        listA.add(EmpireUnitStore.test());
//        listB.add(EmpireUnitStore.test());
        listA.addAll(BretoniaUnitStore.all());
//        listA.add(EmpireUnitStore.test());
//        listB.add(EmpireUnitStore.test());
//        listB.addAll(DarkElvenUnitStore.all());
//        listB.add(DarkElvenUnitStore.Dreadspears());
//        listB.add(DarkElvenUnitStore.ColdOneDreadKnights());
        listB.addAll(WarriorsOfChaosUnitStore.all());
//        listB.addAll(DwarfsUnitStore.all());
//        listB.addAll(GreenskinsUnitStore.all());
        combatWithReport.init(
               listA,
               listB
        );
//        combatWithReport.init(
//                Collections.singletonList(EmpireUnitStore.),
//                Collections.singletonList(EmpireUnitStore.test()));
        List<Report> reports = combatWithReport.report();
        reports.stream().forEach(report -> System.out.println(report.printReport(false)));
    }
}
