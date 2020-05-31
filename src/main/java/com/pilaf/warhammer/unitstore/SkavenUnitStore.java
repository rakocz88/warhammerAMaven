package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class SkavenUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(
                Skavenslaves(), SkavenslaveSpears(), Clanrats(), ClanratSpears(), ClanratsShields(), ClanratSpearsShields(), PlagueMonks(), PlagueMonkCenserBearers(),
                StormverminHalberds(), StormverminSwordAndShield(), DeathRunners(), EshinTriads(), RatOgres(), WarpGrinders()
        );
    }

    public static Unit Skavenslaves() {
        return Unit.builder()
                .name("Skavenslaves")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(135)
                .cost(125)
                .hitPointsPerUnit(48)
                .armor(0)
                .leadership(35)
                .speed(42)
                .attack(12)
                .meleeInterval(4.3)
                .defence(12)
                .damage(14)
                .apDamage(4)
                .chargeBonus(5)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY))
                .build();
    }

    public static Unit SkavenslaveSpears() {
        return Unit.builder()
                .name("SkavenslaveSpears")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(135)
                .tier(1)
                .cost(150)
                .hitPointsPerUnit(48)
                .armor(0)
                .leadership(35)
                .speed(42)
                .attack(10)
                .meleeInterval(4.6)
                .defence(16)
                .damage(12)
                .apDamage(4)
                .chargeBonus(3)
                .bonusAgainstLarge(6)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY))
                .build();
    }

    public static Unit Clanrats() {
        return Unit.builder()
                .name("Clanrats")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(120)
                .cost(300)
                .hitPointsPerUnit(60)
                .armor(25)
                .leadership(45)
                .speed(42)
                .attack(24)
                .meleeInterval(4.3)
                .defence(18)
                .damage(20)
                .apDamage(6)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY))
                .build();
    }

    public static Unit ClanratSpears() {
        return Unit.builder()
                .name("ClanratSpears")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(325)
                .tier(2)
                .hitPointsPerUnit(60)
                .armor(25)
                .leadership(45)
                .speed(42)
                .attack(18)
                .meleeInterval(4.3)
                .defence(24)
                .damage(18)
                .apDamage(5)
                .bonusAgainstLarge(9)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit ClanratsShields() {
        return Unit.builder()
                .name("ClanratsShields")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(120)
                .cost(350)
                .hitPointsPerUnit(60)
                .armor(25)
                .leadership(45)
                .speed(42)
                .attack(24)
                .meleeInterval(4.3)
                .defence(22)
                .damage(26)
                .apDamage(6)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.BRONZE_SHIELD
                        ))
                .build();
    }

    public static Unit ClanratSpearsShields() {
        return Unit.builder()
                .name("ClanratSpearsShields")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(375)
                .tier(3)
                .hitPointsPerUnit(60)
                .armor(25)
                .leadership(45)
                .speed(42)
                .attack(18)
                .meleeInterval(4.3)
                .defence(28)
                .damage(18)
                .apDamage(5)
                .bonusAgainstLarge(9)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit WarpGrinders() {
        return Unit.builder()
                .name("WarpGrinders")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(18)
                .cost(600)
                .hitPointsPerUnit(164)
                .armor(70)
                .leadership(45)
                .speed(38)
                .attack(20)
                .meleeInterval(5.7)
                .splashAttack(true)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .defence(18)
                .damage(18)
                .apDamage(78)
                .chargeBonus(8)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.MAGICAL_ATTACK,
                        Skills.WARP_QUAKE))
                .build();
    }

    public static Unit EshinTriads() {
        return Unit.builder()
                .name("EshinTriads")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(54)
                .cost(750)
                .hitPointsPerUnit(80)
                .armor(20)
                .physicalResistance(30)
                .leadership(64)
                .speed(54)
                .attack(30)
                .meleeInterval(4.6)
                .defence(28)
                .damage(8)
                .apDamage(22)
                .bonusAgainstLarge(15)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.WEAPING_BLADE,
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit PlagueMonks() {
        return Unit.builder()
                .name("PlagueMonks")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(750)
                .tier(3)
                .hitPointsPerUnit(76)
                .armor(10)
                .physicalResistance(15)
                .leadership(68)
                .speed(42)
                .attack(28)
                .meleeInterval(4.5)
                .defence(25)
                .damage(24)
                .apDamage(8)
                .chargeBonus(22)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.FRENZY))
                .build();
    }

    public static Unit DeathRunners() {
        return Unit.builder()
                .name("DeathRunners")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(54)
                .cost(850)
                .tier(5)
                .hitPointsPerUnit(80)
                .armor(20)
                .physicalResistance(30)
                .leadership(68)
                .speed(54)
                .attack(32)
                .meleeInterval(4.3)
                .defence(28)
                .damage(8)
                .apDamage(22)
                .bonusAgainstInfantry(10)
                .chargeBonus(22)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.WEAPING_BLADE))
                .build();
    }

    public static Unit StormverminHalberds() {
        return Unit.builder()
                .name("StormverminHalberds")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(1000)
                .hitPointsPerUnit(62)
                .armor(90)
                .leadership(60)
                .speed(38)
                .attack(25)
                .meleeInterval(4.6)
                .defence(33)
                .damage(8)
                .apDamage(20)
                .chargeBonus(5)
                .bonusAgainstLarge(10)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit PlagueMonkCenserBearers() {
        return Unit.builder()
                .name("PlagueMonkCenserBearers")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(90)
                .tier(4)
                .cost(1050)
                .hitPointsPerUnit(80)
                .armor(10)
                .physicalResistance(15)
                .leadership(72)
                .speed(42)
                .attack(31)
                .meleeInterval(4.4)
                .defence(25)
                .damage(13)
                .apDamage(31)
                .chargeBonus(34)
                .skillsList(Arrays.asList(
                        Skills.FRENZY,
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.MAGICAL_ATTACK,
                        Skills.CONTAMINETED))
                .build();
    }

    public static Unit StormverminSwordAndShield() {
        return Unit.builder()
                .name("StormverminSwordAndShield")
                .race(Race.SKAVEN)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(1050)
                .tier(5)
                .hitPointsPerUnit(62)
                .armor(90)
                .leadership(60)
                .speed(38)
                .attack(38)
                .meleeInterval(4.6)
                .defence(36)
                .damage(25)
                .apDamage(9)
                .chargeBonus(18)
                .skillsList(Arrays.asList(
                        Skills.STRENTH_IN_NUMBERS,
                        Skills.SCURRY_AWAY,
                        Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit RatOgres() {
        return Unit.builder()
                .name("RatOgres")
                .race(Race.SKAVEN)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(800)
                .tier(3)
                .hitPointsPerUnit(483)
                .armor(30)
                .leadership(56)
                .speed(60)
                .attack(26)
                .meleeInterval(3.8)
                .splashAttack(true)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .defence(26)
                .damage(22)
                .apDamage(58)
                .chargeBonus(46)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.SCURRY_AWAY,
                        Skills.FRENZY))
                .build();
    }
}
