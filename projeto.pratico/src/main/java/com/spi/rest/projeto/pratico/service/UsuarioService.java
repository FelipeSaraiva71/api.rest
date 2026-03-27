package com.spi.rest.projeto.pratico.service;

import com.spi.rest.projeto.pratico.model.UsuarioModel;
import com.spi.rest.projeto.pratico.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel create(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public List<UsuarioModel> read(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel update(UsuarioModel usuario, Long id){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }
}
