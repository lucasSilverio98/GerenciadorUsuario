package com.spring.GerenciadorUsuario.Service.ServiceImpl;

import com.spring.GerenciadorUsuario.Model.Cargo;
import com.spring.GerenciadorUsuario.Repository.GerCargoRepository;
import com.spring.GerenciadorUsuario.Service.GerCargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerCargoServiceImpl implements GerCargoService {

    @Autowired
    GerCargoRepository gerCargoRepository;


    @Override
    public List<Cargo> findAll() {
        return gerCargoRepository.findAll();
    }

    @Override
    public Cargo save(Cargo cargo) {
        return gerCargoRepository.save(cargo);
    }

    @Override
    public Cargo edit(Cargo cargo) {
        return gerCargoRepository.save(cargo);
    }
}
