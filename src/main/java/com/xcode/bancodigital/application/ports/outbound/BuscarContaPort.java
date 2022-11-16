package com.xcode.bancodigital.application.ports.outbound;

import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;

public interface BuscarContaPort {

    Conta pesquisarCpf(String cpf);
}
