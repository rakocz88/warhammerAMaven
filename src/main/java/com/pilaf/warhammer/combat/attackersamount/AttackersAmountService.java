package com.pilaf.warhammer.combat.attackersamount;

import com.pilaf.warhammer.combat.Unit;
import com.pilaf.warhammer.combat.UnitService;
import com.pilaf.warhammer.combat.attackersamount.results.DmgInTimePeriodResult;
import com.pilaf.warhammer.combat.attackersamount.results.RXxX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Component
public class AttackersAmountService {

    @Autowired
    private UnitService unitService;

    public BigDecimal calculateWithCharge(RXxX rXxX){
        List<Double> allResults = new ArrayList<>();
        int amountOfCalculations = 0;
        for (DmgInTimePeriodResult dmgInTimePeriodResult: rXxX.getResults()){
            for (int i = 1; i < dmgInTimePeriodResult.getUnit2HealthAfterNextPeriods().size(); i++){
                double averageDmg = unitDmgInTimePeriod(dmgInTimePeriodResult.getUnit1(), dmgInTimePeriodResult.getUnit2(), 15);
                int dmgDoneInPeriod = dmgInTimePeriodResult.getUnit2HealthAfterNextPeriods().get(i-1) - dmgInTimePeriodResult.getUnit2HealthAfterNextPeriods().get(i);
                allResults.add(dmgDoneInPeriod/ averageDmg);
                amountOfCalculations++;
            }
        }
        if (rXxX.doubleCheck()){
            for (DmgInTimePeriodResult dmgInTimePeriodResult: rXxX.getResults()){
                for (int i = 1; i < dmgInTimePeriodResult.getUnit1HealthAfterNextPeriods().size(); i++){
                    double averageDmg = unitDmgInTimePeriod(dmgInTimePeriodResult.getUnit2(), dmgInTimePeriodResult.getUnit1(), 15);
                    int dmgDoneInPeriod = dmgInTimePeriodResult.getUnit1HealthAfterNextPeriods().get(i-1) - dmgInTimePeriodResult.getUnit1HealthAfterNextPeriods().get(i);
                    allResults.add(dmgDoneInPeriod/ averageDmg);
                    amountOfCalculations++;
                }
            }
        }
       return allResults.stream().map(aDouble -> new BigDecimal(aDouble)).reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(amountOfCalculations), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateWithoutCharge(RXxX rXxX){
        List<Double> allResults = new ArrayList<>();
        int amountOfCalculations = 0;
        for (DmgInTimePeriodResult dmgInTimePeriodResult: rXxX.getResults()){
            for (int i = 2; i < dmgInTimePeriodResult.getUnit2HealthAfterNextPeriods().size(); i++){
                double averageDmg = unitDmgInTimePeriod(dmgInTimePeriodResult.getUnit1(), dmgInTimePeriodResult.getUnit2(), 15);
                int dmgDoneInPeriod = dmgInTimePeriodResult.getUnit2HealthAfterNextPeriods().get(i-1) - dmgInTimePeriodResult.getUnit2HealthAfterNextPeriods().get(i);
                allResults.add(dmgDoneInPeriod/ averageDmg);
                amountOfCalculations++;
            }
        }
        if (rXxX.doubleCheck()){
            for (DmgInTimePeriodResult dmgInTimePeriodResult: rXxX.getResults()){
                for (int i = 2; i < dmgInTimePeriodResult.getUnit1HealthAfterNextPeriods().size(); i++){
                    double averageDmg = unitDmgInTimePeriod(dmgInTimePeriodResult.getUnit2(), dmgInTimePeriodResult.getUnit1(), 15);
                    int dmgDoneInPeriod = dmgInTimePeriodResult.getUnit1HealthAfterNextPeriods().get(i-1) - dmgInTimePeriodResult.getUnit1HealthAfterNextPeriods().get(i);
                    allResults.add(dmgDoneInPeriod/ averageDmg);
                    amountOfCalculations++;
                }
            }
        }
        return allResults.stream().map(aDouble -> new BigDecimal(aDouble)).reduce(BigDecimal.ZERO, BigDecimal::add).divide(new BigDecimal(amountOfCalculations), 2, RoundingMode.HALF_UP);
    }

    private double unitDmgInTimePeriod(Unit unit1, Unit unit2, int timeperiod) {
        return unitService.calculateAttackChance(unit1, unit2) * unitService.calculateAverageDamage(unit1, unit2) * ((double) timeperiod/unit1.getMeleeInterval());
    }
}
