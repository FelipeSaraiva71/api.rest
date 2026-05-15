package com.spi.rest.projeto.pratico.dto;

public class UsuarioDtoResponse {

    private Long  id;
    private String nome;
    private String username;

    private UsuarioDtoResponse() {

    }

    public UsuarioDtoResponse(Long id, String nome, String username) {
        this.id = id;
        this.nome = nome;
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
