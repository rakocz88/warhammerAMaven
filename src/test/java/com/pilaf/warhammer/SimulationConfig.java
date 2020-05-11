package com.pilaf.warhammer;

import com.pilaf.warhammer.combat.ChargeStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class SimulationConfig {

    @Bean
    public com.pilaf.warhammer.combat.CombatConfig combatConfig(){
        return new com.pilaf.warhammer.combat.CombatConfig(
                        ChargeStatus.CYCLE,
                        Arrays.asList(
                        )
                );
    }
}
