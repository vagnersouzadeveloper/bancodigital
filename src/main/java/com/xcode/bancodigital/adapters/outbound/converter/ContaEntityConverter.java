package com.xcode.bancodigital.adapters.outbound.converter;

import com.xcode.bancodigital.adapters.outbound.entity.ContaEntity;
import com.xcode.bancodigital.adapters.outbound.entity.EnderecoEntity;
import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;
import com.xcode.bancodigital.adapters.inbound.core.domain.Endereco;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContaEntityConverter {

    public static ContaEntity contaFromEntity(Conta domain){
        return new ContaEntity()
                .setDataAbertura(LocalDateTime.now())
                .setCpf(domain.getCpf())
                .setEmail(domain.getEmail())
                .setNome(domain.getNome())
                .setEndereco(new EnderecoEntity()
                        .setCep(domain.getEndereco().getCep())
                        .setCidade(domain.getEndereco().getCidade())
                        .setLogradouro(domain.getEndereco().getLogradouro())
                        .setUf(domain.getEndereco().getUf())).setSaldo(BigDecimal.ZERO);
    }

    public static Conta contaFromDomain(ContaEntity entity){
        return new Conta()
                .setNumeroConta(entity.getNumeroConta())
                .setEndereco(new Endereco().setCep(entity.getEndereco().getCep())
                        .setLogradouro(entity.getEndereco().getLogradouro())
                        .setCidade(entity.getEndereco().getCidade())
                        .setUf(entity.getEndereco().getUf()))
                .setEmail(entity.getEmail())
                .setCpf(entity.getCpf())
                .setNome(entity.getNome())
                .setDataAbertura(entity.getDataAbertura())
                .setSaldo(entity.getSaldo());
    }
}
