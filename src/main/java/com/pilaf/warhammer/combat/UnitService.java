package com.pilaf.warhammer.combat;

import com.pilaf.warhammer.combat.skills.SkillsModifierHelper;
import com.pilaf.warhammer.combat.skills.Target;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class UnitService {

    private final ChargeHelper chargeHelper;
    private final SkillsModifierHelper skillsModifierHelper;
    private static final int ATTACK_BASE_INTERVAL = 10;

    public double calculateAttackChance(Unit unit, Unit target) {
        double attackChance = 0.4 + (calculateAttackModifier(unit, target) * 0.01);
        if (attackChance > 0.9) {
            attackChance = 0.9;
        } else if (attackChance < 0.1) {
            attackChance = 0.1;
        }
        log.info("Chance to {} hit {} is {}", unit.getName(), target.getName(), attackChance);
        return attackChance;
    }

    private double calculateAttackModifier(Unit unit, Unit target) {
        double attackSum = (
                unit.getAttack()
                        + calculateBonus(unit, target.getSize())
                        + chargeHelper.calculateBonusAttack(unit, target));
        double attackSumAfterEffects = skillsModifierHelper.calculateAttackAfterEffect(attackSum, unit, target);
        // fixme charge will not be calculated from skills
        double defenceSumAfterEffect = skillsModifierHelper.calculateDefenceAfterEffect(target.getDefence(), target, unit);
        return attackSumAfterEffects - defenceSumAfterEffect;
    }


    public double calculateAverageDamage(Unit unit, Unit target) {
        double apDamageComputed = unit.getApDamage();
        // todo fix fire attacks
        if (isMagicalOrFireAttack(unit)) {
            apDamageComputed = damageWithBonuses(unit.getApDamage(), unit, target)
                    * calculateResistanceModifier(target.getMagicalResistance())
                    * calculateResistanceModifier(target.getFireResistance());
        } else {
            apDamageComputed = damageWithBonuses(unit.getApDamage(), unit, target) * calculateResistanceModifier(target.getPhysicalResistance());
        }
        double standardDamageComputed = unit.getDamage();
        if (isMagicalOrFireAttack(unit)) {
            standardDamageComputed = damageWithBonuses(unit.getDamage(), unit, target)
                    * calculateResistanceModifier(target.getMagicalResistance())
                    * calculateResistanceModifier(target.getFireResistance())
                    * calculateArmorReduction(
                    target.getArmor(), unit, target
            );
        } else {
            standardDamageComputed = damageWithBonuses(unit.getDamage(), unit, target)
                    * calculateResistanceModifier(target.getPhysicalResistance())
                    * calculateArmorReduction(target.getArmor(), unit, target);
        }
        log.info("Average Damage {} on {} is {}", unit.getName(), target.getName(), apDamageComputed + standardDamageComputed);
        return apDamageComputed + standardDamageComputed;
    }

    public double damageWithBonuses(double damage, Unit unit, Unit target) {
        double damageSummary = damage
                + calculateBonusDamage(unit, target.getSize(), damage)
                // fixme chargebonus will not be applied from skills
                + chargeHelper.calculateBonusDamage(damage, unit, target);
        return skillsModifierHelper.calculateDamageAfterEffect(damageSummary, unit, target);
    }

    public double calculateSpeedModifier(Unit unit) {
        return ATTACK_BASE_INTERVAL / unit.getMeleeInterval();
    }

    public double calculateUnitAmountSizeBonus(Unit unit, Unit target) {
        if (unit.getUnitAmount() < target.getUnitAmount()) {
            return 1;
        } else {
            return 1 + ((unit.getUnitAmount() / target.getUnitAmount()) / 4);
        }
    }


    private int calculateBonus(Unit unit, Size size) {
        int bonus = 0;
        if (size.equals(Size.INFANTRY)) {
            bonus += unit.getBonusAgainstInfantry();
        }
        if (size.equals(Size.LARGE)) {
            bonus += unit.getBonusAgainstLarge();
        }
        return bonus;
    }

    private double calculateBonusDamage(Unit unit, Size size, double damage) {
        double bonus = 0;
        if (size.equals(Size.INFANTRY)) {
            bonus += (unit.getBonusAgainstInfantry() * (damage / (unit.getDamage() + unit.getApDamage())));
        }
        if (size.equals(Size.LARGE)) {
            bonus += (unit.getBonusAgainstLarge() * (damage / (unit.getDamage() + unit.getApDamage())));
        }
        return bonus;
    }


    private double calculateArmorReduction(double armor, Unit unit, Unit target) {
        double modifiedArmor = skillsModifierHelper.calculateArmorAfterEffect(armor, unit, target);
        return 1 - (((modifiedArmor + (modifiedArmor / 2)) / 2) * 0.01);
    }

    private boolean isMagicalOrFireAttack(Unit unit) {
        return unit.getSkillsList().contains(Skills.MAGICAL_ATTACK) || unit.getSkillsList().contains(Skills.FIRE_ATTACK);
    }

    private double calculateResistanceModifier(double resistance) {
        return ((100 - resistance) / 100);

    }
}
