package com.pilaf.warhammer.combat;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CombatWithReport {

    private final EfficiencyService efficiencyService;
    private final CombatConfig combatConfig;
    private List<Unit> unitToCompare;
    private List<Unit> unitsToCompareTo;


//    public CombatWithReport(List<Unit> unitToCompare,
//            List<Unit> unitsToCompareTo)
//    {
//        this.unitToCompare = unitToCompare;
//        this.unitsToCompareTo = unitsToCompareTo;
//    }


    public List<Report> report(){
        List<Report> reports = new ArrayList<>();
        List<Unit> unitsToCompare = this.unitToCompare;
        List<Unit> unitsToCompareTo = this.unitsToCompareTo;
        for (Unit unitToCompare: unitsToCompare){
            for (Unit unitToCompareTo: unitsToCompareTo){
                reports.add(efficiencyService.calculateEfficiency(unitToCompare, unitToCompareTo));
            }
        }
        return reports;
    }

    public void init(List<Unit> unitToCompare, List<Unit> unitsToCompareTo) {
        this.unitToCompare = unitToCompare;
        this.unitsToCompareTo = unitsToCompareTo;
    }
}
