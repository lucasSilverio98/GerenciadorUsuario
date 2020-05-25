package com.spring.GerenciadorUsuario.Repository;

import com.spring.GerenciadorUsuario.Model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerPerfilRepository extends JpaRepository<Perfil,String> {
}
