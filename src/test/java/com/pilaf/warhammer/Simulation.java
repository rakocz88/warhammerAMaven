package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.*;
import com.pilaf.warhammer.unitstore.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest(classes = {WarhammerTwAnalizeApplication.class})
@ExtendWith(SpringExtension.class)
public class Simulation {

    @Autowired
    private CombatWithReport combatWithReport;

    @Test
    void simulation1() {
        List<Unit> listA = new ArrayList<>();
        List<Unit> listB = new ArrayList<>();
//        listA.add(LizadrmenUnitStore.SaurusWarriors()); //       7 7 6 6 1 1 8 8 9 10 =63
//        listA.add(DwarfsUnitStore.DwarfWarriors()); //           6 6 1 4 0 0 8 8 6 9 = 48
//        listA.add(GreenskinsUnitStore.OrcBoyz()); //             5 5 1 2 0 0 8 8 5 9 = 43
//        listA.add(WarriorsOfChaosUnitStore.ChaosMarauders()); // 3 4 0 2 0 0 8 8 5 9 = 39
//        listA.add(EmpireUnitStore.Swordsman()); //               2 3 0 1 0 0 8 8 4 7 = 33
//        listA.add(DarkElvenUnitStore.Bleakswords()); //          1 2 0 1 0 0 8 8 4 7 = 31
//        listA.add(HighElvesUnitStore.Rangers()); //              4 1 1 1 0 0 8 6 4 4 = 29
//        listA.add(BretoniaUnitStore.SpearmenAtArmsShields()); // 0 0 0 0 0 0 2 1 3 7 = 13
        combatWithReport.init(
               listA,
               listB
        );
        listB.add(DwarfsUnitStore.Slayers());
        listB.add(GreenskinsUnitStore.SavageOrcBoarBoyz());
        listB.add(WarriorsOfChaosUnitStore.ChaosKnights());
        listB.add(WarriorsOfChaosUnitStore.ChaosSpawn());
        listB.add(DarkElvenUnitStore.DarkRiders());
        listB.add(DarkElvenUnitStore.ColdOneKnights());
        listB.add(EmpireUnitStore.DemigryphKnights());
        listB.add(EmpireUnitStore.EmpireKnights());
        listB.add(HighElvesUnitStore.WarLionsOfChrace());
        listB.add(HighElvesUnitStore.EllyrianReavers());
        listB.add(LizadrmenUnitStore.FeralColdOnes());
        listB.add(BretoniaUnitStore.MountedYeomen());
        listB.add(BretoniaUnitStore.QuestingKnights());
//        combatWithReport.init(
//                Collections.singletonList(EmpireUnitStore.),
//                Collections.singletonList(EmpireUnitStore.test()));
        List<Report> reports = combatWithReport.report();
        reports.stream().forEach(report -> System.out.println(report.printReport(false)));
        int won = reports.stream().filter(report -> report.getOverallScore().compareTo(BigDecimal.ONE) >=1).collect(Collectors.toList()).size();
        int wonGold = reports.stream().filter(report -> report.getEfficiencyGold().compareTo(BigDecimal.ONE) >=1).collect(Collectors.toList()).size();
        System.out.println("won: " + won + " gold : " + wonGold);
    }
}
