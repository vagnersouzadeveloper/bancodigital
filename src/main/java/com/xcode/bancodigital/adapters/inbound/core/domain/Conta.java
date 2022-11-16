package com.xcode.bancodigital.adapters.inbound.core.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Conta implements Serializable {

    private Long numeroConta;

    private String cpf;

    private String nome;

    private String email;

    private LocalDate dataNaximento;

    private LocalDateTime dataAbertura;

    private Endereco endereco;

    private BigDecimal saldo;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public Conta setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Conta setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Conta setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Conta setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getDataNaximento() {
        return dataNaximento;
    }

    public Conta setDataNaximento(LocalDate dataNaximento) {
        this.dataNaximento = dataNaximento;
        return this;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public Conta setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Conta setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Conta setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Conta)) return false;
        Conta conta = (Conta) o;
        return Objects.equals(numeroConta, conta.numeroConta) && Objects.equals(cpf, conta.cpf) && Objects.equals(nome, conta.nome) && Objects.equals(email, conta.email) && Objects.equals(dataNaximento, conta.dataNaximento) && Objects.equals(dataAbertura, conta.dataAbertura) && Objects.equals(endereco, conta.endereco) && Objects.equals(saldo, conta.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, cpf, nome, email, dataNaximento, dataAbertura, endereco, saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNaximento=" + dataNaximento +
                ", dataAbertura=" + dataAbertura +
                ", endereco=" + endereco +
                ", saldo=" + saldo +
                '}';
    }
}
