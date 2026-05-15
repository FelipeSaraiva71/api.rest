package com.spi.rest.projeto.pratico.dto;

public class UsuarioDtoLogin {

    private String username;
    private String senha;

    public UsuarioDtoLogin() {

    }

    public UsuarioDtoLogin(String username, String senha) {

        this.username = username;
        this.senha = senha;
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
