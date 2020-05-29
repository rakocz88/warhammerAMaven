package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;
import java.util.List;

public class WarriorsOfChaosUnitStore {

    public static List<Unit> all(){
        return Arrays.asList(ChaosMarauders(), ChaosMaraudersGreatWeapons(), AspiringChampions(), Forsaken(),
                ChaosWarriors(), ChaosWarriorsGreatWeapons(), ChaosWarriorsHalberds(), Chosen(), ChosenGreatWeapons(),
                ChosenHalberds(), ChaosTrolls(), ChaosTrollsArmoured(), ChaosSpawn(), ChaosKnights(), ChaosKnightsLances(),
                ChaosWarhounds(), ChaosWarhoundsPoison(), DragonOgres());
    }

    public static Unit ChaosMarauders(){
        return  Unit.builder()
                .name("ChaosMarauders")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(375)
                .hitPointsPerUnit(78)
                .leadership(60)
                .speed(35)
                .attack(34)
                .defence(28)
                .chargeBonus(18)
                .damage(21)
                .apDamage(7)
                .meleeInterval(4.2)
                .armor(15)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit ChaosMaraudersGreatWeapons(){
        return  Unit.builder()
                .name("ChaosMaraudersGreatWeapons")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(500)
                .hitPointsPerUnit(78)
                .leadership(68)
                .speed(35)
                .attack(34)
                .defence(20)
                .chargeBonus(21)
                .damage(7)
                .apDamage(20)
                .meleeInterval(4.6)
                .armor(15)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit AspiringChampions(){
        return  Unit.builder()
                .name("AspiringChampions")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(12)
                .cost(550)
                .hitPointsPerUnit(198)
                .leadership(80)
                .speed(32)
                .attack(46)
                .defence(62)
                .chargeBonus(26)
                .damage(32)
                .apDamage(12)
                .meleeInterval(4)
                .armor(120)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD))
                .build();
    }

    public static Unit Forsaken(){
        return  Unit.builder()
                .name("Forsaken")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(750)
                .hitPointsPerUnit(92)
                .leadership(70)
                .speed(46)
                .attack(32)
                .defence(20)
                .chargeBonus(36)
                .damage(44)
                .apDamage(14)
                .meleeInterval(4.3)
                .armor(85)
                .skillsList(Arrays.asList(Skills.FRENZY, Skills.IMMUNE_TO_PSYCHOLOGY))
                .build();
    }

