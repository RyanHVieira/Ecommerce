package com.loja.ecommerce.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
public class Usuario {
    public Usuario() {}

    @PrePersist
    public void antesDeSalvar() {
        if (dataCriacao == null) {
            dataCriacao = LocalDateTime.now();
        }
    }
    //table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false, unique = true, length = 150)
    private String email;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    //getters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() {
        return email;
    }
    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public String getSenha() {
        return senha;
    }
    //setters
    public void setNome(String nome) { this.nome = nome;}
    public void setEmail(String email) { this.email = email; }
    public void setSenha(String senha) { this.senha = senha; }
}