package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class TombKingsUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(
                SkeletonWarriors(), SkeletonSpearmen(), NehekharaWarriors(), TombGuard(), TombGuardHalberds(), SkeletonHorsemen(), NehekharaHorsemen(),
                NecropolisKnights(), NecropolisKnightsHalberds(), SepulchralStalkers(), Carrion(), Ushabti()
            );
    }

    public static Unit SkeletonWarriors() {
        return Unit.builder()
                .name("Skeleton Warriors")
                .race(Race.TOMB_KINGS)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(325)
                .hitPointsPerUnit(61)
                .armor(10)
                .leadership(30)
                .speed(28)
                .attack(18)
                .meleeInterval(4.3)
                .defence(22)
                .damage(20)
                .apDamage(6)
                .chargeBonus(5)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit SkeletonSpearmen() {
        return Unit.builder()
                .name("SkeletonSpearmen")
                .race(Race.TOMB_KINGS)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(120)
                .cost(350)
                .hitPointsPerUnit(61)
                .armor(10)
                .leadership(30)
                .speed(28)
                .attack(14)
                .meleeInterval(4.5)
                .defence(30)
                .damage(18)
                .apDamage(6)
                .bonusAgainstLarge(14)
                .chargeBonus(3)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.SILVER_SHIELD,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit NehekharaWarriors() {
        return Unit.builder()
                .name("NehekharaWarriors")
                .race(Race.TOMB_KINGS)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(90)
                .cost(525)
                .hitPointsPerUnit(76)
                .armor(45)
                .leadership(44)
                .speed(28)
                .attack(32)
                .meleeInterval(4.5)
                .defence(22)
                .damage(26)
                .apDamage(7)
                .chargeBonus(15)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit TombGuard() {
        return Unit.builder()
                .name("TombGuard")
                .race(Race.TOMB_KINGS)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(90)
                .cost(750)
                .hitPointsPerUnit(82)
                .armor(50)
                .leadership(60)
                .speed(28)
                .attack(32)
                .meleeInterval(4.4)
                .defence(41)
                .damage(33)
                .apDamage(9)
                .chargeBonus(8)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit TombGuardHalberds() {
        return Unit.builder()
                .name("TombGuardHalberds")
                .race(Race.TOMB_KINGS)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(90)
                .cost(850)
                .hitPointsPerUnit(82)
                .armor(50)
                .leadership(60)
                .speed(28)
                .attack(25)
                .meleeInterval(4.9)
                .defence(47)
                .damage(9)
                .apDamage(20)
                .bonusAgainstLarge(19)
                .chargeBonus(5)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit SkeletonHorsemen() {
        return Unit.builder()
                .name("SkeletonHorsemen")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(2)
                .unitAmount(45)
                .cost(400)
                .hitPointsPerUnit(86)
                .armor(20)
                .leadership(36)
                .speed(76)
                .attack(22)
                .meleeInterval(4.5)
                .defence(26)
                .damage(20)
                .apDamage(5)
                .chargeBonus(26)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit NehekharaHorsemen() {
        return Unit.builder()
                .name("NehekharaHorsemen")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(45)
                .cost(650)
                .hitPointsPerUnit(110)
                .armor(50)
                .leadership(50)
                .speed(78)
                .attack(28)
                .meleeInterval(5)
                .defence(32)
                .damage(28)
                .apDamage(10)
                .chargeBonus(26)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.REALM_OF_SOULS))
                .build();
    }

    public static Unit Carrion() {
        return Unit.builder()
                .name("Carrion")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(2)
                .unitAmount(18)
                .cost(425)
                .hitPointsPerUnit(210)
                .armor(20)
                .leadership(35)
                .speed(100)
                .attack(26)
                .meleeInterval(4)
                .defence(46)
                .damage(30)
                .apDamage(10)
                .chargeBonus(12)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD,
                        Skills.FLYING))
                .build();
    }

    public static Unit Ushabti() {
        return Unit.builder()
                .name("Ushabti")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(900)
                .hitPointsPerUnit(508)
                .armor(90)
                .leadership(44)
                .speed(54)
                .attack(23)
                .meleeInterval(3.8)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxUnitAttackAmount(4)
                .defence(35)
                .damage(20)
                .apDamage(52)
                .bonusAgainstInfantry(5)
                .chargeBonus(5)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.CONSTRUCT))
                .build();
    }

    // TODO Special range attack todo
    public static Unit SepulchralStalkers() {
        return Unit.builder()
                .name("SepulchralStalkers")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(1200)
                .hitPointsPerUnit(440)
                .armor(80)
                .leadership(50)
                .speed(50)
                .attack(22)
                .meleeInterval(4.7)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(2)
                .defence(30)
                .damage(23)
                .apDamage(52)
                .bonusAgainstLarge(18)
                .chargeBonus(5)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.UNDEAD))
                .build();
    }

    public static Unit NecropolisKnights() {
        return Unit.builder()
                .name("NecropolisKnights")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(4)
                .unitAmount(18)
                .cost(1450)
                .hitPointsPerUnit(300)
                .armor(110)
                .leadership(60)
                .speed(66)
                .attack(40)
                .meleeInterval(5.4)
                .splashTargetSize(SplashTargetSize.SMALL)
                .maxSplashUnitAmount(3)
                .defence(41)
                .damage(21)
                .apDamage(40)
                .chargeBonus(52)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.POISON_ATTACK,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.CONSTRUCT)
                )
                .build();
    }

    public static Unit NecropolisKnightsHalberds() {
        return Unit.builder()
                .name("NecropolisKnightsHalberds")
                .race(Race.TOMB_KINGS)
                .size(Size.LARGE)
                .tier(5)
                .unitAmount(18)
                .cost(1600)
                .hitPointsPerUnit(300)
                .armor(110)
                .leadership(60)
                .speed(66)
                .attack(32)
                .meleeInterval(5.4)
                .splashTargetSize(SplashTargetSize.SMALL)
                .maxSplashUnitAmount(3)
                .defence(35)
                .damage(19)
                .apDamage(36)
                .bonusAgainstLarge(20)
                .chargeBonus(40)
                .skillsList(Arrays.asList(
                        Skills.POISON_ATTACK,
                        Skills.CAUSE_FEAR,
                        Skills.DISINTEGRATING,
                        Skills.CONSTRUCT)
                )
                .build();
    }
}
