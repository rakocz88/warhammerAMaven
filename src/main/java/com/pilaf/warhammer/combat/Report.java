package com.pilaf.warhammer.combat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Report {
    private String unit1;
    private String unit2;
    private double attackEfficiency;
    private double defenceEfficiency;
    private double overallScore;
    private double efficiencyPer1000Gold;
}
