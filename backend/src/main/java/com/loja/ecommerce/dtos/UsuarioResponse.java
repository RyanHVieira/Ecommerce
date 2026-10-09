package com.loja.ecommerce.dtos;

import com.loja.ecommerce.Models.usuario;
import java.time.LocalDateTime;

public record UsuarioResponse(
        Long id,
        String nome,
        String email,
        LocalDateTime dataCriacao
    ) {
    public static UsuarioResponse de(usuario usuario) {
        return new UsuarioResponse(
                usuario.getId(),
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getDataCriacao()
        );
    }
}