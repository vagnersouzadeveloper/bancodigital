package com.xcode.bancodigital.adapters.inbound.core.service;

import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;
import com.xcode.bancodigital.application.ports.inbound.SalvarContaServicePort;
import com.xcode.bancodigital.application.ports.outbound.SalvarContaPort;
import com.xcode.bancodigital.adapters.inbound.core.exception.BancoException;
import com.xcode.bancodigital.application.ports.outbound.BuscarContaPort;

import java.util.Objects;
import java.util.Optional;

public class SalvarContaService implements SalvarContaServicePort {

    private final SalvarContaPort salvarContaPort;
    private final BuscarContaPort buscarConta;

    public SalvarContaService(SalvarContaPort salvarContaPort, BuscarContaPort pesquisarContaPorCpf) {
        this.salvarContaPort = salvarContaPort;
        this.buscarConta = pesquisarContaPorCpf;
    }


    @Override
    public Conta salvarConta(Conta conta) {
        return Optional.of(conta)
                .filter(c -> Objects.isNull(buscarContaPorCpf(c.getCpf())))
                .map(cta -> this.salvarContaPort.salvar(cta))
                .orElseThrow(() -> new BancoException("Ja existe uma conta para esse cpf " + conta.getCpf()));

    }

    private Conta buscarContaPorCpf(final String cpf){
        return this.buscarConta.pesquisarCpf(cpf);
    }
}