    public static Unit ChaosWarriors(){
        return  Unit.builder()
                .name("ChaosWarriors")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(750)
                .hitPointsPerUnit(90)
                .leadership(75)
                .speed(28)
                .attack(36)
                .defence(44)
                .chargeBonus(20)
                .damage(26)
                .apDamage(10)
                .meleeInterval(4)
                .armor(100)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD))
                .build();
    }

    public static Unit ChaosWarriorsHalberds(){
        return  Unit.builder()
                .name("ChaosWarriorsHalberds")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(850)
                .hitPointsPerUnit(90)
                .leadership(75)
                .speed(28)
                .attack(30)
                .defence(38)
                .chargeBonus(10)
                .damage(10)
                .apDamage(24)
                .meleeInterval(4.4)
                .armor(100)
                .bonusAgainstLarge(19)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit ChaosWarriorsGreatWeapons(){
        return  Unit.builder()
                .name("ChaosWarriorsGreatWeapons")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(850)
                .hitPointsPerUnit(90)
                .leadership(70)
                .speed(28)
                .attack(36)
                .defence(32)
                .chargeBonus(26)
                .damage(10)
                .apDamage(28)
                .meleeInterval(4.4)
                .armor(100)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit Chosen(){
        return  Unit.builder()
                .name("Chosen")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(1250)
                .hitPointsPerUnit(131)
                .leadership(85)
                .speed(28)
                .attack(46)
                .defence(60)
                .chargeBonus(26)
                .damage(32)
                .apDamage(12)
                .meleeInterval(3.8)
                .armor(90)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit ChosenHalberds(){
        return  Unit.builder()
                .name("ChosenHalberds")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(1400)
                .hitPointsPerUnit(131)
                .leadership(85)
                .speed(28)
                .attack(36)
                .defence(54)
                .chargeBonus(16)
                .damage(15)
                .apDamage(31)
                .meleeInterval(4.3)
                .armor(120)
                .bonusAgainstLarge(26)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit ChosenGreatWeapons(){
        return  Unit.builder()
                .name("ChosenGreatWeapons")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(1450)
                .hitPointsPerUnit(131)
                .leadership(85)
                .speed(28)
                .attack(48)
                .defence(46)
                .chargeBonus(32)
                .damage(12)
                .apDamage(38)
                .meleeInterval(4.1)
                .armor(120)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit ChaosTrolls(){
        return  Unit.builder()
                .name("ChaosTrolls")
                .race(Race.CHAOS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(800)
                .hitPointsPerUnit(494)
                .leadership(40)
                .speed(54)
                .attack(34)
                .defence(32)
                .chargeBonus(24)
                .damage(30)
                .apDamage(70)
                .meleeInterval(3.8)
                .armor(40)
                .skillsList(Arrays.asList(Skills.CAUSE_FEAR, Skills.REGENERATION))
                .build();
    }

    public static Unit ChaosTrollsArmoured(){
        return  Unit.builder()
                .name("ChaosTrollsArmoured")
                .race(Race.CHAOS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(1000)
                .hitPointsPerUnit(494)
                .leadership(40)
                .speed(54)
                .attack(34)
                .defence(32)
                .chargeBonus(24)
                .damage(30)
                .apDamage(70)
                .meleeInterval(3.8)
                .armor(110)
                .skillsList(Arrays.asList(Skills.CAUSE_FEAR, Skills.REGENERATION))
                .build();
    }

    public static Unit ChaosSpawn(){
        return  Unit.builder()
                .name("ChaosSpawn")
                .race(Race.CHAOS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(900)
                .hitPointsPerUnit(548)
                .leadership(100)
                .speed(42)
                .attack(36)
                .defence(28)
                .chargeBonus(30)
                .damage(118)
                .apDamage(42)
                .meleeInterval(3.8)
                .armor(10)
                .skillsList(Arrays.asList(Skills.CAUSE_FEAR, Skills.UNBREAKABLE))
                .build();
    }

    public static Unit DragonOgres(){
        return  Unit.builder()
                .name("DragonOgres")
                .race(Race.CHAOS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(1650)
                .hitPointsPerUnit(616)
                .leadership(72)
                .speed(64)
                .attack(32)
                .defence(40)
                .chargeBonus(32)
                .missileResistance(15)
                .damage(33)
                .apDamage(77)
                .meleeInterval(4)
                .bonusAgainstLarge(26)
                .armor(60)
                .skillsList(Arrays.asList(Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit ChaosKnights(){
        return  Unit.builder()
                .name("ChaosKnights")
                .race(Race.CHAOS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1400)
                .hitPointsPerUnit(130)
                .leadership(74)
                .speed(66)
                .attack(44)
                .defence(50)
                .chargeBonus(44)
                .damage(28)
                .apDamage(10)
                .meleeInterval(4.6)
                .armor(120)
                .skillsList(Arrays.asList(Skills.CAUSE_FEAR, Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit ChaosKnightsLances(){
        return  Unit.builder()
                .name("ChaosKnightsLances")
                .race(Race.CHAOS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1500)
                .hitPointsPerUnit(130)
                .leadership(74)
                .speed(66)
                .attack(42)
                .defence(34)
                .chargeBonus(80)
                .damage(31)
                .apDamage(15)
                .meleeInterval(5)
                .armor(120)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD, Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit ChaosWarhounds(){
        return  Unit.builder()
                .name("ChaosWarhounds")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(400)
                .hitPointsPerUnit(76)
                .leadership(38)
                .speed(95)
                .attack(26)
                .defence(17)
                .chargeBonus(18)
                .missileResistance(15)
                .damage(19)
                .apDamage(3)
                .meleeInterval(4.3)
                .armor(15)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit ChaosWarhoundsPoison(){
        return  Unit.builder()
                .name("ChaosWarhoundsPoison")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(475)
                .hitPointsPerUnit(76)
                .leadership(38)
                .speed(95)
                .attack(26)
                .defence(17)
                .chargeBonus(18)
                .missileResistance(15)
                .damage(19)
                .apDamage(3)
                .meleeInterval(4.3)
                .armor(15)
                .skillsList(Arrays.asList(Skills.POISON_ATTACK))
                .build();
    }
}
