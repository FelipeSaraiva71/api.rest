package com.spi.rest.projeto.pratico.service;

import com.spi.rest.projeto.pratico.dto.UsuarioDtoCreate;
import com.spi.rest.projeto.pratico.dto.UsuarioDtoRead;
import com.spi.rest.projeto.pratico.dto.UsuarioDtoResponse;
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

    public UsuarioDtoResponse create(UsuarioDtoCreate usuarioDtoCreate) {
        UsuarioModel usuarioModel = new UsuarioModel();
        usuarioModel.setNome(usuarioDtoCreate.getNome());
        usuarioModel.setUsername(usuarioDtoCreate.getUsername());
        usuarioModel.setSenha(usuarioDtoCreate.getSenha());

        UsuarioModel salvo = usuarioRepository.save(usuarioModel);

        return new UsuarioDtoResponse(
                salvo.getId(),
                salvo.getNome(),
                salvo.getUsername()
        );
    }

    public List<UsuarioDtoRead> read(){
        UsuarioDtoResponse usuarioDtoResponse;
        return usuarioRepository.findAll().stream().map(usuarioModel -> new UsuarioDtoRead(
                usuarioModel.getId(),
                usuarioModel.getNome()
        )).toList();

    }

    public UsuarioModel update(UsuarioModel usuario, Long id){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }
}
