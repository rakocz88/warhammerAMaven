package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.*;
import com.pilaf.warhammer.unitstore.DarkElvenUnitStore;
import com.pilaf.warhammer.unitstore.DwarfsUnitStore;
import com.pilaf.warhammer.unitstore.EmpireUnitStore;
import com.pilaf.warhammer.unitstore.GreenskinsUnitStore;
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
        listA.addAll(DwarfsUnitStore.all());
//        listA.add(EmpireUnitStore.test());
//        listB.add(EmpireUnitStore.test());
//        listB.addAll(DarkElvenUnitStore.all());
        listB.addAll(GreenskinsUnitStore.all());
        combatWithReport.init(
               listA,
               listB
        );
//        combatWithReport.init(
//                Collections.singletonList(EmpireUnitStore.),
//                Collections.singletonList(EmpireUnitStore.test()));
        List<Report> reports = combatWithReport.report();
        reports.stream().forEach(report -> System.out.println(report));
    }
}
