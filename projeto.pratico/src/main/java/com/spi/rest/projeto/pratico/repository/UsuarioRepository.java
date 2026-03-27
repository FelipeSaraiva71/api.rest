package com.spi.rest.projeto.pratico.repository;

import com.spi.rest.projeto.pratico.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel , Long> {
}
