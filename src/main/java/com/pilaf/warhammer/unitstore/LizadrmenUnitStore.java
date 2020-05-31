package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class LizadrmenUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(
        );
    }

    public static Unit SkinkCohort() {
        return Unit.builder()
                .name("SkinkCohort")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(300)
                .hitPointsPerUnit(50)
                .armor(30)
                .leadership(55)
                .speed(46)
                .attack(20)
                .meleeInterval(4.3)
                .defence(24)
                .damage(20)
                .apDamage(5)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit RedCrestedSkinks() {
        return Unit.builder()
                .name("RedCrestedSkinks")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(600)
                .hitPointsPerUnit(67)
                .armor(30)
                .leadership(62)
                .speed(46)
                .attack(26)
                .meleeInterval(4.6)
                .defence(19)
                .damage(5)
                .apDamage(20)
                .chargeBonus(21)
                .skillsList(Arrays.asList(
                        Skills.POISON_ATTACK, Skills.FRENZY))
                .build();
    }

    public static Unit SaurusSpears() {
        return Unit.builder()
                .name("SaurusSpears")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(750)
                .hitPointsPerUnit(102)
                .armor(60)
                .leadership(75)
                .speed(31)
                .attack(24)
                .meleeInterval(4.1)
                .defence(32)
                .damage(30)
                .apDamage(12)
                .bonusAgainstLarge(15)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit SaurusWarriors() {
        return Unit.builder()
                .name("SaurusWarriors")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(750)
                .hitPointsPerUnit(102)
                .armor(60)
                .leadership(75)
                .speed(31)
                .attack(29)
                .meleeInterval(3.7)
                .defence(28)
                .damage(34)
                .apDamage(18)
                .chargeBonus(16)
                .skillsList(Arrays.asList(
                        Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit SaurusSpearsShields() {
        return Unit.builder()
                .name("SaurusSpearsShields")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(800)
                .hitPointsPerUnit(102)
                .armor(60)
                .leadership(75)
                .speed(31)
                .attack(24)
                .meleeInterval(4.1)
                .defence(38)
                .damage(30)
                .apDamage(12)
                .bonusAgainstLarge(15)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.PRIMAL_INSTINCTS,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit SaurusWarriorsShields() {
        return Unit.builder()
                .name("SaurusWarriorsShields")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(800)
                .hitPointsPerUnit(102)
                .armor(60)
                .leadership(75)
                .speed(31)
                .attack(29)
                .meleeInterval(3.7)
                .defence(34)
                .damage(34)
                .apDamage(18)
                .chargeBonus(16)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit TempleGuards() {
        return Unit.builder()
                .name("TempleGuards")
                .race(Race.LIZARDMAN)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(1200)
                .hitPointsPerUnit(107)
                .armor(85)
                .leadership(85)
                .speed(31)
                .attack(31)
                .meleeInterval(4)
                .defence(38)
                .damage(13)
                .apDamage(29)
                .bonusAgainstLarge(16)
                .chargeBonus(14)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.CHARGE_DEFENCE_EXPERT))
                .build();
    }

    public static Unit FeralColdOnes() {
        return Unit.builder()
                .name("FeralColdOnes")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(24)
                .cost(450)
                .hitPointsPerUnit(118)
                .armor(90)
                .leadership(55)
                .speed(70)
                .attack(25)
                .meleeInterval(4.5)
                .defence(22)
                .damage(12)
                .apDamage(34)
                .chargeBonus(28)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR, Skills.RAMPAGE))
                .build();
    }

    public static Unit ColdOneRiders() {
        return Unit.builder()
                .name("ColdOneRiders")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(36)
                .cost(850)
                .hitPointsPerUnit(130)
                .armor(90)
                .leadership(75)
                .speed(66)
                .attack(31)
                .meleeInterval(4.4)
                .defence(26)
                .damage(15)
                .apDamage(35)
                .chargeBonus(32)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.BRONZE_SHIELD,
                        Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit ColdOneSpearRiders() {
        return Unit.builder()
                .name("ColdOneSpearRiders")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(36)
                .cost(1000)
                .hitPointsPerUnit(130)
                .armor(90)
                .leadership(75)
                .speed(66)
                .attack(26)
                .meleeInterval(4.2)
                .defence(26)
                .damage(14)
                .apDamage(34)
                .bonusAgainstLarge(14)
                .chargeBonus(32)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.BRONZE_SHIELD,
                        Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit RipperdactylRiders() {
        return Unit.builder()
                .name("RipperdactylRiders")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(8)
                .cost(1200)
                .hitPointsPerUnit(495)
                .armor(45)
                .leadership(65)
                .speed(90)
                .attack(44)
                .meleeInterval(4)
                .defence(23)
                .damage(32)
                .apDamage(98)
                .splashAttack(true)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .bonusAgainstInfantry(10)
                .chargeBonus(52)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR, Skills.FRENZY, Skills.FLYING))
                .build();
    }

    public static Unit HornedOnes() {
        return Unit.builder()
                .name("HornedOnes")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(36)
                .cost(1500)
                .hitPointsPerUnit(150)
                .armor(100)
                .leadership(85)
                .speed(78)
                .attack(45)
                .meleeInterval(4.5)
                .defence(29)
                .damage(19)
                .apDamage(41)
                .chargeBonus(43)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD, Skills.CAUSE_FEAR,
                        Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit Kroxigors() {
        return Unit.builder()
                .name("Kroxigors")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(1000)
                .hitPointsPerUnit(510)
                .armor(100)
                .missileResistance(15)
                .leadership(70)
                .speed(46)
                .attack(26)
                .meleeInterval(3.8)
                .splashAttack(true)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .defence(26)
                .damage(25)
                .apDamage(70)
                .bonusAgainstInfantry(20)
                .chargeBonus(22)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR, Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit SacredKroxigor() {
        return Unit.builder()
                .name("SacredKroxigor")
                .race(Race.LIZARDMAN)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(1250)
                .hitPointsPerUnit(532)
                .armor(100)
                .missileResistance(15)
                .leadership(75)
                .speed(46)
                .attack(36)
                .meleeInterval(4)
                .splashAttack(true)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .defence(26)
                .damage(36)
                .apDamage(84)
                .chargeBonus(24)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR, Skills.PRIMAL_INSTINCTS, Skills.MAGICAL_ATTACK))
                .build();
    }
}
