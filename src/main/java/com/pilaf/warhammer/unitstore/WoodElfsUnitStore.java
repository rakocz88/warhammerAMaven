package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class WoodElfsUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(

        );
    }

    public static Unit EternalGuard() {
        return Unit.builder()
                .name("EternalGuard")
                .race(Race.WOOD_ELVES)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(75)
                .cost(475)
                .hitPointsPerUnit(72)
                .armor(40)
                .leadership(80)
                .speed(33)
                .attack(26)
                .meleeInterval(4.5)
                .defence(36)
                .damage(4)
                .apDamage(20)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit Dryads() {
        return Unit.builder()
                .name("Dryads")
                .race(Race.WOOD_ELVES)
                .size(Size.SMALL)
                .tier(1)
                .unitAmount(75)
                .cost(550)
                .hitPointsPerUnit(70)
                .armor(60)
                .physicalResistance(20)
                .fireResistance(-25)
                .leadership(65)
                .speed(36)
                .attack(33)
                .meleeInterval(4.2)
                .defence(25)
                .damage(29)
                .apDamage(5)
                .chargeBonus(12)
                .skillsList(Arrays.asList(
                        Skills.MAGICAL_ATTACK, Skills.IMMUNE_TO_PSYCHOLOGY
                        , Skills.CAUSE_FEAR))
                .build();
    }

    public static Unit EternalGuardShields() {
        return Unit.builder()
                .name("EternalGuardShields")
                .race(Race.WOOD_ELVES)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(75)
                .cost(550)
                .hitPointsPerUnit(72)
                .armor(40)
                .leadership(80)
                .speed(33)
                .attack(26)
                .meleeInterval(4.5)
                .defence(44)
                .damage(4)
                .apDamage(20)
                .chargeBonus(6)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE, Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit Wardancers() {
        return Unit.builder()
                .name("Wardancers")
                .race(Race.WOOD_ELVES)
                .size(Size.SMALL)
                .tier(2)
                .unitAmount(75)
                .cost(800)
                .hitPointsPerUnit(68)
                .armor(15)
                .physicalResistance(20)
                .leadership(70)
                .speed(46)
                .attack(40)
                .meleeInterval(4.5)
                .defence(38)
                .damage(26)
                .apDamage(10)
                .bonusAgainstInfantry(8)
                .chargeBonus(24)
                .skillsList(Arrays.asList(
                        Skills.IMMUNE_TO_PSYCHOLOGY,
                        Skills.SHADOW_COIL))
                .build();
    }

    public static Unit WildwoodRangers() {
        return Unit.builder()
                .name("WildwoodRangers")
                .race(Race.WOOD_ELVES)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(75)
                .cost(900)
                .hitPointsPerUnit(84)
                .armor(40)
                .leadership(80)
                .speed(38)
                .attack(48)
                .meleeInterval(4.3)
                .defence(36)
                .damage(9)
                .apDamage(27)
                .chargeBonus(22)
                .skillsList(Arrays.asList(
                        Skills.IMMUNE_TO_PSYCHOLOGY,
                        Skills.GUARDIANS_OF_THE_WILDWOOD))
                .build();
    }

    public static Unit WardancersAsraiSpears() {
        return Unit.builder()
                .name("WardancersAsraiSpears")
                .race(Race.WOOD_ELVES)
                .size(Size.SMALL)
                .tier(3)
                .unitAmount(75)
                .cost(950)
                .hitPointsPerUnit(68)
                .armor(15)
                .physicalResistance(20)
                .leadership(70)
                .speed(46)
                .attack(30)
                .meleeInterval(4.6)
                .defence(49)
                .damage(12)
                .apDamage(20)
                .bonusAgainstLarge(23)
                .chargeBonus(12)
                .skillsList(Arrays.asList(
                        Skills.IMMUNE_TO_PSYCHOLOGY,
                        Skills.WOVEN_MIST,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit WildRiders() {
        return Unit.builder()
                .name("WildRiders")
                .race(Race.WOOD_ELVES)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(30)
                .cost(1100)
                .hitPointsPerUnit(115)
                .armor(40)
                .physicalResistance(20)
                .leadership(70)
                .speed(85)
                .attack(34)
                .meleeInterval(5)
                .defence(23)
                .damage(28)
                .apDamage(14)
                .chargeBonus(62)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.FRENZY))
                .build();
    }

    public static Unit WildRidersShields() {
        return Unit.builder()
                .name("WildRidersShields")
                .race(Race.WOOD_ELVES)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(30)
                .cost(1200)
                .hitPointsPerUnit(115)
                .armor(40)
                .physicalResistance(20)
                .leadership(70)
                .speed(85)
                .attack(34)
                .meleeInterval(5)
                .defence(29)
                .damage(28)
                .apDamage(14)
                .chargeBonus(62)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.CAUSE_FEAR,
                        Skills.FRENZY))
                .build();
    }

    public static Unit TreeKin() {
        return Unit.builder()
                .name("TreeKin")
                .race(Race.WOOD_ELVES)
                .size(Size.LARGE)
                .tier(3)
                .unitAmount(12)
                .cost(900)
                .hitPointsPerUnit(548)
                .armor(90)
                .physicalResistance(20)
                .missileResistance(15)
                .fireResistance(-25)
                .leadership(70)
                .speed(34)
                .attack(26)
                .meleeInterval(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .maxSplashUnitAmount(2)
                .defence(51)
                .damage(40)
                .apDamage(18)
                .chargeBonus(12)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR,
                        Skills.IMMUNE_TO_PSYCHOLOGY,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit Treeman() {
        return Unit.builder()
                .name("Treeman")
                .race(Race.WOOD_ELVES)
                .size(Size.LARGE)
                .unitAmount(1)
                .cost(1500)
                .hitPointsPerUnit(6996)
                .leadership(90)
                .speed(35)
                .attack(45)
                .defence(56)
                .chargeBonus(30)
                .damage(130)
                .apDamage(300)
                .meleeInterval(4)
                .armor(110)
                .missileResistance(15)
                .physicalResistance(20)
                .fireResistance(-25)
                .skillsList(Arrays.asList(Skills.CAUSE_FEAR, Skills.CAUSE_TERROR, Skills.CHARGE_DEFENCE_EXPERT))
                .build();
    }
}
