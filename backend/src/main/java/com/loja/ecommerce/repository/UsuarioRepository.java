package com.loja.ecommerce.repository;

import com.loja.ecommerce.models.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long> {

    boolean existsByEmailIgnoreCase(String email);
}