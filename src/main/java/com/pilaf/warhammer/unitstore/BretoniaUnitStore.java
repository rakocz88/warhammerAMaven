package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;
import java.util.List;

public class BretoniaUnitStore {

    public static List<Unit> all() {
        return Arrays.asList(
                PeasantMob(), MenAtArms(), MenAtArmsShields(), SpearmenAtArms(), SpearmenAtArmsShields(), MenAtArmsPolearm(),
                BattlePilgrims(), FootSquires(), MountedYeomen(), KnightsErrant(), KnightsOfTheRealm(), QuestingKnights(), GrailKnights(), GrailGuardians(),
                PegasusKnights(), RoyalPegasusKnights()
        );
    }


    public static Unit PeasantMob() {
        return Unit.builder()
                .name("PeasantMob")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(100)
                .hitPointsPerUnit(54)
                .leadership(36)
                .speed(33)
                .attack(18)
                .defence(10)
                .chargeBonus(8)
                .damage(12)
                .apDamage(4)
                .meleeInterval(4.3)
                .armor(15)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit MenAtArms() {
        return Unit.builder()
                .name("Men-at-Arms")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(250)
                .hitPointsPerUnit(55)
                .leadership(50)
                .speed(30)
                .attack(27)
                .defence(26)
                .chargeBonus(10)
                .damage(20)
                .apDamage(6)
                .meleeInterval(4.3)
                .armor(30)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit MenAtArmsShields() {
        return Unit.builder()
                .name("MenAtArmsShields")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(350)
                .hitPointsPerUnit(55)
                .leadership(50)
                .speed(30)
                .attack(27)
                .defence(34)
                .chargeBonus(10)
                .damage(20)
                .apDamage(6)
                .meleeInterval(4.3)
                .armor(300)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD))
                .build();
    }

