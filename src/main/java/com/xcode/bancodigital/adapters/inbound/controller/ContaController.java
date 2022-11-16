package com.xcode.bancodigital.adapters.inbound.controller;

import com.xcode.bancodigital.adapters.inbound.converter.ContaConverter;
import com.xcode.bancodigital.adapters.inbound.response.ContaResponse;
import com.xcode.bancodigital.adapters.inbound.request.ContaRequest;
import com.xcode.bancodigital.application.ports.inbound.SalvarContaServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContaController {

    private final SalvarContaServicePort salvarContaServicePort;

    public ContaController(SalvarContaServicePort salvarContaServicePort) {
        this.salvarContaServicePort = salvarContaServicePort;
    }

    @PostMapping
    public ResponseEntity<ContaResponse> criarConta(@RequestBody @Validated ContaRequest request){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body( ContaConverter
                        .contaFromResponse(salvarContaServicePort
                                .salvarConta(ContaConverter.contaFromDomain(request))));
    }
}
