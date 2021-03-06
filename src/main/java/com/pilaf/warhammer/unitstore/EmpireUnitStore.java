package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpireUnitStore {

    public static List<Unit> all(){
        return Arrays.asList(Spearmens(), SpearmenShields(), Swordsman(), Flagellants(), Halberdiers(),
                Greatswords(), EmpireKnights(), Reiksguard(), KnightsOfTheBlazingSun(), DemigryphKnights(),
                DemigryphKnightsHalberds());
    }

    public static Unit test(){
        return Unit.builder()
                .name("Test")
                .race(Race.EMPIRE)
                .unitAmount(90)
                .armor(30)
                .size(Size.SMALL)
                .meleeInterval(5.0)
                .hitPointsPerUnit(70)
                .leadership(60)
                .speed(30)
                .attack(25)
                .defence(25)
                .chargeBonus(10)
                .damage(12)
                .apDamage(12)
                .skillsList(Collections.emptyList())
                .cost(300)
                .build();
    }

    public static Unit Spearmens(){
        return Unit.builder()
                .name("Spearmens")
                .race(Race.EMPIRE)
                .unitAmount(90)
                .armor(30)
                .size(Size.SMALL)
                .meleeInterval(5.7)
                .hitPointsPerUnit(69)
                .leadership(60)
                .speed(30)
                .attack(20)
                .defence(34)
                .chargeBonus(4)
                .damage(19)
                .apDamage(6)
                .bonusAgainstLarge(15)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE))
                .cost(300)
                .build();

    }

    public static Unit SpearmenShields(){
        return  Unit.builder()
                .name("SpearmenShields")
                .race(Race.EMPIRE)
                .unitAmount(90)
                .armor(30)
                .size(Size.SMALL)
                .meleeInterval(4.4)
                .hitPointsPerUnit(69)
                .leadership(60)
                .speed(30)
                .attack(20)
                .defence(42)
                .chargeBonus(4)
                .damage(19)
                .apDamage(6)
                .bonusAgainstLarge(15)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE, Skills.BRONZE_SHIELD))
                .cost(400)
                .build();
    }

    public static Unit Swordsman(){
        return  Unit.builder()
                .name("Swordsman")
                .race(Race.EMPIRE)
                .unitAmount(90)
                .armor(30)
                .size(Size.SMALL)
                .meleeInterval(4.3)
                .hitPointsPerUnit(69)
                .leadership(60)
                .speed(30)
                .attack(32)
                .defence(32)
                .chargeBonus(14)
                .damage(21)
                .apDamage(7)
                .skillsList(Arrays.asList( Skills.BRONZE_SHIELD))
                .cost(400)
                .build();
    }

    public static Unit Flagellants(){
        return  Unit.builder()
                .name("flagellants")
                .race(Race.EMPIRE)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(600)
                .hitPointsPerUnit(73)
                .leadership(100)
                .speed(36)
                .attack(32)
                .defence(10)
                .chargeBonus(24)
                .damage(25)
                .apDamage(8)
                .meleeInterval(4.5)
                .armor(0)
                .skillsList(Arrays.asList( Skills.FRENZY))
                .build();
    }

    public static Unit Halberdiers(){
        return  Unit.builder()
                .name("halberdier")
                .race(Race.EMPIRE)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(650)
                .hitPointsPerUnit(73)
                .leadership(70)
                .speed(30)
                .attack(26)
                .defence(42)
                .chargeBonus(8)
                .damage(8)
                .apDamage(20)
                .meleeInterval(5.6)
                .armor(30)
                .bonusAgainstLarge(16)
                .skillsList(Arrays.asList( Skills.CHARGE_DEFENCE_EXPERT))
                .build();
    }

    public static Unit Greatswords(){
        return Unit.builder()
                .name("Greatswords")
                .race(Race.EMPIRE)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(900)
                .hitPointsPerUnit(76)
                .leadership(74)
                .speed(28)
                .attack(32)
                .defence(30)
                .chargeBonus(18)
                .damage(9)
                .apDamage(23)
                .meleeInterval(3.8)
                .armor(95)
                .bonusAgainstInfantry(10)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit Reiksguard(){
        return Unit.builder()
                .name("Reiksguard")
                .race(Race.EMPIRE)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1150)
                .hitPointsPerUnit(112)
                .leadership(72)
                .speed(66)
                .attack(34)
                .defence(34)
                .chargeBonus(62)
                .damage(28)
                .apDamage(12)
                .meleeInterval(5.1)
                .armor(120)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit KnightsOfTheBlazingSun(){
        return Unit.builder()
                .name("KnightsOfTheBlazingSun")
                .race(Race.EMPIRE)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1200)
                .hitPointsPerUnit(112)
                .leadership(70)
                .speed(71)
                .attack(40)
                .defence(24)
                .chargeBonus(78)
                .damage(23)
                .apDamage(13)
                .meleeInterval(5.1)
                .armor(100)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD, Skills.FIRE_ATTACK))
                .build();
    }

    public static Unit DemigryphKnights(){
        return Unit.builder()
                .name("DemigryphKnights")
                .race(Race.EMPIRE)
                .size(Size.LARGE)
                .unitAmount(24)
                .cost(1500)
                .hitPointsPerUnit(210)
                .leadership(70)
                .speed(75)
                .attack(38)
                .defence(36)
                .chargeBonus(60)
                .damage(19)
                .apDamage(39)
                .meleeInterval(4.7)
                .armor(125)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit DemigryphKnightsHalberds(){
        return Unit.builder()
                .name("DemigryphKnightsHalberds")
                .race(Race.EMPIRE)
                .size(Size.LARGE)
                .unitAmount(24)
                .cost(1500)
                .hitPointsPerUnit(210)
                .leadership(70)
                .speed(75)
                .attack(32)
                .defence(30)
                .chargeBonus(48)
                .damage(17)
                .apDamage(35)
                .meleeInterval(4.8)
                .armor(125)
                .skillsList(Arrays.asList())
                .bonusAgainstLarge(25)
                .build();
    }

    public static Unit EmpireKnights(){
        return Unit.builder()
                .name("EmpireKnights")
                .race(Race.EMPIRE)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(900)
                .hitPointsPerUnit(104)
                .leadership(70)
                .speed(66)
                .attack(26)
                .defence(28)
                .chargeBonus(48)
                .damage(21)
                .apDamage(9)
                .meleeInterval(5.1)
                .armor(110)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }


}
