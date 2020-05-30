package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class NorskaUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(

        );
    }

    public static Unit Marauders() {
        return Unit.builder()
                .name("Marauders")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(90)
                .cost(400)
                .hitPointsPerUnit(78)
                .armor(15)
                .leadership(60)
                .speed(35)
                .attack(34)
                .meleeInterval(4.2)
                .defence(28)
                .damage(21)
                .apDamage(7)
                .chargeBonus(18)
                .skillsList(Arrays.asList(
                        Skills.RAGE,
                        Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit MarauderSpearmen() {
        return Unit.builder()
                .name("MarauderSpearmen")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(90)
                .cost(450)
                .hitPointsPerUnit(78)
                .armor(15)
                .leadership(60)
                .speed(35)
                .attack(25)
                .meleeInterval(5.7)
                .defence(37)
                .damage(25)
                .apDamage(5)
                .bonusAgainstLarge(15)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.RAGE,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit MaraudersGreatWeapons() {
        return Unit.builder()
                .name("MaraudersGreatWeapons")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(90)
                .cost(525)
                .hitPointsPerUnit(78)
                .armor(15)
                .leadership(60)
                .speed(35)
                .attack(34)
                .meleeInterval(4.6)
                .defence(20)
                .damage(7)
                .apDamage(23)
                .chargeBonus(21)
                .skillsList(Arrays.asList(
                        Skills.RAGE))
                .build();
    }

    public static Unit MarauderBerserkers() {
        return Unit.builder()
                .name("MarauderBerserkers")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(75)
                .cost(750)
                .hitPointsPerUnit(102)
                .armor(15)
                .leadership(80)
                .speed(37)
                .attack(40)
                .meleeInterval(4)
                .defence(24)
                .damage(39)
                .apDamage(13)
                .bonusAgainstInfantry(5)
                .chargeBonus(33)
                .skillsList(Arrays.asList(
                        Skills.IMMUNE_TO_PSYCHOLOGY,
                        Skills.RAGE,
                        Skills.FRENZY))
                .build();
    }

    public static Unit MarauderChampions() {
        return Unit.builder()
                .name("MarauderChampions")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(75)
                .cost(1000)
                .hitPointsPerUnit(76)
                .armor(80)
                .leadership(75)
                .speed(35)
                .attack(36)
                .meleeInterval(4)
                .defence(53)
                .damage(30)
                .apDamage(9)
                .chargeBonus(20)
                .skillsList(Arrays.asList(
                        Skills.RAGE,
                        Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit MarauderChampionsGreatWeapons() {
        return Unit.builder()
                .name("MarauderChampionsGreatWeapons")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(75)
                .cost(1100)
                .hitPointsPerUnit(96)
                .armor(80)
                .leadership(75)
                .speed(35)
                .attack(36)
                .meleeInterval(4.3)
                .defence(32)
                .damage(10)
                .apDamage(30)
                .chargeBonus(30)
                .skillsList(Arrays.asList(
                        Skills.RAGE))
                .build();
    }

    public static Unit NorscanWarhounds() {
        return Unit.builder()
                .name("NorscanWarhounds")
                .race(Race.NORSKA)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(60)
                .cost(400)
                .hitPointsPerUnit(76)
                .armor(15)
                .missileResistance(15)
                .leadership(38)
                .speed(95)
                .attack(26)
                .meleeInterval(4.3)
                .defence(17)
                .damage(19)
                .apDamage(3)
                .chargeBonus(18)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit NorscanIceWolves() {
        return Unit.builder()
                .name("NorscanIceWolves")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(36)
                .cost(650)
                .hitPointsPerUnit(138)
                .armor(15)
                .missileResistance(15)
                .leadership(45)
                .speed(95)
                .attack(26)
                .meleeInterval(4)
                .defence(19)
                .damage(29)
                .apDamage(13)
                .chargeBonus(38)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.FROSTBITE))
                .build();
    }

    public static Unit NorscanTrolls() {
        return Unit.builder()
                .name("NorscanTrolls")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(800)
                .hitPointsPerUnit(494)
                .armor(40)
                .leadership(40)
                .speed(54)
                .attack(34)
                .meleeInterval(3.8)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .defence(32)
                .damage(30)
                .apDamage(70)
                .chargeBonus(24)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.REGENERATION))
                .build();
    }

    public static Unit NorscanIceTrolls() {
        return Unit.builder()
                .name("Marauders")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(950)
                .hitPointsPerUnit(494)
                .armor(60)
                .leadership(40)
                .speed(54)
                .attack(38)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(3)
                .meleeInterval(4)
                .defence(32)
                .damage(39)
                .apDamage(81)
                .chargeBonus(18)
                .skillsList(Arrays.asList(
                        Skills.FROSTBITE,
                        Skills.CAUSE_FEAR,
                        Skills.REGENERATION))
                .build();
    }

    public static Unit SkinWolves() {
        return Unit.builder()
                .name("SkinWolves")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(18)
                .cost(950)
                .hitPointsPerUnit(309)
                .armor(15)
                .physicalResistance(20)
                .leadership(60)
                .speed(75)
                .attack(32)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.SMALL)
                .maxSplashUnitAmount(3)
                .defence(28)
                .damage(39)
                .apDamage(21)
                .bonusAgainstLarge(30)
                .chargeBonus(32)
                .skillsList(Arrays.asList(
                        Skills.FRENZY,
                        Skills.REGENERATION,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit SkinWolvesArmoured() {
        return Unit.builder()
                .name("SkinWolvesArmoured")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(18)
                .cost(1100)
                .hitPointsPerUnit(309)
                .armor(70)
                .physicalResistance(20)
                .leadership(60)
                .speed(75)
                .attack(32)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.SMALL)
                .maxSplashUnitAmount(3)
                .defence(28)
                .damage(39)
                .apDamage(21)
                .bonusAgainstLarge(30)
                .chargeBonus(32)
                .skillsList(Arrays.asList(
                        Skills.FRENZY,
                        Skills.REGENERATION,
                        Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit FimirWarriors() {
        return Unit.builder()
                .name("FimirWarriors")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(12)
                .cost(1300)
                .hitPointsPerUnit(514)
                .armor(110)
                .leadership(70)
                .speed(45)
                .attack(34)
                .meleeInterval(3.8)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .defence(42)
                .damage(26)
                .apDamage(64)
                .chargeBonus(25)
                .skillsList(Arrays.asList(
                        Skills.SUNDER_ARMOR,
                        Skills.MAGICAL_ATTACK,
                        Skills.CAUSE_FEAR,
                        Skills.FROM_THE_MYST))
                .build();
    }

    public static Unit FimirWarriorsGreatWeapons() {
        return Unit.builder()
                .name("FimirWarriorsGreatWeapons")
                .race(Race.NORSKA)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(12)
                .cost(1450)
                .hitPointsPerUnit(514)
                .armor(110)
                .leadership(70)
                .speed(45)
                .attack(28)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(2)
                .defence(38)
                .damage(31)
                .apDamage(64)
                .bonusAgainstLarge(27)
                .chargeBonus(25)
                .skillsList(Arrays.asList(
                        Skills.SUNDER_ARMOR,
                        Skills.MAGICAL_ATTACK,
                        Skills.CAUSE_FEAR,
                        Skills.FROM_THE_MYST))
                .build();
    }
}
