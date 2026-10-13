package com.loja.ecommerce.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record LoginRequest(
        //email
        @NotBlank(message = "O e-mail é obrigatório")
        @Email(message = "Informe um e-mail válido")
        String email,
        //senha
        @NotBlank(message = "A senha é obrigatória")
        @Size(max = 72, message = "A senha é muito longa")
        String senha
) {}
