package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.CombatWithReport;
import com.pilaf.warhammer.combat.Unit;
import com.pilaf.warhammer.unitstore.DarkElvenUnitStore;
import com.pilaf.warhammer.unitstore.EmpireUnitStore;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = {WarhammerTwAnalizeApplication.class})
@ExtendWith(SpringExtension.class)
class WarhammerTwAnalizeApplicationTests {

	@Autowired
	private CombatWithReport combatWithReport;

	@Test
	void contextLoads() {
//		CombatWithReport combatWithReport = new CombatWithReport(
//				EmpireUnitStore.all(),
//				DarkElvenUnitStore.all()
//		);
//		combatWithReport.report();
	}

}
