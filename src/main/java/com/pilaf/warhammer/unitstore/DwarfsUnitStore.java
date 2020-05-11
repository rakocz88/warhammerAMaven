package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;
import java.util.List;

public class DwarfsUnitStore {

    public static List<Unit> all(){
        return Arrays.asList(
                Miners(), MinersBlastingCharges(), DwarfWarriors(), DwarfWarriorsGreatWeapons(),
                Longbeards(), LongbeardsGreatWeapons() ,Slayers(), Hammerers(), GiantSlayers(), Ironbreakers()
        );
    }

    public static Unit Miners(){
        return  Unit.builder()
                .name("Miners")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(325)
                .hitPointsPerUnit(76)
                .leadership(68)
                .speed(28)
                .attack(18)
                .defence(18)
                .chargeBonus(6)
                .magicalResistance(25)
                .damage(5)
                .apDamage(17)
                .meleeInterval(4.3)
                .armor(80)
                .skillsList(Arrays.asList())
                .build();
    }

    // todo blasting charge
    public static Unit MinersBlastingCharges(){
        return Unit.builder()
                .name("MinersBlastingCharges")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(425)
                .hitPointsPerUnit(76)
                .leadership(68)
                .speed(28)
                .attack(18)
                .defence(18)
                .chargeBonus(6)
                .magicalResistance(25)
                .damage(5)
                .apDamage(17)
                .meleeInterval(4.3)
                .armor(80)
                .skillsList(Arrays.asList())
                .build();
    }

    public static Unit DwarfWarriors(){
        return Unit.builder()
                .name("DwarfWarriors")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(450)
                .hitPointsPerUnit(78)
                .leadership(70)
                .speed(28)
                .attack(22)
                .defence(40)
                .chargeBonus(12)
                .magicalResistance(25)
                .damage(21)
                .apDamage(7)
                .meleeInterval(4.3)
                .armor(85)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_AGAINST_LARGE, Skills.BRONZE_SHIELD))
                .build();
    }

    public static Unit DwarfWarriorsGreatWeapons(){
        return Unit.builder()
                .name("DwarfWarriorsGreatWeapons")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(500)
                .hitPointsPerUnit(78)
                .leadership(70)
                .speed(28)
                .attack(22)
                .defence(30)
                .chargeBonus(18)
                .magicalResistance(25)
                .damage(7)
                .apDamage(23)
                .meleeInterval(4.3)
                .armor(85)
                .skillsList(Arrays.asList())
                .build();
    }

    // todo
    public static Unit LongbeardsGreatWeapons(){
        return Unit.builder()
                .name("LongbeardsGreatWeapons")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(750)
                .hitPointsPerUnit(86)
                .leadership(80)
                .speed(26)
                .attack(30)
                .defence(38)
                .chargeBonus(16)
                .magicalResistance(25)
                .damage(9)
                .apDamage(25)
                .meleeInterval(4.3)
                .armor(100)
                .skillsList(Arrays.asList())
                .build();
    }

    // todo
    public static Unit Longbeards(){
        return Unit.builder()
                .name("Longbeards")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(650)
                .hitPointsPerUnit(86)
                .leadership(80)
                .speed(26)
                .attack(30)
                .defence(48)
                .chargeBonus(10)
                .magicalResistance(25)
                .damage(25)
                .apDamage(7)
                .meleeInterval(4.3)
                .armor(100)
                .skillsList(Arrays.asList(
                        Skills.CHARGE_DEFENCE_AGAINST_LARGE, Skills.BRONZE_SHIELD,
                        Skills.IMMUNE_TO_PSYCHOLOGY, Skills.ENCOURAGE))
                .build();
    }



    // todo deathblow unbreakable
    public static Unit Slayers(){
        return Unit.builder()
                .name("Slayers")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(60)
                .cost(900)
                .hitPointsPerUnit(108)
                .leadership(100)
                .speed(40)
                .attack(38)
                .defence(32)
                .chargeBonus(26)
                .magicalResistance(25)
                .damage(32)
                .apDamage(16)
                .bonusAgainstLarge(24)
                .meleeInterval(4.3)
                .armor(0)
                .skillsList(Arrays.asList(Skills.UNBREAKABLE, Skills.DEATHBLOW))
                .build();
    }

    public static Unit Hammerers(){
        return Unit.builder()
                .name("Hammerers")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(1100)
                .hitPointsPerUnit(92)
                .leadership(80)
                .speed(28)
                .attack(46)
                .defence(35)
                .chargeBonus(18)
                .magicalResistance(25)
                .damage(14)
                .apDamage(41)
                .meleeInterval(4.2)
                .armor(100)
                .skillsList(Arrays.asList())
                .build();
    }


    // todo deathblow
    public static Unit GiantSlayers(){
        return Unit.builder()
                .name("GiantSlayers")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(60)
                .cost(1200)
                .hitPointsPerUnit(108)
                .leadership(100)
                .speed(40)
                .attack(50)
                .defence(30)
                .chargeBonus(32)
                .magicalResistance(25)
                .damage(10)
                .apDamage(33)
                .meleeInterval(4.3)
                .armor(0)
                .bonusAgainstLarge(30)
                .skillsList(Arrays.asList(Skills.UNBREAKABLE, Skills.DEATHBLOW))
                .build();
    }



    // todo blasting hit
    public static Unit Ironbreakers(){
        return Unit.builder()
                .name("Ironbreakers")
                .race(Race.DWARFS)
                .size(Size.INFANTRY)
                .unitAmount(75)
                .cost(1300)
                .hitPointsPerUnit(96)
                .leadership(85)
                .speed(26)
                .attack(30)
                .defence(68)
                .chargeBonus(8)
                .magicalResistance(25)
                .damage(22)
                .apDamage(10)
                .meleeInterval(4.3)
                .armor(125)
                .skillsList(Arrays.asList(Skills.CHARGE_DEFENCE_EXPERT))
                .build();
    }
}
