
package com.loja.ecommerce.controllers;

import com.loja.ecommerce.dtos.CriarUsuarioRequest;
import com.loja.ecommerce.dtos.UsuarioResponse;
import com.loja.ecommerce.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/registrar")
    public ResponseEntity<UsuarioResponse> registrar(@Valid @RequestBody CriarUsuarioRequest request){
        UsuarioResponse resposta = authService.registrar(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(resposta);
    }
}