    public static Unit SpearmenAtArms() {
        return Unit.builder()
                .name("SpearmenAtArms")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(250)
                .hitPointsPerUnit(55)
                .leadership(50)
                .speed(30)
                .attack(18)
                .defence(30)
                .chargeBonus(4)
                .damage(17)
                .apDamage(5)
                .bonusAgainstLarge(15)
                .meleeInterval(5.7)
                .armor(30)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit SpearmenAtArmsShields() {
        return Unit.builder()
                .name("SpearmenAtArmsShields")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(350)
                .hitPointsPerUnit(55)
                .leadership(50)
                .speed(30)
                .attack(20)
                .defence(38)
                .bonusAgainstLarge(15)
                .chargeBonus(4)
                .damage(17)
                .apDamage(5)
                .meleeInterval(5.7)
                .armor(30)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD))
                .build();
    }

    public static Unit MenAtArmsPolearm() {
        return Unit.builder()
                .name("MenAtArmsPolearm")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(550)
                .hitPointsPerUnit(66)
                .leadership(56)
                .speed(30)
                .attack(22)
                .defence(40)
                .chargeBonus(6)
                .damage(7)
                .apDamage(18)
                .meleeInterval(5.5)
                .armor(30)
                .bonusAgainstLarge(18)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .build();
    }

    public static Unit BattlePilgrims() {
        return Unit.builder()
                .name("BattlePilgrims")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(600)
                .hitPointsPerUnit(69)
                .leadership(80)
                .speed(30)
                .attack(32)
                .defence(31)
                .chargeBonus(18)
                .damage(25)
                .apDamage(7)
                .meleeInterval(4.3)
                .armor(30)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD, Skills.FRENZY))
                .build();
    }

    public static Unit FootSquires() {
        return Unit.builder()
                .name("FootSquires")
                .race(Race.BRETONIA)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(675)
                .hitPointsPerUnit(69)
                .leadership(70)
                .speed(28)
                .attack(25)
                .defence(20)
                .chargeBonus(22)
                .damage(9)
                .apDamage(26)
                .bonusAgainstInfantry(9)
                .meleeInterval(4.3)
                .armor(70)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit MountedYeomen() {
        return Unit.builder()
                .name("MountedYeomen")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(400)
                .hitPointsPerUnit(66)
                .leadership(48)
                .speed(92)
                .attack(22)
                .defence(26)
                .chargeBonus(24)
                .damage(20)
                .apDamage(5)
                .meleeInterval(5)
                .armor(30)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit KnightsErrant() {
        return Unit.builder()
                .name("KnightsErrant")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(700)
                .hitPointsPerUnit(100)
                .leadership(60)
                .speed(75)
                .attack(26)
                .defence(26)
                .chargeBonus(54)
                .damage(21)
                .apDamage(9)
                .meleeInterval(5.1)
                .armor(80)
                .skillsList(Arrays.asList(Skills.CLIN, Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit KnightsOfTheRealm() {
        return Unit.builder()
                .name("KnightsOfTheRealm")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1000)
                .hitPointsPerUnit(108)
                .leadership(75)
                .speed(75)
                .attack(32)
                .defence(26)
                .chargeBonus(68)
                .damage(28)
                .apDamage(9)
                .meleeInterval(5.1)
                .armor(90)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD, Skills.CLIN))
                .build();
    }

    public static Unit QuestingKnights() {
        return Unit.builder()
                .name("QuestingKnights")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1200)
                .hitPointsPerUnit(112)
                .leadership(80)
                .speed(75)
                .attack(40)
                .defence(36)
                .chargeBonus(41)
                .damage(13)
                .apDamage(32)
                .meleeInterval(4.2)
                .armor(80)
                .skillsList(Arrays.asList(Skills.IMMUNE_TO_PSYCHOLOGY, Skills.CLIN))
                .build();
    }

    public static Unit GrailKnights() {
        return Unit.builder()
                .name("GrailKnights")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1500)
                .hitPointsPerUnit(112)
                .leadership(80)
                .speed(75)
                .attack(38)
                .defence(30)
                .chargeBonus(78)
                .damage(23)
                .apDamage(15)
                .bonusAgainstLarge(12)
                .meleeInterval(5.1)
                .physicalResistance(20)
                .armor(90)
                .skillsList(Arrays.asList(Skills.PERFECT_VIGOUR, Skills.CLIN,
                        Skills.IMMUNE_TO_PSYCHOLOGY, Skills.MAGICAL_ATTACK))
                .build();
    }

    public static Unit GrailGuardians() {
        return Unit.builder()
                .name("Grail Guardians")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1600)
                .hitPointsPerUnit(128)
                .leadership(85)
                .speed(70)
                .attack(35)
                .defence(56)
                .chargeBonus(38)
                .physicalResistance(20)
                .damage(23)
                .apDamage(12)
                .meleeInterval(4.5)
                .armor(120)
                .skillsList(Arrays.asList(Skills.PERFECT_VIGOUR, Skills.CLIN, Skills.BRONZE_SHIELD
                        , Skills.IMMUNE_TO_PSYCHOLOGY, Skills.MAGICAL_ATTACK))
                .build();
    }

    public static Unit PegasusKnights() {
        return Unit.builder()
                .name("PegasusKnights")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(18)
                .cost(1200)
                .hitPointsPerUnit(251)
                .leadership(70)
                .speed(105)
                .attack(32)
                .defence(26)
                .chargeBonus(55)
                .damage(42)
                .apDamage(14)
                .meleeInterval(4.7)
                .bonusAgainstLarge(10)
                .armor(80)
                .skillsList(Arrays.asList( Skills.BRONZE_SHIELD, Skills.FLYING))
                .build();
    }

    public static Unit RoyalPegasusKnights() {
        return Unit.builder()
                .name("RoyalPegasusKnights")
                .race(Race.BRETONIA)
                .size(Size.LARGE)
                .unitAmount(18)
                .cost(1600)
                .hitPointsPerUnit(260)
                .leadership(70)
                .speed(105)
                .attack(42)
                .physicalResistance(20)
                .defence(30)
                .chargeBonus(65)
                .damage(42)
                .apDamage(19)
                .meleeInterval(4.7)
                .bonusAgainstLarge(12)
                .armor(80)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD, Skills.PERFECT_VIGOUR, Skills.MAGICAL_ATTACK, Skills.IMMUNE_TO_PSYCHOLOGY, Skills.FLYING))
                .build();
    }

}
