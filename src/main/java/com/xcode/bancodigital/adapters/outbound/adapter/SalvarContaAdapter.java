package com.xcode.bancodigital.adapters.outbound.adapter;

import com.xcode.bancodigital.adapters.outbound.converter.ContaEntityConverter;
import com.xcode.bancodigital.adapters.outbound.repository.ContaRepository;
import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;
import com.xcode.bancodigital.application.ports.outbound.SalvarContaPort;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class SalvarContaAdapter implements SalvarContaPort {

    private final ContaRepository repository;

    public SalvarContaAdapter(ContaRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public Conta salvar(Conta conta) {
        return ContaEntityConverter.contaFromDomain(this.repository.save(ContaEntityConverter.contaFromEntity(conta)));
    }
}
