package com.spring.GerenciadorUsuario.Service.ServiceImpl;

import com.spring.GerenciadorUsuario.Model.Perfil;
import com.spring.GerenciadorUsuario.Repository.GerPerfilRepository;
import com.spring.GerenciadorUsuario.Service.GerPerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerPerfilServiceImpl implements GerPerfilService {

    @Autowired
    GerPerfilRepository gerPerfilRepository;


    @Override
    public List<Perfil> findAll() {
        return gerPerfilRepository.findAll();
    }

    @Override
    public Perfil save(Perfil perfil) {
        return gerPerfilRepository.save(perfil);
    }

    @Override
    public Perfil edit(Perfil perfil) {
        return gerPerfilRepository.save(perfil);
    }
}
