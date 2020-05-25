package com.spring.GerenciadorUsuario.Service;

import com.spring.GerenciadorUsuario.Model.Usuario;

public interface GerUsuarioService {

    Usuario save(Usuario usuario);
    Usuario edit(Usuario usuario);
}
