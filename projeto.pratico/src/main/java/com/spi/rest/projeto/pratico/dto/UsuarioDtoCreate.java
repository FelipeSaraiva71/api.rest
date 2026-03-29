package com.spi.rest.projeto.pratico.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioDtoCreate {

    @NotBlank
    private String nome;
    @NotBlank
    private String username;
    @NotBlank
    @Size(min = 4,max = 4)
    private String senha;

    public UsuarioDtoCreate() {

    }

    public UsuarioDtoCreate(String nome, String username, String senha) {
        this.nome = nome;
        this.username = username;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
