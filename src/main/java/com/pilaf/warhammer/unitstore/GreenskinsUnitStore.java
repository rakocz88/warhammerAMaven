package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.*;

import java.util.Arrays;
import java.util.List;

public class GreenskinsUnitStore {

    public static List<Unit> all(){
        return Arrays.asList(
                Goblins(), NightGoblins(), NightGoblinsFanatics(), OrcBoyz(), NastySkulkers(), SavageOrcs(), OrcBigUns(), SavageOrcBigUns(),
                BlackOrcs(), GoblinWolfRiders(), ForestGoblinSpiderRiders(), Trolls(), OrcBoarBoyz(), SavageOrcBoarBoyz(),
                OrcBoarBoyBigUns(), SavageOrcBoarBoyBigUns(), RiverTrolls(), StoneTrolls(),
                SquigHerd(), NightGoblinSquigHoppers(), SpiderHatchlings()
        );
    }

    public static Unit Goblins(){
        return  Unit.builder()
                .name("Goblins")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(300)
                .hitPointsPerUnit(56)
                .leadership(50)
                .speed(33)
                .attack(20)
                .defence(26)
                .chargeBonus(8)
                .damage(19)
                .apDamage(6)
                .meleeInterval(4.6)
                .armor(25)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD))
                .build();
    }

    public static Unit NightGoblins(){
        return  Unit.builder()
                .name("NightGoblins")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(400)
                .hitPointsPerUnit(56)
                .leadership(44)
                .speed(35)
                .attack(26)
                .defence(24)
                .chargeBonus(12)
                .damage(21)
                .apDamage(6)
                .meleeInterval(4)
                .armor(15)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD, Skills.POISON_ATTACK))
                .build();
    }

    // todo
    public static Unit NightGoblinsFanatics(){
        return  Unit.builder()
                .name("NightGoblinsFanatics")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(450)
                .hitPointsPerUnit(56)
                .leadership(44)
                .speed(35)
                .attack(26)
                .defence(24)
                .chargeBonus(12)
                .damage(21)
                .apDamage(6)
                .meleeInterval(4)
                .armor(15)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD, Skills.POISON_ATTACK))
                .build();
    }

    public static Unit OrcBoyz(){
        return  Unit.builder()
                .name("OrcBoyz")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(450)
                .hitPointsPerUnit(81)
                .leadership(60)
                .speed(31)
                .attack(28)
                .defence(25)
                .chargeBonus(20)
                .damage(26)
                .apDamage(8)
                .meleeInterval(3.9)
                .armor(30)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit NastySkulkers(){
        return  Unit.builder()
                .name("NastySkulkers")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(120)
                .cost(500)
                .hitPointsPerUnit(52)
                .leadership(40)
                .speed(37)
                .attack(26)
                .defence(16)
                .chargeBonus(20)
                .damage(6)
                .apDamage(18)
                .meleeInterval(4.5)
                .armor(15)
                .skillsList(Arrays.asList(Skills.SILVER_SHIELD, Skills.OPPORTUNIST_MURDERER))
                .build();
    }

    public static Unit SavageOrcs(){
        return  Unit.builder()
                .name("SavageOrcs")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(550)
                .hitPointsPerUnit(81)
                .leadership(58)
                .speed(37)
                .attack(28)
                .defence(16)
                .chargeBonus(26)
                .physicalResistance(25)
                .damage(26)
                .apDamage(9)
                .meleeInterval(4.3)
                .armor(0)
                .skillsList(Arrays.asList(Skills.FRENZY))
                .build();
    }

    public static Unit OrcBigUns(){
        return  Unit.builder()
                .name("OrcBigUns")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(800)
                .hitPointsPerUnit(108)
                .leadership(68)
                .speed(31)
                .attack(38)
                .defence(28)
                .chargeBonus(27)
                .damage(29)
                .apDamage(13)
                .meleeInterval(3.9)
                .armor(50)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit SavageOrcBigUns(){
        return  Unit.builder()
                .name("SavageOrcBigUns")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(900)
                .hitPointsPerUnit(108)
                .leadership(68)
                .speed(37)
                .attack(40)
                .defence(22)
                .chargeBonus(34)
                .physicalResistance(25)
                .damage(29)
                .bonusAgainstLarge(8)
                .apDamage(13)
                .meleeInterval(3.9)
                .armor(0)
                .skillsList(Arrays.asList(Skills.FRENZY))
                .build();
    }

    public static Unit BlackOrcs(){
        return  Unit.builder()
                .name("BlackOrcs")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(60)
                .cost(1150)
                .hitPointsPerUnit(135)
                .leadership(72)
                .speed(29)
                .attack(36)
                .defence(26)
                .chargeBonus(29)
                .damage(14)
                .apDamage(36)
                .meleeInterval(3.7)
                .armor(110)
                .skillsList(Arrays.asList(Skills.IMMUNE_TO_PSYCHOLOGY))
                .build();
    }

    public static Unit Trolls(){
        return  Unit.builder()
                .name("Trolls")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(800)
                .hitPointsPerUnit(494)
                .leadership(40)
                .speed(54)
                .attack(34)
                .splashAttack(true)
                .maxSplashUnitAmount(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .defence(32)
                .chargeBonus(24)
                .damage(30)
                .apDamage(70)
                .meleeInterval(3.8)
                .armor(40)
                .skillsList(Arrays.asList(Skills.REGENERATION))
                .build();
    }

    public static Unit RiverTrolls(){
        return  Unit.builder()
                .name("RiverTrolls")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(900)
                .hitPointsPerUnit(494)
                .leadership(40)
                .speed(54)
                .attack(30)
                .meleeInterval(3.8)
                .splashAttack(true)
                .maxSplashUnitAmount(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .defence(40)
                .chargeBonus(24)
                .damage(30)
                .apDamage(50)
                .armor(40)
                .skillsList(Arrays.asList(Skills.REGENERATION, Skills.OVERWHELMING_ODOUR))
                .build();
    }

    public static Unit StoneTrolls(){
        return  Unit.builder()
                .name("StoneTrolls")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(12)
                .cost(1100)
                .hitPointsPerUnit(494)
                .leadership(40)
                .speed(54)
                .attack(36)
                .meleeInterval(4)
                .splashAttack(true)
                .maxSplashUnitAmount(4)
                .splashTargetSize(SplashTargetSize.MEDIUM)
                .defence(32)
                .chargeBonus(34)
                .damage(39)
                .apDamage(81)
                .armor(40)
                .magicalResistance(25)
                .missileResistance(30)
                .skillsList(Arrays.asList(Skills.REGENERATION, Skills.OVERWHELMING_ODOUR))
                .build();
    }

    public static Unit GoblinWolfRiders(){
        return  Unit.builder()
                .name("GoblinWolfRiders")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(60)
                .cost(300)
                .hitPointsPerUnit(57)
                .leadership(44)
                .speed(92)
                .attack(22)
                .defence(20)
                .chargeBonus(18)
                .damage(19)
                .apDamage(6)
                .meleeInterval(4.6)
                .armor(25)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit ForestGoblinSpiderRiders(){
        return  Unit.builder()
                .name("ForestGoblinSpiderRiders")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(400)
                .hitPointsPerUnit(95)
                .leadership(50)
                .speed(78)
                .attack(22)
                .defence(30)
                .chargeBonus(24)
                .damage(21)
                .apDamage(6)
                .meleeInterval(4.3)
                .armor(45)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD, Skills.POISON_ATTACK))
                .build();
    }

    public static Unit NightGoblinSquigHoppers(){
        return  Unit.builder()
                .name("NightGoblinSquigHoppers")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(650)
                .hitPointsPerUnit(95)
                .leadership(50)
                .speed(84)
                .attack(22)
                .defence(22)
                .chargeBonus(30)
                .damage(21)
                .apDamage(6)
                .meleeInterval(4.5)
                .armor(25)
                .bonusAgainstInfantry(9)
                .skillsList(Arrays.asList(Skills.POISON_ATTACK))
                .build();
    }

    public static Unit OrcBoarBoyz(){
        return  Unit.builder()
                .name("OrcBoarBoyz")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(650)
                .hitPointsPerUnit(110)
                .leadership(60)
                .speed(60)
                .attack(22)
                .defence(22)
                .chargeBonus(46)
                .damage(10)
                .apDamage(20)
                .meleeInterval(4.6)
                .armor(55)
                .skillsList(Arrays.asList(Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit SavageOrcBoarBoyz(){
        return  Unit.builder()
                .name("SavageOrcBoarBoyz")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(750)
                .hitPointsPerUnit(110)
                .leadership(58)
                .speed(64)
                .attack(26)
                .defence(14)
                .chargeBonus(54)
                .physicalResistance(25)
                .damage(10)
                .apDamage(20)
                .meleeInterval(4.6)
                .armor(25)
                .skillsList(Arrays.asList(Skills.FRENZY))
                .build();
    }

    public static Unit OrcBoarBoyBigUns(){
        return  Unit.builder()
                .name("OrcBoarBoyBigUns")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(950)
                .hitPointsPerUnit(128)
                .leadership(68)
                .speed(62)
                .attack(22)
                .defence(20)
                .chargeBonus(50)
                .damage(9)
                .apDamage(23)
                .meleeInterval(5.1)
                .armor(75)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit SavageOrcBoarBoyBigUns(){
        return  Unit.builder()
                .name("SavageOrcBoarBoyBigUns")
                .race(Race.GREENSKINS)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1100)
                .hitPointsPerUnit(128)
                .leadership(68)
                .speed(66)
                .attack(28)
                .defence(14)
                .chargeBonus(58)
                .damage(12)
                .apDamage(24)
                .meleeInterval(4.5)
                .armor(25)
                .bonusAgainstLarge(5)
                .physicalResistance(25)
                .skillsList(Arrays.asList(Skills.FRENZY))
                .build();
    }

    public static Unit SquigHerd(){
        return  Unit.builder()
                .name("SquigHerd")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(30)
                .cost(300)
                .hitPointsPerUnit(128)
                .leadership(36)
                .speed(58)
                .attack(26)
                .defence(18)
                .chargeBonus(40)
                .damage(8)
                .apDamage(23)
                .bonusAgainstInfantry(11)
                .meleeInterval(3.8)
                .armor(50)
                .skillsList(Arrays.asList(Skills.RAMPAGE, Skills.CRAZY_SQUIQ))
                .build();
    }

    public static Unit SpiderHatchlings(){
        return  Unit.builder()
                .name("SpiderHatchlings")
                .race(Race.GREENSKINS)
                .size(Size.SMALL)
                .unitAmount(45)
                .cost(150)
                .hitPointsPerUnit(73)
                .armor(45)
                .leadership(50)
                .speed(76)
                .attack(22)
                .meleeInterval(4.3)
                .defence(20)
                .damage(18)
                .apDamage(5)
                .chargeBonus(19)
                .skillsList(Arrays.asList(Skills.POISON_ATTACK))
                .build();
    }
}
