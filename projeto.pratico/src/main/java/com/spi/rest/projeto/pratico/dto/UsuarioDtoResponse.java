package com.spi.rest.projeto.pratico.dto;

public class UsuarioDtoResponse {

    private Long  id;
    private String nome;
    private String usarname;

    private UsuarioDtoResponse() {

    }

    public UsuarioDtoResponse(Long id, String nome, String usarname) {
        this.id = id;
        this.nome = nome;
        this.usarname = usarname;
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

    public String getUsarname() {
        return usarname;
    }

    public void setUsarname(String usarname) {
        this.usarname = usarname;
    }
}
