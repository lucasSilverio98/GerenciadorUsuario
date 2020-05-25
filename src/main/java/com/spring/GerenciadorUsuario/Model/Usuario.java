package com.spring.GerenciadorUsuario.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.spring.GerenciadorUsuario.Model.Cargo;

@Entity
@Table(name = "USUARIO")
public class Usuario {

/*Colocar os atributos de usuario sem utilizar a classe
  abstrata pessoa foi a solução mais rapida para o problema de
  mapeamento, pois usuario estava exigindo um Id( que era o Cpf).
 */


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

    @ManyToMany
    private List<Perfil> listaPerfis = new ArrayList<Perfil>();

    @NotNull
    @Column
    private Cargo cargo;

    @NotNull
    @Column
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    private LocalDate data;

    public List<Perfil> getListaPerfis() {
        return listaPerfis;
    }

    public void setListaPerfis(List<Perfil> listaPerfis) {
        this.listaPerfis = listaPerfis;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
