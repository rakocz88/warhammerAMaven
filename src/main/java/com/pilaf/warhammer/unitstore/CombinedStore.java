package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CombinedStore {


    // BEASTMAN
    // BRETONIA
    // DARK ELVES
    // DWARF
    // EMPIRE
    // GREENSKINS
    // HIGH ELF
    // LIZARDMEN
    // NORSKA
    // SKAVEN
    // TOMB KINGS
    // VAMPIRE COAST
    // VAMPIRES
    // WARRIORS OF CHAOS
    // WOOD ELF
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
        return unitsUnder;
    }

    // cheapest infantry unit for every faction. Must be less then 350 gold and not be included into other unit stores
    public static List<Unit> cheapUnits(){

        List<Unit> unitsUnder =new ArrayList<>();
        // BEASTMAN
        unitsUnder.add(BeastmanUnitStore.UngorSpearmenHerd());
        // BRETONIA
        unitsUnder.add(BretoniaUnitStore.PeasantMob());
        // DARK ELVES
        // DWARF
        unitsUnder.add(DwarfsUnitStore.Miners());
        // EMPIRE
        unitsUnder.add(EmpireUnitStore.Spearmens());
        // GREENSKINS
        unitsUnder.add(GreenskinsUnitStore.Goblins());
        // HIGH ELF
        // LIZARDMEN
        unitsUnder.add(LizadrmenUnitStore.SkinkCohort());
        // NORSKA
        // SKAVEN
        unitsUnder.add(SkavenUnitStore.Skavenslaves());
        // TOMB KINGS
        // VAMPIRE COAST
        // VAMPIRES
        unitsUnder.add(VampireUnitStore.Zombies());
        // WARRIORS OF CHAOS
        // WOOD ELF
        return unitsUnder;
    }

    // basic infantry unit for every faction
    public static List<Unit> basicInfantryUnits(){
        List<Unit> unitsUnder =new ArrayList<>();
        // BEASTMAN
        unitsUnder.add(BeastmanUnitStore.UngorHerd());
        // BRETONIA
        unitsUnder.add(BretoniaUnitStore.MenAtArms());
        unitsUnder.add(BretoniaUnitStore.MenAtArmsShields());
        // DARK ELVES
        unitsUnder.add(DarkElvenUnitStore.Bleakswords());
        // DWARF
        unitsUnder.add(DwarfsUnitStore.DwarfWarriors());
        unitsUnder.add(DwarfsUnitStore.DwarfWarriorsGreatWeapons());
        // EMPIRE
        unitsUnder.add(EmpireUnitStore.Swordsman());
        // GREENSKINS
        unitsUnder.add(GreenskinsUnitStore.OrcBoyz());
        unitsUnder.add(GreenskinsUnitStore.NightGoblins());
        unitsUnder.add(GreenskinsUnitStore.NastySkulkers());
        unitsUnder.add(GreenskinsUnitStore.SavageOrcs());
        // HIGH ELF
        unitsUnder.add(HighElvesUnitStore.Rangers());
        // LIZARDMEN
        unitsUnder.add(LizadrmenUnitStore.SaurusWarriors());
        // NORSKA
        unitsUnder.add(NorskaUnitStore.Marauders());
        unitsUnder.add(NorskaUnitStore.MaraudersGreatWeapons());
        // SKAVEN
        unitsUnder.add(SkavenUnitStore.Clanrats());
        unitsUnder.add(SkavenUnitStore.ClanratsShields());
        // TOMB KINGS
        unitsUnder.add(TombKingsUnitStore.SkeletonWarriors());
        // VAMPIRE COAST
        unitsUnder.add(VampireCoastUnitStore.ZombiePirateDeckhandsMob());
        // VAMPIRES
        unitsUnder.add(VampireUnitStore.SkeletonWarriors());
        // WARRIORS OF CHAOS
        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosMarauders());
        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosMaraudersGreatWeapons());
        // WOOD ELF
        return unitsUnder;
    }


    //  non elite anti large infantry unit  (mostly with shields)
    public static List<Unit> nonEliteAntiLargeInfantryUnits(){
        List<Unit> unitsUnder =new ArrayList<>();
        // BEASTMAN
        unitsUnder.add(BeastmanUnitStore.UngorSpearmenHerd());
        unitsUnder.add(BeastmanUnitStore.UngorSpearmenHerdShields());
        // BRETONIA
        unitsUnder.add(BretoniaUnitStore.SpearmenAtArms());
        unitsUnder.add(BretoniaUnitStore.SpearmenAtArmsShields());
        unitsUnder.add(BretoniaUnitStore.MenAtArmsPolearm());
        // DARK ELVES
        unitsUnder.add(DarkElvenUnitStore.Dreadspears());
        // DWARF
        unitsUnder.add(DwarfsUnitStore.Slayers());
        // EMPIRE
        unitsUnder.add(EmpireUnitStore.Spearmens());
        unitsUnder.add(EmpireUnitStore.SpearmenShields());
        unitsUnder.add(EmpireUnitStore.Halberdiers());
        // GREENSKINS
        // HIGH ELF
        unitsUnder.add(HighElvesUnitStore.Spearmen());
        unitsUnder.add(HighElvesUnitStore.SilverinGuard());
        // LIZARDMEN
        unitsUnder.add(LizadrmenUnitStore.SaurusSpears());
        unitsUnder.add(LizadrmenUnitStore.SaurusSpearsShields());
        // NORSKA
        unitsUnder.add(NorskaUnitStore.MarauderSpearmen());
        // SKAVEN
        unitsUnder.add(SkavenUnitStore.ClanratSpears());
        unitsUnder.add(SkavenUnitStore.ClanratSpearsShields());
        unitsUnder.add(SkavenUnitStore.EshinTriads());
        // TOMB KINGS
        unitsUnder.add(TombKingsUnitStore.SkeletonSpearmen());
        // VAMPIRE COAST
        unitsUnder.add(VampireCoastUnitStore.ZombiePirateDeckhandsMobPolearms());
        // VAMPIRES
        unitsUnder.add(VampireUnitStore.SkeletonSpearmen());
        // WARRIORS OF CHAOS
        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosWarriorsHalberds());
        // WOOD ELF
        unitsUnder.add(WoodElfsUnitStore.EternalGuard());
        unitsUnder.add(WoodElfsUnitStore.EternalGuardShields());
        return unitsUnder;
    }

    // middle infantry unit for every faction.
    public static List<Unit> middleLevelInfantryUnits(){
        List<Unit> unitsUnder =new ArrayList<>();
        // BEASTMAN
        unitsUnder.add(BeastmanUnitStore.GorHerdShields());
        unitsUnder.add(BeastmanUnitStore.GorHerd());
        // BRETONIA
        unitsUnder.add(BretoniaUnitStore.BattlePilgrims());
        // DARK ELVES
        unitsUnder.add(DarkElvenUnitStore.BlackArkCorsairs());
        unitsUnder.add(DarkElvenUnitStore.WitchElves());
        // DWARF
        unitsUnder.add(DwarfsUnitStore.Longbeards());
        unitsUnder.add(DwarfsUnitStore.LongbeardsGreatWeapons());
        // EMPIRE
        unitsUnder.add(EmpireUnitStore.Flagellants());
        // GREENSKINS
        unitsUnder.add(GreenskinsUnitStore.OrcBigUns());
        unitsUnder.add(GreenskinsUnitStore.SavageOrcBigUns());
        // HIGH ELF
        unitsUnder.add(HighElvesUnitStore.WhiteLionsOfChrace());
        // LIZARDMEN
        unitsUnder.add(LizadrmenUnitStore.SaurusWarriorsShields());
        // NORSKA
        unitsUnder.add(NorskaUnitStore.MarauderBerserkers());
        // SKAVEN
        unitsUnder.add(SkavenUnitStore.PlagueMonks());
        // TOMB KINGS
        unitsUnder.add(SkavenUnitStore.PlagueMonks());
        // VAMPIRE COAST
        // VAMPIRES
        unitsUnder.add(VampireUnitStore.CryptGhouls());
        // WARRIORS OF CHAOS
        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosWarriors());
        unitsUnder.add(WarriorsOfChaosUnitStore.ChaosWarriorsGreatWeapons());
        unitsUnder.add(WarriorsOfChaosUnitStore.Forsaken());
        // WOOD ELF
        unitsUnder.add(WoodElfsUnitStore.Wardancers());
        unitsUnder.add(WoodElfsUnitStore.WildwoodRangers());
        return unitsUnder;
    }


    // Elite infantry unit set.
    public static List<Unit> eliteInfantryUnitSet(){
        List<Unit> unitsUnder = new ArrayList<>();
        // BEASTMAN
        unitsUnder.add(BeastmanUnitStore.BestigorHerd());
        // BRETONIA
        unitsUnder.add(BretoniaUnitStore.FootSquires());
        // DARK ELVES
        unitsUnder.add(DarkElvenUnitStore.SistersOfSlaughter());
        unitsUnder.add(DarkElvenUnitStore.HarGanethExecutioners());
        unitsUnder.add(DarkElvenUnitStore.BlackGuardOfNaggarond());
        // DWARF
        unitsUnder.add(DwarfsUnitStore.Ironbreakers());
        unitsUnder.add(DwarfsUnitStore.Hammerers());
        unitsUnder.add(DwarfsUnitStore.GiantSlayers());
        // EMPIRE
        unitsUnder.add(EmpireUnitStore.Greatswords());
        // GREENSKINS
        unitsUnder.add(GreenskinsUnitStore.BlackOrcs());
        // HIGH ELF
        unitsUnder.add(HighElvesUnitStore.PhoenixGuard());
        unitsUnder.add(HighElvesUnitStore.SwordmastersOfHoeth());
        // LIZARDMEN
        unitsUnder.add(LizadrmenUnitStore.TempleGuards());
        // NORSKA
        unitsUnder.add(NorskaUnitStore.MarauderChampions());
        unitsUnder.add(NorskaUnitStore.MarauderChampionsGreatWeapons());
        // SKAVEN
        unitsUnder.add(SkavenUnitStore.DeathRunners());
        unitsUnder.add(SkavenUnitStore.PlagueMonkCenserBearers());
        unitsUnder.add(SkavenUnitStore.StormverminHalberds());
        unitsUnder.add(SkavenUnitStore.StormverminSwordAndShield());
        // TOMB KINGS
        unitsUnder.add(TombKingsUnitStore.TombGuard());
        unitsUnder.add(TombKingsUnitStore.TombGuardHalberds());
        // VAMPIRE COAST
        unitsUnder.add(VampireCoastUnitStore.DepthGuard());
        unitsUnder.add(VampireCoastUnitStore.DepthGuardPolearms());
        // VAMPIRES
        unitsUnder.add(VampireUnitStore.CairnWraiths());
        unitsUnder.add(VampireUnitStore.GraveGuard());
        unitsUnder.add(VampireUnitStore.GraveGuardGreatWeapons());
        // WARRIORS OF CHAOS
        unitsUnder.add(WarriorsOfChaosUnitStore.AspiringChampions());
        unitsUnder.add(WarriorsOfChaosUnitStore.Chosen());
        unitsUnder.add(WarriorsOfChaosUnitStore.ChosenGreatWeapons());
        unitsUnder.add(WarriorsOfChaosUnitStore.ChosenHalberds());
        // WOOD ELF
        unitsUnder.add(WoodElfsUnitStore.WardancersAsraiSpears());

        return unitsUnder;
    }

    // Cheap non infantry  unit set
    public static List<Unit> cheapNonInfantryUnitSet(){
        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
        return unitsUnder;
    }

    // middle non infantry unit set
    public static List<Unit> middleNonInfantryUnitSet(){
        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
        return unitsUnder;
    }


    // elite non infantry unit set
    public static List<Unit> eliteNonInfantryUnitSet(){
        List<Unit> unitsUnder = all().stream().filter(unit -> unit.getCost() <= 200).collect(Collectors.toList());
        return unitsUnder;
    }
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
