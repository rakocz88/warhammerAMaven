package com.pilaf.warhammer.combat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Component
@Slf4j
public class UnitSizeAttackHelper {

    @Autowired
    private UnitService unitService;

    public BigDecimal calculateUnitAmountSizeBonus(Unit unit, Unit target) {
        double result = 0;
        if (unit.getUnitAmount() >= 30){
            result=  1 + (((double) unit.getUnitAmount() -60)/ 300);
        } else if (unit.getUnitAmount() >= 10 && unit.getUnitAmount() < 30){
            result= 1 + (((double) unit.getUnitAmount() -30)/ 300) + (((double) unit.getUnitAmount() -30) / 100);
        } else if (unit.getUnitAmount() < 9){
            result= 0;
        }
        return BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP);
    }

    public double calculateAttacksToDealDamage(Unit unit, Unit target, int dmgDone, int timePeriod){
            double dmgPerAttack =  unitService.calculateAverageDamage(unit, target) * unitService.calculateAttackChance(unit, target);
            double dmgPerAttackWithInterval =  dmgPerAttack / (unit.getMeleeInterval()/15);
            return dmgDone / dmgPerAttackWithInterval;
    }
}
