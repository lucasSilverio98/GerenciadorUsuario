package com.spring.GerenciadorUsuario.Repository;


import com.spring.GerenciadorUsuario.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerUsuarioRepository extends JpaRepository<Usuario,String> {

}
