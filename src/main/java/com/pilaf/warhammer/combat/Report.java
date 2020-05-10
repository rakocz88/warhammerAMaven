package com.pilaf.warhammer.combat;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Report {
    private String unit1;
    private String unit2;
    private BigDecimal attackEfficiency;
    private BigDecimal defenceEfficiency;
    private BigDecimal overallScore;
    private BigDecimal efficiencyGold;
}
