package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class BeastmanUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(
            UngorHerd(), UngorSpearmenHerd(), UngorSpearmenHerdShields(), GorHerd(), GorHerdShields(), BestigorHerd(), Centigors(), CentigorsGreatWeapons(),
                Harpies(), ChaosSpawn(), ChaosWarhounds(), ChaosWarhoundsPoison(), Minotaurs(), MinotaursShields(), MinotaursGreatWeapons(), RazorgorHerd()
        );
    }

    public static Unit UngorSpearmenHerd() {
        return Unit.builder()
                .name("UngorSpearmenHerd")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(350)
                .hitPointsPerUnit(56)
                .armor(15)
                .leadership(54)
                .speed(36)
                .attack(20)
                .meleeInterval(4.6)
                .defence(22)
                .damage(17)
                .apDamage(5)
                .bonusAgainstLarge(12)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_FURY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit UngorHerd() {
        return Unit.builder()
                .name("UngorHerd")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(120)
                .cost(400)
                .hitPointsPerUnit(56)
                .armor(15)
                .leadership(54)
                .speed(36)
                .attack(22)
                .meleeInterval(4.3)
                .defence(24)
                .damage(20)
                .apDamage(7)
                .chargeBonus(15)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_FURY,
                        Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit UngorSpearmenHerdShields() {
        return Unit.builder()
                .name("UngorSpearmenHerdShields")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(120)
                .cost(400)
                .hitPointsPerUnit(56)
                .armor(15)
                .leadership(54)
                .speed(36)
                .attack(20)
                .meleeInterval(4.2)
                .defence(30)
                .damage(17)
                .apDamage(5)
                .bonusAgainstLarge(12)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.PRIMAL_FURY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }



    public static Unit GorHerdShields() {
        return Unit.builder()
                .name("GorHerdShields")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(90)
                .cost(500)
                .hitPointsPerUnit(80)
                .armor(15)
                .leadership(62)
                .speed(38)
                .attack(26)
                .meleeInterval(4.4)
                .defence(35)
                .damage(21)
                .apDamage(9)
                .chargeBonus(22)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_FURY,
                        Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit GorHerd() {
        return Unit.builder()
                .name("GorHerd")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(90)
                .cost(600)
                .hitPointsPerUnit(80)
                .armor(15)
                .leadership(62)
                .speed(38)
                .attack(36)
                .meleeInterval(4.4)
                .defence(25)
                .damage(25)
                .apDamage(11)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_FURY))
                .build();
    }

    public static Unit BestigorHerd() {
        return Unit.builder()
                .name("BestigorHerd")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(4)
                .unitAmount(75)
                .cost(1000)
                .hitPointsPerUnit(100)
                .armor(95)
                .leadership(66)
                .speed(36)
                .attack(35)
                .meleeInterval(4)
                .defence(24)
                .damage(12)
                .apDamage(28)
                .chargeBonus(32)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_FURY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit Centigors() {
        return Unit.builder()
                .name("Centigors")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(45)
                .cost(700)
                .hitPointsPerUnit(108)
                .armor(35)
                .leadership(60)
                .speed(84)
                .attack(24)
                .meleeInterval(4.6)
                .defence(26)
                .damage(25)
                .apDamage(7)
                .chargeBonus(42)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.PRIMAL_FURY,
                        Skills.ROWDY))
                .build();
    }

    public static Unit CentigorsGreatWeapons() {
        return Unit.builder()
                .name("CentigorsGreatWeapons")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(45)
                .cost(900)
                .hitPointsPerUnit(108)
                .armor(35)
                .leadership(60)
                .speed(84)
                .attack(22)
                .meleeInterval(4.6)
                .defence(20)
                .damage(7)
                .apDamage(27)
                .chargeBonus(42)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_FURY,
                        Skills.ROWDY))
                .build();
    }

    public static Unit ChaosWarhounds(){
        return  Unit.builder()
                .name("ChaosWarhounds")
                .race(Race.CHAOS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(400)
                .tier(1)
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
                .tier(2)
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

    public static Unit RazorgorHerd() {
        return Unit.builder()
                .name("RazorgorHerd")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(24)
                .cost(600)
                .hitPointsPerUnit(186)
                .armor(45)
                .leadership(55)
                .speed(70)
                .attack(24)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.SMALL)
                .maxSplashUnitAmount(2)
                .defence(16)
                .damage(16)
                .apDamage(36)
                .chargeBonus(46)
                .skillsList(Arrays.asList(
                        Skills.RAMPAGE,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit Harpies() {
        return Unit.builder()
                .name("Harpies")
                .race(Race.BEASTMAN)
                .size(Size.SMALL)
                .tier(4)
                .unitAmount(45)
                .cost(600)
                .hitPointsPerUnit(87)
                .armor(15)
                .leadership(52)
                .speed(82)
                .attack(22)
                .meleeInterval(4)
                .defence(38)
                .damage(32)
                .apDamage(12)
                .chargeBonus(20)
                .skillsList(Arrays.asList(Skills.FLYING))
                .build();
    }

    public static Unit ChaosSpawn() {
        return Unit.builder()
                .name("ChaosSpawn")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(12)
                .cost(900)
                .hitPointsPerUnit(548)
                .armor(10)
                .leadership(100)
                .speed(42)
                .attack(36)
                .meleeInterval(3.8)
                .defence(22)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(5)
                .damage(90)
                .apDamage(40)
                .chargeBonus(30)
                .skillsList(Arrays.asList(
                        Skills.UNBREAKABLE,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit Minotaurs() {
        return Unit.builder()
                .name("Minotaurs")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(12)
                .cost(1250)
                .hitPointsPerUnit(514)
                .armor(35)
                .leadership(65)
                .speed(62)
                .attack(36)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .defence(32)
                .damage(33)
                .apDamage(77)
                .bonusAgainstInfantry(18)
                .chargeBonus(38)
                .skillsList(Arrays.asList(
                        Skills.BLOODGREED,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit MinotaursShields() {
        return Unit.builder()
                .name("MinotaursShields")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(12)
                .cost(1250)
                .hitPointsPerUnit(514)
                .armor(45)
                .leadership(65)
                .speed(62)
                .attack(36)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .defence(45)
                .damage(33)
                .apDamage(77)
                .chargeBonus(34)
                .skillsList(Arrays.asList(
                        Skills.BLOODGREED,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit MinotaursGreatWeapons() {
        return Unit.builder()
                .name("MinotaursGreatWeapons")
                .race(Race.BEASTMAN)
                .size(Size.LARGE)
                .tier(5)
                .unitAmount(12)
                .cost(1350)
                .hitPointsPerUnit(514)
                .armor(35)
                .leadership(65)
                .speed(62)
                .attack(36)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .defence(32)
                .damage(33)
                .apDamage(77)
                .bonusAgainstLarge(28)
                .chargeBonus(44)
                .skillsList(Arrays.asList(
                        Skills.BLOODGREED,
                        Skills.CAUSE_FEAR))
                .build();
    }

}
