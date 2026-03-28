package com.spi.rest.projeto.pratico.controller;

import com.spi.rest.projeto.pratico.model.UsuarioModel;
import com.spi.rest.projeto.pratico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public UsuarioModel create(@RequestBody UsuarioModel usuarioModel){
       return usuarioService.create(usuarioModel);
    }

    @GetMapping
    public List<UsuarioModel>read(){
        return usuarioService.read();
    }

    @PutMapping("{id}")
    public UsuarioModel update(@RequestBody UsuarioModel usuarioModel,@PathVariable Long id){
        return usuarioService.update(usuarioModel, id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        usuarioService.delete(id);
    }
}
