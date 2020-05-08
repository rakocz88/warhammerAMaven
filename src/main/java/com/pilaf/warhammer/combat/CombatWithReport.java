package com.pilaf.warhammer.combat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombatWithReport {

    EfficiencyService efficiencyService = new EfficiencyService();

    public List<Report> report(){
        List<Report> reports = new ArrayList<>();
        List<Unit> unitsToCompare = getUnitsToCompare();
        List<Unit> unitsToCompareTo = getUnitsToCompareTo();
        for (Unit unitToCompare: unitsToCompare){
            for (Unit unitToCompareTo: unitsToCompareTo){
                reports.add(efficiencyService.calculateEfficiency(unitToCompare, unitToCompareTo));
            }
        }
        reports.forEach(report -> System.out.println(report));
        return reports;
    }

    private List<Unit> getUnitsToCompare() {
        return Arrays.asList(
                UnitStore.Spearmens()
        );
    }

    private List<Unit> getUnitsToCompareTo() {
        return Arrays.asList(
                UnitStore.Spearmens()
        );
    }



}
