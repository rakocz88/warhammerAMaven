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
        listA.add(NorskaUnitStore.FimirWarriorsGreatWeapons());

        listB.add(EmpireUnitStore.DemigryphKnightsHalberds());
        combatWithReport.init(
               listA,
               listB
        );
        List<Report> reports = combatWithReport.report();
        reports.stream().forEach(report -> System.out.println(report.printReport(false)));
        int won = reports.stream().filter(report -> report.getOverallScore().compareTo(BigDecimal.ONE) >=1).collect(Collectors.toList()).size();
        int wonGold = reports.stream().filter(report -> report.getEfficiencyGold().compareTo(BigDecimal.ONE) >=1).collect(Collectors.toList()).size();
        System.out.println("won: " + won + " gold : " + wonGold);
    }

    @Test
    void simulation2(){
        CombinedStore.superCheapUnits();
    }
}
