package com.xcode.bancodigital.adapters.inbound.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Objects;

public class ContaRequest implements Serializable {


    @NotEmpty(message = "cpf não pode ser vazio")
    @JsonProperty(value = "cpf")
    private String cpf;
    @NotEmpty(message = "Titular campo obrigatório")
    @JsonProperty(value = "titular")
    private String nome;

    @Email(message = "e-mail deve ser valido")
    @NotEmpty(message = "e-mail campo obrigatório")
    @JsonProperty(value = "e-mail")
    private String email;

    @JsonProperty(value = "data-nascimento")
    private String dataNascimento;
    @JsonProperty(value = "endereco")
    private EnderecoRequest enderecoRequest;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public ContaRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EnderecoRequest getEnderecoRequest() {
        return enderecoRequest;
    }

    public void setEnderecoRequest(EnderecoRequest enderecoRequest) {
        this.enderecoRequest = enderecoRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContaRequest)) return false;
        ContaRequest that = (ContaRequest) o;
        return Objects.equals(cpf, that.cpf) && Objects.equals(nome, that.nome) && Objects.equals(email, that.email) && Objects.equals(dataNascimento, that.dataNascimento) && Objects.equals(enderecoRequest, that.enderecoRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome, email, dataNascimento, enderecoRequest);
    }

    @Override
    public String toString() {
        return "ContaRequest{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", enderecoRequest=" + enderecoRequest +
                '}';
    }
}
