package com.pilaf.warhammer.combat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UnitService {

    private final ChargeHelper chargeHelper;
    private static final int ATTACK_BASE_INTERVAL = 10;

    public double calculateAttackChance(Unit unit, Unit target) {
        double attackChange = 0.7 + (((unit.getAttack()
                - target.getDefence()
                + calculateBonus(unit, target.getSize())
                + chargeHelper.calculateBonusAttack(unit, target))
                * 0.01)
        );
        if (attackChange > 1) {
            attackChange = 1;
        } else if (attackChange < 0.05) {
            attackChange = 0.05;
        }
        return attackChange;
    }


    public double calculateAverageDamage(Unit unit, Unit target) {
        double apDamageComputed = unit.getApDamage();
        // todo fix fire attacks
        if (isMagicalOrFireAttack(unit)) {
            apDamageComputed = damageWithBonuses(unit.getApDamage(),unit,  target)
                    * calculateResistanceModifier(target.getMagicalResistance())
                    * calculateResistanceModifier(target.getFireResistance());
        } else {
            apDamageComputed = damageWithBonuses(unit.getApDamage(), unit,  target) * calculateResistanceModifier(target.getPhysicalResistance());
        }
        double standardDamageComputed = unit.getDamage();
        if (isMagicalOrFireAttack(unit)) {
            standardDamageComputed = damageWithBonuses(unit.getDamage(), unit, target)
                    * calculateResistanceModifier(target.getMagicalResistance())
                    * calculateResistanceModifier(target.getFireResistance())
                    * calculateArmorReduction(target.getArmor());
        } else {
            standardDamageComputed = damageWithBonuses(unit.getDamage(), unit,  target)
                    * calculateResistanceModifier(target.getPhysicalResistance())
                    * calculateArmorReduction(target.getArmor());
        }
        return apDamageComputed + standardDamageComputed;
    }

    public double damageWithBonuses(double damage, Unit unit, Unit target) {
        return damage
                + calculateBonusDamage(unit, target.getSize(), damage)
                + chargeHelper.calculateBonusDamage(damage, unit, target);
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

    private double calculateBonusDamage( Unit unit, Size size,  double damage) {
        double bonus = 0;
        if (size.equals(Size.INFANTRY)) {
            bonus += (unit.getBonusAgainstInfantry() * (damage / (unit.getDamage() + unit.getApDamage())));
        }
        if (size.equals(Size.LARGE)) {
            bonus += (unit.getBonusAgainstLarge() * (damage / (unit.getDamage() + unit.getApDamage())));
        }
        return bonus;
    }


    private double calculateArmorReduction(double armor) {
        return 1 - (((armor + (armor / 2)) / 2) * 0.01);
    }

    private boolean isMagicalOrFireAttack(Unit unit) {
        return unit.getSkillsList().contains(Skills.MAGICAL_ATTACK) || unit.getSkillsList().contains(Skills.FIRE_ATTACK);
    }

    private double calculateResistanceModifier(double resistance) {
        return ((100 - resistance) / 100);

    }
}
