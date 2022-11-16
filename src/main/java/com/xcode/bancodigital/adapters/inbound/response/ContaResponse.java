package com.xcode.bancodigital.adapters.inbound.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContaResponse implements Serializable {

    @JsonProperty(value = "numero")
    private Long numeroConta;

    private String titular;

    private BigDecimal saldo;
    @JsonProperty(value = "data-abertura")
    private LocalDateTime dataAbertura;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public ContaResponse setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public String getTitular() {
        return titular;
    }

    public ContaResponse setTitular(String titular) {
        this.titular = titular;
        return this;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public ContaResponse setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
        return this;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public ContaResponse setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

    @Override
    public String toString() {
        return "ContaResponse{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", dataAbertura=" + dataAbertura +
                '}';
    }
}
