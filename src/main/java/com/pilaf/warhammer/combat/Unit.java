package com.pilaf.warhammer.combat;


import lombok.Builder;
import lombok.Data;
import lombok.Value;

import java.util.List;

@Data
@Builder
public class Unit {
    private static final int ATACK_BASE_INTERVAL = 10;

    private String name;
    private Race race;
    private Size size;
    private int unitAmount;
    private int hitPointsPerUnit;
    private int attack;
    private int defence;
    private int armor;
    private int damage;
    private int speed;
    private double meleeInterval;
    private int apDamage;
    private int leadership;
    private int chargeBonus;
    private int physicalResistance;
    private int magicalResistance;
    private int fireResistance;
    private int maxUnitAttackAmount;
    private int bonusAgainstLarge;
    private int bonusAgainstInfantry;
    private List<Skills> skillsList;
    private int cost;
    private int range;
    private int missileDamage;
    private int apMissileDamage;
    private int accuracy;


    public double calculateAttackChance(Unit target) {
        double attackChange = 0.7 + (((this.attack
                - target.defence
                + calculateBonus(target.size)
                + ChargeHelper.calculateBonusAttack(this, target))
                * 0.01)
        );
        if (attackChange > 1) {
            attackChange = 1;
        } else if (attackChange < 0.05) {
            attackChange = 0.05;
        }
        return attackChange;
    }


    public double calculateAverageDamage(Unit target) {
        double apDamageComputed = this.apDamage;
        if (isMagicalOrFireAttack()) {
            apDamageComputed = damageWithBonuses(this.apDamage, target)
                    * calculateResistanceModifier(target.magicalResistance)
                    * calculateResistanceModifier(target.fireResistance);
        } else {
            apDamageComputed = damageWithBonuses(this.apDamage, target) * calculateResistanceModifier(target.physicalResistance);
        }
        double standardDamageComputed = this.damage;
        if (isMagicalOrFireAttack()) {
            standardDamageComputed = damageWithBonuses(this.damage, target)
                    * calculateResistanceModifier(target.magicalResistance)
                    * calculateResistanceModifier(target.fireResistance)
                    * calculateArmorReduction(target.armor);
        } else {
            standardDamageComputed = damageWithBonuses(this.damage, target)
                    * calculateResistanceModifier(target.physicalResistance)
                    * calculateArmorReduction(target.armor);
        }
        return apDamageComputed + standardDamageComputed;
    }

    public double damageWithBonuses(double damage, Unit target) {
        return damage
                + calculateBonusDamage(target.size, damage)
                + ChargeHelper.calculateBonusDamage(damage, this, target);
    }

    public double calculateSpeedModifier() {
        return ATACK_BASE_INTERVAL / this.meleeInterval;
    }

    public double calculateUnitAmountSizeBonus(Unit target) {
        if (this.unitAmount < target.getUnitAmount()) {
            return 1;
        } else {
            return this.unitAmount / target.getUnitAmount();
        }
    }


    private int calculateBonus(Size size) {
        int bonus = 0;
        if (size.equals(Size.INFANTRY)) {
            bonus += this.bonusAgainstInfantry;
        }
        if (size.equals(Size.LARGE)) {
            bonus += this.bonusAgainstLarge;
        }
        return bonus;
    }

    private double calculateBonusDamage(Size size, double damage) {
        double bonus = 0;
        if (size.equals(Size.INFANTRY)) {
            bonus += (this.bonusAgainstInfantry * (damage / (this.damage + this.apDamage)));
        }
        if (size.equals(Size.LARGE)) {
            bonus += (this.bonusAgainstLarge * (damage / (this.damage + this.apDamage)));
        }
        return bonus;
    }


    private double calculateArmorReduction(double armor) {
        return 1 - (((armor + (armor / 2)) / 2) * 0.01);
    }

    private boolean isMagicalOrFireAttack() {
        return this.skillsList.contains(Skills.MAGICAL_ATTACK) || this.skillsList.contains(Skills.FIRE_ATTACK);
    }

    private double calculateResistanceModifier(double resistance) {
        return ((100 - resistance) / 100);

    }
}
