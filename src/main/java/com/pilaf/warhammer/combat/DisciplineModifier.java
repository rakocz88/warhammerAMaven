package com.pilaf.warhammer.combat;

public enum DisciplineModifier {
    ARTILLERY_SHOT(1, -10),
    LORD_CLOSE(1, 3),
    SAFE_FLANKS(1, 3),
    SAFE_FLANKS_2(2, 3),
    UNDER_SHOT(1, -5),
    LOSES(1, -3),
    LOSES_2(2, -8),
    FLANK_OPENED(1, -3),
    FLANK_OPENED_2(2, -6),
    ENEMY_ATTACKS_FLANK(1, -6),
    ENEMY_ATTACKS_FLANK_2(2, -12),
    TERRIFYING_ENEMY(1, -8),
    ALLIES_RUN_AWAY(1, -3),
    ALLIES_RUN_AWAY_2(2, -3),
    ALLIES_RUN_AWAY_3(3, -3),
    ALLIES_RUN_AWAY_4(4, -3),
    TIRED(1, -2),
    TIRED_2(2, -3),
    TIRED_3(3, -6),
    ENEMY_ATTACKS_BACK(1, 48);

    DisciplineModifier(int lvl, int penalty){
        this.lvl = lvl;
        this.penalty = penalty;
    }

    int lvl;
    int penalty;
}
