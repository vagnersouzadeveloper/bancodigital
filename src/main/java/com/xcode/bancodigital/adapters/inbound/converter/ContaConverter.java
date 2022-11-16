package com.xcode.bancodigital.adapters.inbound.converter;

import com.xcode.bancodigital.adapters.inbound.request.ContaRequest;
import com.xcode.bancodigital.adapters.inbound.response.ContaResponse;
import com.xcode.bancodigital.adapters.inbound.core.domain.Conta;
import com.xcode.bancodigital.adapters.inbound.core.domain.Endereco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaConverter {

    public static Conta contaFromDomain(final ContaRequest request){
        return new Conta().setCpf(request.getCpf())
                .setEmail(request.getEmail())
                .setNome(request.getNome())
                .setDataNaximento(stringToLocalDate(request.getDataNascimento()))
                .setEndereco(new Endereco()
                        .setCep(request.getEnderecoRequest().getCep())
                        .setCidade(request.getEnderecoRequest().getCidade())
                        .setLogradouro(request.getEnderecoRequest().getLogradouro())
                        .setUf(request.getEnderecoRequest().getUf()));

    }

    private static LocalDate stringToLocalDate(final String data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(data, formatter);
    }

    public static ContaResponse contaFromResponse(final Conta domain){
        return new ContaResponse()
                .setNumeroConta(domain.getNumeroConta())
                .setDataAbertura(domain.getDataAbertura())
                .setTitular(domain.getNome())
                .setSaldo(domain.getSaldo());
    }
}
