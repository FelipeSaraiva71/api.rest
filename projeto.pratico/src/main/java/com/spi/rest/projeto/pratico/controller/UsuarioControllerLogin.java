package com.spi.rest.projeto.pratico.controller;


import com.spi.rest.projeto.pratico.dto.UsuarioDtoLogin;
import com.spi.rest.projeto.pratico.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/auth")
public class UsuarioControllerLogin {


    @Autowired
    private JwtService jwtService;

    @PostMapping("/login")
    public String login(@RequestBody UsuarioDtoLogin usuarioDtoLogin) {
        String token = jwtService.gerarToken(usuarioDtoLogin.getUsername());
        return token;
    }
}
