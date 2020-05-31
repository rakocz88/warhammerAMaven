package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CombinedStore {

    public static List<Unit> all() {
        List<Unit> list = new ArrayList();
        list.addAll(BeastmanUnitStore.all());
        list.addAll(BretoniaUnitStore.all());
        list.addAll(DarkElvenUnitStore.all());
        list.addAll(DwarfsUnitStore.all());
        list.addAll(EmpireUnitStore.all());
        list.addAll(GreenskinsUnitStore.all());
        list.addAll(HighElvesUnitStore.all());
        list.addAll(LizadrmenUnitStore.all());
        list.addAll(NorskaUnitStore.all());
        list.addAll(SkavenUnitStore.all());
        list.addAll(TombKingsUnitStore.all());
        list.addAll(VampireCoastUnitStore.all());
        list.addAll(VampireUnitStore.all());
        list.addAll(WarriorsOfChaosUnitStore.all());
        list.addAll(WoodElfsUnitStore.all());
        return list;
    }

    // cheapest unit for every faction. Gold must be 200 or less
    public static List<Unit> superCheapUnits(){
        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
        System.out.println(unitsUnder);
        return unitsUnder;
    }

//    // basic combat units for every faction.
//    public static List<Unit> superCheapUnits(){
//        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
//        System.out.println(unitsUnder);
//        return unitsUnder;
//    }
//
//    // basic anti infantry unit for every faction.
//    public static List<Unit> superCheapUnits(){
//        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
//        System.out.println(unitsUnder);
//        return unitsUnder;
//    }
//
//    // middle combat unit for every faction.
//    public static List<Unit> superCheapUnits(){
//        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
//        System.out.println(unitsUnder);
//        return unitsUnder;
//    }
}
