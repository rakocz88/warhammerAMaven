package com.pilaf.warhammer.combat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
    private String unit1;
    private String unit2;
    private BigDecimal attackEfficiency;
    private BigDecimal defenceEfficiency;
    private BigDecimal overallScore;
    private BigDecimal efficiencyGold;
    private BigDecimal changeToHit;
    private BigDecimal averageDamage;
    private BigDecimal unitAmountModifier;

    public String printReport(boolean printDetails){
        String mainInfo =  String.format(
                "unit1=%s, unit2=%s, attackEfficiency=%s, defenceEfficiency=%s, overallScore=%s, efficiencyGold=%s ",
                unit1, unit2, attackEfficiency, defenceEfficiency, overallScore, efficiencyGold
        );
        String detailsInfo = String.format(
                "DETAILS changeToHit = %s, averageDamage = %s, unitAmountModifier= %s",
                changeToHit, averageDamage, unitAmountModifier
        );
        if (printDetails){
            return mainInfo + detailsInfo;
        } else {
            return mainInfo;
        }
    }

}
