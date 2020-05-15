package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;

public class WoodElfsUnitStore {

    public static Unit Treeman(){
            return  Unit.builder()
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
