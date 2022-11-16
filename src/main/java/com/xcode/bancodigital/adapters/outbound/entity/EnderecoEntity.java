package com.xcode.bancodigital.adapters.outbound.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    private Long id;

    private String cep;

    private String logradouro;

    private String uf;

    private String cidade;

    @OneToOne(mappedBy = "endereco")
    private ContaEntity conta;

    public Long getId() {
        return id;
    }

    public EnderecoEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCep() {
        return cep;
    }

    public EnderecoEntity setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public EnderecoEntity setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getUf() {
        return uf;
    }

    public EnderecoEntity setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public String getCidade() {
        return cidade;
    }

    public EnderecoEntity setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public ContaEntity getConta() {
        return conta;
    }

    public EnderecoEntity setConta(ContaEntity conta) {
        this.conta = conta;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnderecoEntity)) return false;
        EnderecoEntity that = (EnderecoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(cep, that.cep) && Objects.equals(logradouro, that.logradouro) && Objects.equals(uf, that.uf) && Objects.equals(cidade, that.cidade) && Objects.equals(conta, that.conta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cep, logradouro, uf, cidade, conta);
    }

    @Override
    public String toString() {
        return "EnderecoEntity{" +
                "id=" + id +
                ", cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", uf='" + uf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", conta=" + conta +
                '}';
    }
}
