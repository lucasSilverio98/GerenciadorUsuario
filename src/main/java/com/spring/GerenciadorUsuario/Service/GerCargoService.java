package com.spring.GerenciadorUsuario.Service;

import com.spring.GerenciadorUsuario.Model.Cargo;

import java.util.List;

public interface GerCargoService {

    Cargo save(Cargo cargo);
    Cargo edit(Cargo cargo);
    List<Cargo> findAll();
}
