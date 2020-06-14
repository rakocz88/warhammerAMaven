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
        RXxX r120x120 = new R120x120();
        BigDecimal result120x120 = attackersAmountService.calculateWithoutCharge(r120x120);
        System.out.println(result120x120);
        RXxX r120x90 = new R120x90();
        BigDecimal result120x90 = attackersAmountService.calculateWithoutCharge(r120x90);
        System.out.println(result120x90);
        RXxX r120x75 = new R120x75();
        BigDecimal result120x75 = attackersAmountService.calculateWithoutCharge(r120x75);
        System.out.println(result120x75);
       System.out.println(attackersAmountService.calculateWithoutCharge(new R90x120()));
        System.out.println(attackersAmountService.calculateWithoutCharge(new R75x120()));



    }


}
