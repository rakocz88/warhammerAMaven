package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class VampireCoastUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(

        );
    }

    public static Unit ZombiePirateDeckhandsMob() {
        return Unit.builder()
                .name("ZombiePirateDeckhandsMob")
                .race(Race.VAMPIRE_COAST)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(300)
                .hitPointsPerUnit(67)
                .armor(15)
                .leadership(30)
                .speed(23)
                .attack(17)
                .meleeInterval(4.3)
                .defence(15)
                .damage(22)
                .apDamage(7)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit ZombiePirateDeckhandsMobPolearms() {
        return Unit.builder()
                .name("ZombiePirateDeckhandsMobPolearms")
                .race(Race.VAMPIRE_COAST)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(120)
                .cost(400)
                .hitPointsPerUnit(67)
                .armor(15)
                .leadership(30)
                .speed(23)
                .attack(14)
                .meleeInterval(4.5)
                .defence(20)
                .damage(8)
                .apDamage(19)
                .bonusAgainstLarge(13)
                .chargeBonus(3)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit Syreens() {
        return Unit.builder()
                .name("ZombiePirateDeckhandsMob")
                .race(Race.VAMPIRE_COAST)
                .size(Size.SMALL)
                .tier(4)
                .unitAmount(45)
                .cost(850)
                .hitPointsPerUnit(82)
                .armor(0)
                .physicalResistance(75)
                .leadership(40)
                .speed(48)
                .attack(23)
                .meleeInterval(4)
                .defence(32)
                .damage(7)
                .apDamage(23)
                .chargeBonus(14)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_TERROR,
                        Skills.MAGICAL_ATTACK,
                        Skills.CHARMED,
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit DepthGuard() {
        return Unit.builder()
                .name("DepthGuard")
                .race(Race.VAMPIRE_COAST)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(45)
                .cost(1200)
                .hitPointsPerUnit(109)
                .armor(90)
                .leadership(60)
                .speed(36)
                .attack(49)
                .meleeInterval(3.8)
                .defence(33)
                .damage(46)
                .apDamage(18)
                .chargeBonus(25)
                .skillsList(Arrays.asList(
                        Skills.THE_HUNGER,
                        Skills.FRENZY,
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING
                ))
                .build();
    }

    public static Unit DepthGuardPolearms() {
        return Unit.builder()
                .name("DepthGuardPolearms")
                .race(Race.VAMPIRE_COAST)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(45)
                .cost(1300)
                .hitPointsPerUnit(109)
                .armor(90)
                .leadership(60)
                .speed(36)
                .attack(35)
                .meleeInterval(4.4)
                .defence(47)
                .damage(12)
                .apDamage(28)
                .bonusAgainstLarge(30)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.THE_HUNGER,
                        Skills.FRENZY,
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING
                ))
                .build();
    }

    public static Unit FellBats() {
        return Unit.builder()
                .name("FellBats")
                .race(Race.VAMPIRE_COAST)
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
                .defence(15)
                .damage(44)
                .apDamage(20)
                .chargeBonus(2)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit ScurvyDogs() {
        return Unit.builder()
                .name("ScurvyDogs")
                .race(Race.VAMPIRE_COAST)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(60)
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
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit AnimatedHulks() {
        return Unit.builder()
                .name("AnimatedHulks")
                .race(Race.VAMPIRE_COAST)
                .size(Size.LARGE)
                .tier(2)
                .unitAmount(12)
                .cost(750)
                .hitPointsPerUnit(602)
                .armor(35)
                .leadership(40)
                .speed(38)
                .attack(30)
                .meleeInterval(3.8)
                .defence(24)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(6)
                .damage(33)
                .apDamage(77)
                .chargeBonus(12)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit Mournguls() {
        return Unit.builder()
                .name("Mournguls")
                .race(Race.VAMPIRE_COAST)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(1000)
                .hitPointsPerUnit(560)
                .armor(30)
                .missileResistance(30)
                .leadership(50)
                .speed(45)
                .attack(36)
                .meleeInterval(4)
                .defence(24)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(4)
                .damage(30)
                .apDamage(70)
                .chargeBonus(28)
                .bonusAgainstInfantry(20)
                .skillsList(Arrays.asList(
                        Skills.THE_HUNGER,
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }

    public static Unit RottingPrometheans() {
        return Unit.builder()
                .name("RottingPrometheans")
                .race(Race.VAMPIRE_COAST)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(9)
                .cost(1050)
                .hitPointsPerUnit(660)
                .armor(120)
                .leadership(44)
                .speed(45)
                .attack(38)
                .meleeInterval(3.8)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(5)
                .defence(48)
                .damage(22)
                .apDamage(55)
                .chargeBonus(22)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.CAUSE_FEAR,
                        Skills.UNDEAD,
                        Skills.DISINTEGRATING))
                .build();
    }
}
