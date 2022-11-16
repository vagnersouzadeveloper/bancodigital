package com.xcode.bancodigital.adapters.outbound.adapter;

import com.xcode.bancodigital.adapters.outbound.converter.ContaEntityConverter;
import com.xcode.bancodigital.adapters.outbound.repository.ContaRepository;
import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;
import com.xcode.bancodigital.application.ports.outbound.BuscarContaPort;
import org.springframework.stereotype.Component;


@Component
public class BuscarContaAdapter implements BuscarContaPort {

    private final ContaRepository repository;

    public BuscarContaAdapter(ContaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Conta pesquisarCpf(String cpf) {
        var optConta = this.repository.findByCpf(cpf);
        if(optConta.isPresent())
            return  ContaEntityConverter.contaFromDomain(optConta.get());
        return null;
    }
}
