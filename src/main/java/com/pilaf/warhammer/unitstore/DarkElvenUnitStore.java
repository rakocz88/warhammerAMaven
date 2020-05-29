package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;
import java.util.List;

public class DarkElvenUnitStore {

    public static List<Unit> all(){
        return Arrays.asList(
                Bleakswords(), Dreadspears(), BlackArkCorsairs(), WitchElves(), SistersOfSlaughter(), HarGanethExecutioners(), BlackGuardOfNaggarond(),
                DarkRiders(), DarkRidersShields(), ColdOneKnights(), DoomfireWarlocks(), ColdOneDreadKnights()
        );
    }

    public static Unit Bleakswords(){
        return  Unit.builder()
                .name("Bleakswords")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(450)
                .hitPointsPerUnit(63)
                .leadership(66)
                .speed(33)
                .attack(34)
                .defence(30)
                .chargeBonus(15)
                .damage(21)
                .apDamage(7)
                .meleeInterval(4.4)
                .armor(30)
                .skillsList(Arrays.asList( Skills.SILVER_SHIELD, Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit Dreadspears(){
        return  Unit.builder()
                .name("Dreadspears")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(90)
                .cost(450)
                .hitPointsPerUnit(63)
                .leadership(66)
                .speed(33)
                .attack(25)
                .defence(40)
                .chargeBonus(8)
                .damage(19)
                .apDamage(6)
                .meleeInterval(4.6)
                .armor(30)
                .bonusAgainstLarge(14)
                .skillsList(Arrays.asList( Skills.SILVER_SHIELD, Skills.CHARGE_DEFENCE_AGAINST_LARGE, Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit BlackArkCorsairs(){
        return  Unit.builder()
                .name("BlackArkCorsairs")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(600)
                .hitPointsPerUnit(69)
                .leadership(66)
                .speed(40)
                .attack(36)
                .defence(28)
                .chargeBonus(16)
                .damage(21)
                .apDamage(7)
                .bonusAgainstInfantry(7)
                .meleeInterval(4.8)
                .armor(80)
                .skillsList(Arrays.asList(Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit WitchElves(){
        return  Unit.builder()
                .name("WitchElves")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(800)
                .hitPointsPerUnit(65)
                .leadership(75)
                .speed(44)
                .attack(38)
                .defence(26)
                .chargeBonus(24)
                .damage(23)
                .apDamage(9)
                .meleeInterval(4.6)
                .armor(5)
                .bonusAgainstInfantry(8)
                .physicalResistance(20)
                .skillsList(Arrays.asList( Skills.FRENZY, Skills.MADNESS_OF_KHAINE, Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit SistersOfSlaughter(){
        return  Unit.builder()
                .name("SistersOfSlaughter")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(1100)
                .hitPointsPerUnit(75)
                .leadership(82)
                .speed(44)
                .attack(37)
                .defence(59)
                .chargeBonus(20)
                .physicalResistance(20)
                .damage(27)
                .apDamage(11)
                .meleeInterval(4.5)
                .armor(5)
                .skillsList(Arrays.asList( Skills.MURDEROUS_MASTERY, Skills.POISON_ATTACK))
                .build();
    }

    public static Unit HarGanethExecutioners(){
        return  Unit.builder()
                .name("HarGanethExecutioners")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(1200)
                .hitPointsPerUnit(84)
                .leadership(82)
                .speed(31)
                .attack(38)
                .defence(34)
                .chargeBonus(24)
                .damage(13)
                .apDamage(29)
                .meleeInterval(4.3)
                .armor(100)
                .bonusAgainstInfantry(14)
                .skillsList(Arrays.asList( Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit BlackGuardOfNaggarond(){
        return  Unit.builder()
                .name("BlackGuardOfNaggarond")
                .race(Race.DARK_ELVES)
                .size(Size.SMALL)
                .unitAmount(75)
                .cost(1300)
                .hitPointsPerUnit(90)
                .leadership(90)
                .speed(31)
                .attack(36)
                .defence(48)
                .chargeBonus(18)
                .damage(14)
                .apDamage(30)
                .meleeInterval(4.9)
                .armor(100)
                .bonusAgainstLarge(24)
                .skillsList(Arrays.asList( Skills.CHARGE_DEFENCE_AGAINST_LARGE, Skills.IMMUNE_TO_PSYCHOLOGY, Skills.MURDEROUS_MASTERY))
                .build();
    }


    public static Unit DarkRiders(){
        return  Unit.builder()
                .name("DarkRiders")
                .race(Race.DARK_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(450)
                .hitPointsPerUnit(89)
                .leadership(52)
                .speed(92)
                .attack(24)
                .defence(22)
                .chargeBonus(40)
                .damage(20)
                .apDamage(6)
                .meleeInterval(4.5)
                .armor(30)
                .skillsList(Arrays.asList(Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit DarkRidersShields(){
        return  Unit.builder()
                .name("DarkRidersShields")
                .race(Race.DARK_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(500)
                .hitPointsPerUnit(89)
                .leadership(52)
                .speed(92)
                .attack(24)
                .defence(28)
                .chargeBonus(40)
                .damage(20)
                .apDamage(6)
                .meleeInterval(4.5)
                .armor(30)
                .skillsList(Arrays.asList( Skills.BRONZE_SHIELD,  Skills.MURDEROUS_MASTERY))
                .build();
    }

    public static Unit ColdOneKnights(){
        return  Unit.builder()
                .name("ColdOneKnights")
                .race(Race.DARK_ELVES)
                .size(Size.LARGE)
                .unitAmount(36)
                .cost(1000)
                .hitPointsPerUnit(120)
                .leadership(75)
                .speed(62)
                .attack(29)
                .defence(26)
                .chargeBonus(44)
                .damage(12)
                .apDamage(30)
                .meleeInterval(4.2)
                .armor(100)
                .bonusAgainstLarge(14)
                .skillsList(Arrays.asList( Skills.CAUSE_FEAR,  Skills.BRONZE_SHIELD,
                        Skills.MURDEROUS_MASTERY, Skills.PRIMAL_INSTINCTS))
                .build();
    }

    public static Unit DoomfireWarlocks(){
        return  Unit.builder()
                .name("DoomfireWarlocks")
                .race(Race.DARK_ELVES)
                .size(Size.LARGE)
                .unitAmount(45)
                .cost(1100)
                .hitPointsPerUnit(89)
                .leadership(65)
                .speed(92)
                .attack(32)
                .defence(22)
                .chargeBonus(40)
                .damage(32)
                .apDamage(13)
                .meleeInterval(4.5)
                .armor(15)
                .physicalResistance(40)
                .skillsList(Arrays.asList( Skills.SOUL_DECAY, Skills.MAGICAL_ATTACK, Skills.MURDEROUS_MASTERY, Skills.POISON_ATTACK))
                .build();
    }

    public static Unit ColdOneDreadKnights(){
        return  Unit.builder()
                .name("ColdOneDreadKnights")
                .race(Race.DARK_ELVES)
                .size(Size.LARGE)
                .unitAmount(36)
                .cost(1300)
                .hitPointsPerUnit(120)
                .leadership(80)
                .speed(66)
                .attack(39)
                .defence(42)
                .chargeBonus(36)
                .damage(14)
                .apDamage(34)
                .meleeInterval(4.3)
                .armor(120)
                .skillsList(Arrays.asList( Skills.BRONZE_SHIELD, Skills.PRIMAL_INSTINCTS, Skills.MURDEROUS_MASTERY))
                .build();
    }
}
