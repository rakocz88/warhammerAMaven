package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;
import java.util.List;

public class HighElvesUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(
                Spearmen(), Rangers(), SilverinGuard(), WhiteLionsOfChrace(),
                SwordmastersOfHoeth(), PhoenixGuard(), EllyrianReavers(),
                SilverHelms(), SilverHelmsShields(), DragonPrinces(), WarLionsOfChrace()
        );
    }

    public static Unit Spearmen() {
        return Unit.builder()
                .name("Spearmen")
                .race(Race.HIGH_ELVES)
                .size(Size.INFANTRY)
                .unitAmount(90)
                .cost(500)
                .hitPointsPerUnit(63)
                .armor(40)
                .leadership(70)
                .speed(33)
                .attack(20)
                .meleeInterval(4.8)
                .defence(38)
                .damage(19)
                .apDamage(6)
                .bonusAgainstLarge(15)
                .chargeBonus(4)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.MARTIAL_PROWES,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit Rangers() {
        return Unit.builder()
                .name("Rangers")
                .race(Race.HIGH_ELVES)
                .size(Size.INFANTRY)
                .unitAmount(90)
                .cost(600)
                .hitPointsPerUnit(63)
                .armor(30)
                .leadership(70)
                .speed(40)
                .attack(28)
                .meleeInterval(4.5)
                .defence(24)
                .damage(21)
                .apDamage(7)
                .bonusAgainstInfantry(8)
                .chargeBonus(18)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.MARTIAL_PROWES,
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit SilverinGuard() {
        return Unit.builder()
                .name("SilverinGuard")
                .race(Race.HIGH_ELVES)
                .size(Size.INFANTRY)
                .unitAmount(90)
                .cost(800)
                .hitPointsPerUnit(68)
                .armor(75)
                .magicalResistance(30)
                .leadership(75)
                .speed(33)
                .attack(28)
                .meleeInterval(4.8)
                .defence(42)
                .damage(22)
                .apDamage(10)
                .bonusAgainstLarge(20)
                .chargeBonus(4)
                .skillsList(Arrays.asList(
                        Skills.SILVER_SHIELD,
                        Skills.MARTIAL_PROWES,
                        Skills.CHARGE_DEFENCE_EXPERT))
                .build();
    }

    public static Unit WhiteLionsOfChrace() {
        return Unit.builder()
                .name("WhiteLionsOfChrace")
                .race(Race.HIGH_ELVES)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(800)
                .hitPointsPerUnit(75)
                .armor(90)
                .leadership(75)
                .speed(33)
                .attack(36)
                .meleeInterval(4.4)
                .defence(28)
                .damage(9)
                .apDamage(25)
                .chargeBonus(18)
                .skillsList(Arrays.asList(
                        Skills.MARTIAL_PROWES))
                .build();
    }

    public static Unit SwordmastersOfHoeth() {
        return Unit.builder()
                .name("SwordmastersOfHoeth")
                .race(Race.HIGH_ELVES)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(1250)
                .hitPointsPerUnit(84)
                .armor(90)
                .leadership(80)
                .speed(33)
                .attack(46)
                .meleeInterval(4.3)
                .defence(36)
                .damage(11)
                .apDamage(25)
                .bonusAgainstInfantry(14)
                .chargeBonus(20)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.MARTIAL_PROWES))
                .build();
    }

    public static Unit PhoenixGuard() {
        return Unit.builder()
                .name("PhoenixGuard")
                .race(Race.HIGH_ELVES)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(1400)
                .hitPointsPerUnit(84)
                .armor(100)
                .physicalResistance(30)
                .leadership(90)
                .speed(32)
                .attack(38)
                .meleeInterval(4.9)
                .defence(40)
                .damage(11)
                .apDamage(25)
                .bonusAgainstLarge(20)
                .chargeBonus(10)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_EXPERT,
                        Skills.CAUSE_FEAR,
                        Skills.MARTIAL_MASTERY))
                .build();
    }

    public static Unit EllyrianReavers() {
        return Unit.builder()
                .name("EllyrianReavers")
                .race(Race.HIGH_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(550)
                .hitPointsPerUnit(92)
                .armor(40)
                .leadership(64)
                .speed(90)
                .attack(30)
                .meleeInterval(4.5)
                .defence(24)
                .damage(20)
                .apDamage(7)
                .chargeBonus(40)
                .skillsList(Arrays.asList(
                        Skills.MARTIAL_PROWES))
                .build();
    }

    public static Unit SilverHelms() {
        return Unit.builder()
                .name("SilverHelms")
                .race(Race.HIGH_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(900)
                .hitPointsPerUnit(101)
                .armor(90)
                .leadership(72)
                .speed(78)
                .attack(34)
                .meleeInterval(5)
                .defence(22)
                .damage(23)
                .apDamage(9)
                .chargeBonus(64)
                .skillsList(Arrays.asList(
                        Skills.MARTIAL_PROWES))
                .build();
    }

    public static Unit SilverHelmsShields() {
        return Unit.builder()
                .name("SilverHelmsShields")
                .race(Race.HIGH_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1000)
                .hitPointsPerUnit(101)
                .armor(90)
                .leadership(72)
                .speed(78)
                .attack(34)
                .meleeInterval(5)
                .defence(30)
                .damage(23)
                .apDamage(9)
                .chargeBonus(64)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.MARTIAL_PROWES))
                .build();
    }

    public static Unit DragonPrinces() {
        return Unit.builder()
                .name("DragonPrinces")
                .race(Race.HIGH_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1400)
                .hitPointsPerUnit(110)
                .armor(110)
                .physicalResistance(20)
                .leadership(85)
                .speed(78)
                .attack(36)
                .meleeInterval(5)
                .defence(30)
                .damage(31)
                .apDamage(13)
                .chargeBonus(80)
                .skillsList(Arrays.asList(
                        Skills.BRONZE_SHIELD,
                        Skills.MARTIAL_MASTERY))
                .build();
    }


    public static Unit WarLionsOfChrace() {
        return Unit.builder()
                .name("WarLionsOfChrace")
                .race(Race.HIGH_ELVES)
                .size(Size.LARGE)
                .unitAmount(18)
                .cost(825)
                .hitPointsPerUnit(254)
                .armor(35)
                .missileResistance(20)
                .leadership(55)
                .speed(82)
                .attack(30)
                .meleeInterval(4)
                .defence(28)
                .damage(16)
                .apDamage(34)
                .bonusAgainstInfantry(10)
                .chargeBonus(40)
                .skillsList(Arrays.asList(
                        Skills.CAUSE_FEAR))
                .build();
    }
}
