package com.pilaf.warhammer.combat.skills;

import com.pilaf.warhammer.combat.Skills;
import org.springframework.stereotype.Component;

@Component
public class SkillsFactory {

    public SkillsEffect create(Skills skills){
        if (skills== Skills.FRENZY){
            return new Frenzy();
        } if (skills == Skills.POISON_ATTACK){
            return new PoisonAttack();
        } if (skills == Skills.PRIMAL_FRENZY){
            return new PrimalFrenzy();
        } if (skills == Skills.MADNESS_OF_KHAINE){
            return new MadnessOfKhaine();
        }
        return null;
    }
}
