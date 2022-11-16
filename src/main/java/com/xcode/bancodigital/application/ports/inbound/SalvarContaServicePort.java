package com.xcode.bancodigital.application.ports.inbound;

import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;

public interface SalvarContaServicePort {

    Conta salvarConta(Conta conta);
}
