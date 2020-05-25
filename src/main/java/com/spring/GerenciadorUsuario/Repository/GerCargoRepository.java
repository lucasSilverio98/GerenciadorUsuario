package com.spring.GerenciadorUsuario.Repository;

import com.spring.GerenciadorUsuario.Model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerCargoRepository extends JpaRepository<Cargo,String> {
}
