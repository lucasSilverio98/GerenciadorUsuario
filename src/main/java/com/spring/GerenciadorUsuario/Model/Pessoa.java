package com.spring.GerenciadorUsuario.Model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

public class Pessoa {

    @NotNull
    private String nome;

    @Id
    @Column(unique = true)
    @NotNull
    private String cpf;

    @NotNull
    private Date dataNascimento;

    @NotNull
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
