package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.*;
import com.pilaf.warhammer.unitstore.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
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

        List<Unit> listA = new ArrayList<>();
        List<Unit> listB = new ArrayList<>();
        listA.addAll(prepareListA());
        listB.addAll(prepareListB());
        combatWithReport.init(
                listA,
                listB
        );
        List<Report> reports = combatWithReport.report();
        reports.stream().forEach(report -> System.out.println(report.printReport(false)));
        int won = reports.stream().filter(report -> report.getOverallScore().compareTo(BigDecimal.ONE) >=1).collect(Collectors.toList()).size();
        int wonGold = reports.stream().filter(report -> report.getEfficiencyGold().compareTo(BigDecimal.ONE) >=1).collect(Collectors.toList()).size();
        BigDecimal offensiveRatting = reports.stream().map(Report::getAttackEfficiency).reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(reports.size()), 2, RoundingMode.HALF_UP);
        BigDecimal defensiveRatting = reports.stream().map(Report::getDefenceEfficiency).reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(reports.size()), 2, RoundingMode.HALF_UP);
        BigDecimal overallRatting = reports.stream().map(Report::getOverallScore).reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(reports.size()), 2, RoundingMode.HALF_UP);
        BigDecimal goldEfficiencyRatting = reports.stream().map(Report::getEfficiencyGold).reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(reports.size()), 2, RoundingMode.HALF_UP);
        System.out.println("won: " + won + " gold : " + wonGold);
        System.out.println("Attack ratting: " + (offensiveRatting));
        System.out.println("Defence ratting: " + defensiveRatting);
        System.out.println("Overall ratting: " + overallRatting);
        System.out.println("Gold ratting: " + goldEfficiencyRatting);
    }

    private List<Unit> prepareListA() {
        List<Unit> unitsUnder =new ArrayList<>();
        // BEASTMAN
//        unitsUnder.add(BeastmanUnitStore.UngorHerd());
//        // BRETONIA
//        unitsUnder.add(BretoniaUnitStore.MenAtArms());
//        unitsUnder.add(BretoniaUnitStore.MenAtArmsShields());
//        // DARK ELVES
//        unitsUnder.add(DarkElvenUnitStore.Bleakswords());
//        // DWARF
//        unitsUnder.add(DwarfsUnitStore.DwarfWarriors());
//        unitsUnder.add(DwarfsUnitStore.DwarfWarriorsGreatWeapons());
//        // EMPIRE
//        unitsUnder.add(EmpireUnitStore.Swordsman());
//        // GREENSKINS
//        unitsUnder.add(GreenskinsUnitStore.OrcBoyz());
//        unitsUnder.add(GreenskinsUnitStore.NightGoblins());
//        unitsUnder.add(GreenskinsUnitStore.NastySkulkers());
//        unitsUnder.add(GreenskinsUnitStore.SavageOrcs());
//        // HIGH ELF
//        unitsUnder.add(HighElvesUnitStore.Rangers());
//        // LIZARDMEN
//        unitsUnder.add(LizadrmenUnitStore.SaurusWarriors());
//        // NORSKA
//        unitsUnder.add(NorskaUnitStore.Marauders());
//        unitsUnder.add(NorskaUnitStore.MaraudersGreatWeapons());
//        // SKAVEN
//        unitsUnder.add(SkavenUnitStore.Clanrats());
//        unitsUnder.add(SkavenUnitStore.ClanratsShields());
//        // TOMB KINGS
//        unitsUnder.add(TombKingsUnitStore.SkeletonWarriors());
//        // VAMPIRE COAST
//        unitsUnder.add(VampireCoastUnitStore.ZombiePirateDeckhandsMob());
//        // VAMPIRES
//        unitsUnder.add(VampireUnitStore.SkeletonWarriors());
//        // WARRIORS OF CHAOS
//        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosMarauders());
//        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosMaraudersGreatWeapons());
//        // WOOD ELF
        return unitsUnder;
    }

    private List<Unit> prepareListB() {
        return CombinedStore.cheapUnits();
    }


}
