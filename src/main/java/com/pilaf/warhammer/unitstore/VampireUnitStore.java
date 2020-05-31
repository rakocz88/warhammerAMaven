package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class VampireUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(

        );
    }

    public static Unit Zombies() {
        return Unit.builder()
                .name("Zombies")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(100)
                .hitPointsPerUnit(63)
                .armor(0)
                .leadership(30)
                .speed(23)
                .attack(5)
                .meleeInterval(4.3)
                .defence(6)
                .damage(16)
                .apDamage(2)
                .chargeBonus(3)
                .skillsList(Arrays.asList(
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit SkeletonWarriors() {
        return Unit.builder()
                .name("SkeletonWarriors")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(300)
                .hitPointsPerUnit(61)
                .armor(20)
                .leadership(30)
                .speed(31)
                .attack(18)
                .meleeInterval(4.3)
                .defence(22)
                .damage(20)
                .apDamage(6)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit SkeletonSpearmen() {
        return Unit.builder()
                .name("SkeletonSpearmen")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(120)
                .cost(350)
                .hitPointsPerUnit(61)
                .armor(20)
                .leadership(30)
                .speed(31)
                .attack(14)
                .meleeInterval(4.5)
                .defence(30)
                .damage(18)
                .apDamage(6)
                .bonusAgainstLarge(14)
                .chargeBonus(4)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit CryptGhouls() {
        return Unit.builder()
                .name("CryptGhouls")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(90)
                .cost(500)
                .hitPointsPerUnit(63)
                .armor(10)
                .leadership(44)
                .speed(38)
                .attack(27)
                .meleeInterval(4.3)
                .defence(25)
                .damage(36)
                .apDamage(4)
                .chargeBonus(16)
                .skillsList(Arrays.asList(
                        Skills.POISON_ATTACK,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit CairnWraiths() {
        return Unit.builder()
                .name("CairnWraiths")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(4)
                .unitAmount(45)
                .cost(850)
                .hitPointsPerUnit(82)
                .armor(0)
                .physicalResistance(75)
                .leadership(40)
                .speed(48)
                .attack(28)
                .meleeInterval(4.3)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .defence(26)
                .damage(6)
                .apDamage(38)
                .chargeBonus(20)
                .skillsList(Arrays.asList(
                        Skills.MAGICAL_ATTACK,
                        Skills.CAUSE_TERROR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit GraveGuard() {
        return Unit.builder()
                .name("GraveGuard")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(90)
                .cost(850)
                .hitPointsPerUnit(82)
                .armor(90)
                .leadership(50)
                .speed(27)
                .attack(26)
                .meleeInterval(4.4)
                .defence(36)
                .damage(28)
                .apDamage(12)
                .bonusAgainstInfantry(8)
                .chargeBonus(8)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit GraveGuardGreatWeapons() {
        return Unit.builder()
                .name("GraveGuardGreatWeapons")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(90)
                .cost(950)
                .hitPointsPerUnit(82)
                .armor(90)
                .leadership(50)
                .speed(27)
                .attack(26)
                .meleeInterval(4.3)
                .defence(26)
                .damage(13)
                .apDamage(29)
                .bonusAgainstInfantry(13)
                .chargeBonus(12)
                .skillsList(Arrays.asList(
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit BlackKnights() {
        return Unit.builder()
                .name("BlackKnights")
                .race(Race.VAMPIRES)
                .size(Size.LARGE)
                .tier(2)
                .unitAmount(45)
                .cost(750)
                .hitPointsPerUnit(114)
                .armor(80)
                .leadership(50)
                .speed(78)
                .attack(24)
                .meleeInterval(4.9)
                .defence(30)
                .damage(25)
                .apDamage(11)
                .bonusAgainstInfantry(8)
                .chargeBonus(26)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit BlackKnightsLancesAndBarding() {
        return Unit.builder()
                .name("BlackKnightsLancesAndBarding")
                .race(Race.VAMPIRES)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(45)
                .cost(1050)
                .hitPointsPerUnit(114)
                .armor(110)
                .leadership(50)
                .speed(72)
                .attack(24)
                .meleeInterval(5.1)
                .defence(22)
                .damage(30)
                .apDamage(12)
                .chargeBonus(62)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit Hexwraiths() {
        return Unit.builder()
                .name("Hexwraiths")
                .race(Race.VAMPIRES)
                .size(Size.LARGE)
                .tier(1)
                .unitAmount(45)
                .cost(1400)
                .hitPointsPerUnit(96)
                .armor(0)
                .physicalResistance(75)
                .leadership(40)
                .speed(94)
                .attack(26)
                .meleeInterval(4.6)
                .defence(23)
                .damage(5)
                .apDamage(37)
                .chargeBonus(34)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_TERROR,
                        Skills.MAGICAL_ATTACK,
                        Skills.FIRE_ATTACK,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit BloodKnights() {
        return Unit.builder()
                .name("BloodKnights")
                .race(Race.VAMPIRES)
                .size(Size.LARGE)
                .tier(5)
                .unitAmount(45)
                .cost(1700)
                .hitPointsPerUnit(116)
                .armor(110)
                .leadership(65)
                .speed(70)
                .attack(32)
                .meleeInterval(5.1)
                .defence(40)
                .damage(25)
                .apDamage(13)
                .bonusAgainstLarge(22)
                .chargeBonus(72)
                .skillsList(Arrays.asList(
                        Skills.FRENZY,
                        Skills.THE_FLAG_OF_BLOOD_KEED,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit FellBats() {
        return Unit.builder()
                .name("FellBats")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(45)
                .cost(350)
                .hitPointsPerUnit(70)
                .armor(0)
                .leadership(30)
                .speed(110)
                .attack(14)
                .meleeInterval(4.3)
                .defence(44)
                .damage(20)
                .apDamage(2)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.FLYING,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit DireWolves() {
        return Unit.builder()
                .name("DireWolves")
                .race(Race.VAMPIRES)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(500)
                .hitPointsPerUnit(76)
                .armor(0)
                .leadership(30)
                .speed(95)
                .attack(26)
                .meleeInterval(4.6)
                .defence(14)
                .damage(19)
                .apDamage(3)
                .chargeBonus(24)
                .skillsList(Arrays.asList(
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit CryptHorrors() {
        return Unit.builder()
                .name("CryptHorrors")
                .race(Race.VAMPIRES)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(800)
                .hitPointsPerUnit(560)
                .armor(15)
                .leadership(44)
                .speed(50)
                .attack(34)
                .meleeInterval(4.2)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .defence(25)
                .damage(18)
                .apDamage(52)
                .chargeBonus(24)
                .skillsList(Arrays.asList(
                        Skills.REGENERATION,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit Vargheists() {
        return Unit.builder()
                .name("Vargheists")
                .race(Race.VAMPIRES)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(12)
                .cost(1000)
                .hitPointsPerUnit(395)
                .armor(10)
                .leadership(62)
                .speed(92)
                .attack(40)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .meleeInterval(4)
                .defence(25)
                .damage(72)
                .apDamage(38)
                .chargeBonus(26)
                .skillsList(Arrays.asList(
                        Skills.FLYING,
                        Skills.FRENZY,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING,
                        Skills.CAUSE_FEAR))
                .build();
    }
}
