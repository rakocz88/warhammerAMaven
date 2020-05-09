package com.pilaf.warhammer.combat;

import lombok.Value;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Value
public class DisciplineHelper {

    List<DisciplineDamageModel> disciplineDamageModelList = Arrays.asList(
            new DisciplineDamageModel(91, 100, 0),
            new DisciplineDamageModel(81, 90, -8),
            new DisciplineDamageModel(71, 80, -16),
            new DisciplineDamageModel(61, 70, -24),
            new DisciplineDamageModel(51, 60, -32),
            new DisciplineDamageModel(41, 50, -40),
            new DisciplineDamageModel(31, 40, -48),
            new DisciplineDamageModel(21, 30, -60),
            new DisciplineDamageModel(11, 20, -72),
            new DisciplineDamageModel(0, 10, -80)
    );




    @Value
    public static class DisciplineDamageModel{
        int minAmount;
        int maxAmount;
        int penalty;
    }

    @Value
    public static class DisciplineModifierModel{
        String name;
        int level;
        int penalty;
    }
}
