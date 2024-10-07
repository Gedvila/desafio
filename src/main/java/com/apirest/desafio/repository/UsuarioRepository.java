package com.apirest.desafio.repository;

import com.apirest.desafio.dto.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
