package com.xcode.bancodigital.adapters.outbound.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "conta")
public class ContaEntity {

    @Id
    @Column(name = "numeroConta", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long numeroConta;


    @Column(unique=true)
    private String cpf;

    private String nome;

    @Column(unique=true)
    private String email;

    private LocalDate dataNascimento;

    private LocalDateTime dataAbertura;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_endereco")
    private EnderecoEntity endereco;

    private BigDecimal saldo;

    public Long getNumeroConta() {
        return numeroConta;
    }

    public ContaEntity setNumeroConta(Long numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaEntity setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public ContaEntity setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ContaEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public ContaEntity setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public ContaEntity setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
        return this;
    }

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public ContaEntity setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
        return this;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public ContaEntity setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContaEntity)) return false;
        ContaEntity that = (ContaEntity) o;
        return Objects.equals(numeroConta, that.numeroConta) && Objects.equals(cpf, that.cpf) && Objects.equals(nome, that.nome) && Objects.equals(email, that.email) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(dataAbertura, that.dataAbertura) && Objects.equals(endereco, that.endereco) && Objects.equals(saldo, that.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta, cpf, nome, email, dataNascimento, dataAbertura, endereco, saldo);
    }

    @Override
    public String toString() {
        return "ContaEntity{" +
                "numeroConta=" + numeroConta +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", dataAbertura=" + dataAbertura +
                ", endereco=" + endereco +
                ", saldo=" + saldo +
                '}';
    }
}
