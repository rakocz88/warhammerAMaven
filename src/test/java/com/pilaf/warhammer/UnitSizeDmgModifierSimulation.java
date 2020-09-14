package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.CombatWithReport;
import com.pilaf.warhammer.combat.Unit;
import com.pilaf.warhammer.combat.UnitService;
import com.pilaf.warhammer.combat.UnitSizeAttackHelper;
import com.pilaf.warhammer.combat.attackersamount.AttackersAmountService;
import com.pilaf.warhammer.combat.attackersamount.results.*;
import com.pilaf.warhammer.unitstore.*;
import lombok.Data;
import lombok.Value;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = {WarhammerTwAnalizeApplication.class})
@ExtendWith(SpringExtension.class)
public class UnitSizeDmgModifierSimulation {

    @Autowired
    private AttackersAmountService attackersAmountService;

    @Test
    void calculateUnitSizeModifier() {
        BigDecimal r120x90 = attackersAmountService.calculateWithoutCharge(new R120x90());
        BigDecimal r120x75 = attackersAmountService.calculateWithoutCharge(new R120x75());
        BigDecimal r120x60 = attackersAmountService.calculateWithoutCharge(new R120x60());

        BigDecimal r90x120 = attackersAmountService.calculateWithoutCharge(new R90x120());
        BigDecimal r90x75 = attackersAmountService.calculateWithoutCharge(new R75x120());
        BigDecimal r90x60 = attackersAmountService.calculateWithoutCharge(new R60x120());

        System.out.println(r120x90.divide(r90x120,2, RoundingMode.HALF_UP));
        System.out.println(r120x75.divide(r90x75,2, RoundingMode.HALF_UP));
        System.out.println(r120x60.divide(r90x60,2, RoundingMode.HALF_UP));

        System.out.println(r90x120.divide(r120x90,2, RoundingMode.HALF_UP));
        System.out.println(r90x75.divide(r120x75,2, RoundingMode.HALF_UP));
        System.out.println(r90x60.divide(r120x60,2, RoundingMode.HALF_UP));



    }


}
