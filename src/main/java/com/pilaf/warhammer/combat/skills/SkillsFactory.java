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
            return new PrimalFury();
        } if (skills == Skills.MADNESS_OF_KHAINE){
            return new MadnessOfKhaine();
        } if (skills == Skills.ROWDY){
            return new Rowdy();
        } if (skills == Skills.BLOODGREED){
            return new Bloodgreed();
        } if (skills == Skills.CAUSE_FEAR){
            return new CauseFear();
        } if (skills == Skills.CAUSE_TERROR){
            return new CauseTerror();
        } if (skills == Skills.MARTIAL_PROWES){
            return new MartialProwess();
        } if (skills == Skills.MARTIAL_MASTERY){
            return new MartialMastery();
        } if (skills == Skills.STRENTH_IN_NUMBERS){
            return new StrenthInNumbers();
        } if (skills == Skills.CHARMED){
            return new Charmed();
        } if (skills == Skills.SUNDER_ARMOR){
            return new SunderedArmor();
        }
        return null;
    }
}
