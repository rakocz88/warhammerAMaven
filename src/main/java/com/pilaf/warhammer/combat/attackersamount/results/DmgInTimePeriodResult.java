package com.pilaf.warhammer.combat.attackersamount.results;

import com.pilaf.warhammer.combat.Unit;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class DmgInTimePeriodResult {

    Unit unit1;
    Unit unit2;
    List<Integer> unit1HealthAfterNextPeriods = new ArrayList<>();
    List<Integer> unit2HealthAfterNextPeriods = new ArrayList<>();

    DmgInTimePeriodResult(Unit unit1, Unit unit2) {
        this.unit1 = unit1;
        this.unit2 = unit2;
    }

    void addHealthInTimePeriodsForUnit1(Integer ... args){
        unit1HealthAfterNextPeriods.addAll(Arrays.asList(args));
    }

    void addHealthInTimePeriodsForUnit2(Integer ... args){
        unit2HealthAfterNextPeriods.addAll(Arrays.asList(args));
    }

    public void showDmgInSecondPeriods() {

    }


}
