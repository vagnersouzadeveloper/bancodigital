package com.xcode.bancodigital.config;

import com.xcode.bancodigital.adapters.outbound.adapter.BuscarContaAdapter;
import com.xcode.bancodigital.adapters.outbound.adapter.SalvarContaAdapter;
import com.xcode.bancodigital.adapters.inbound.core.service.SalvarContaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SalvarContaService salvarContaService(SalvarContaAdapter salvarContaAdapter, BuscarContaAdapter buscarContaAdapter){
        return new SalvarContaService(salvarContaAdapter, buscarContaAdapter);
    }
}
