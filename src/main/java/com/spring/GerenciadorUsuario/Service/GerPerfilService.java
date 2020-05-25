package com.spring.GerenciadorUsuario.Service;

import com.spring.GerenciadorUsuario.Model.Perfil;

import java.util.List;

public interface GerPerfilService {

    Perfil save(Perfil perfil);
    Perfil edit(Perfil perfil);
    List<Perfil> findAll();
}
