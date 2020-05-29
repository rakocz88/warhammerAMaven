package com.pilaf.warhammer.combat;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Data()
@Builder(access = AccessLevel.PUBLIC)
public class Unit {

    @Autowired
    private ChargeHelper chargeHelper;

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
    private List<Skills> skillsList = new ArrayList<>();
    private int cost;
    private int range;
    private int missileDamage;
    private int apMissileDamage;
    private int accuracy;
    private int missileAmount;
    private int missileResistance;
    private boolean splashAttack;
    private int maxSplashUnitAmount;
    private SplashTargetSize splashTargetSize;
    private int tier;



}
