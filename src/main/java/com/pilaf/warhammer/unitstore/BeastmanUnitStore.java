package com.pilaf.warhammer.unitstore;

import com.pilaf.warhammer.combat.Race;
import com.pilaf.warhammer.combat.Size;
import com.pilaf.warhammer.combat.Skills;
import com.pilaf.warhammer.combat.Unit;

import java.util.Arrays;

public class BeastmanUnitStore {

    public static Unit Minotaurs(){
            return  Unit.builder()
                    .name("Minotaurs")
                    .race(Race.BEASTMAN)
                    .size(Size.LARGE)
                    .unitAmount(12)
                    .cost(1200)
                    .hitPointsPerUnit(514)
                    .leadership(60)
                    .speed(56)
                    .attack(40)
                    .defence(32)
                    .chargeBonus(38)
                    .damage(33)
                    .apDamage(77)
                    .meleeInterval(4.1)
                    .armor(35)
                    .skillsList(Arrays.asList(Skills.CAUSE_FEAR))
                    .build();

    }
}
