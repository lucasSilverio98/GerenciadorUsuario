package com.spring.GerenciadorUsuario.Service.ServiceImpl;

import com.spring.GerenciadorUsuario.Service.GerUsuarioService;
import com.spring.GerenciadorUsuario.Model.Usuario;
import com.spring.GerenciadorUsuario.Repository.GerUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerUsuarioServiceImpl implements GerUsuarioService {

    @Autowired
    GerUsuarioRepository gerUsuarioRepository;

    @Override
    public Usuario save(Usuario usuario) {
        return gerUsuarioRepository.save(usuario);
    }

    @Override
    public Usuario edit(Usuario usuario) {
        return gerUsuarioRepository.save(usuario);
    }
}
