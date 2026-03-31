package com.spi.rest.projeto.pratico.service;

import com.spi.rest.projeto.pratico.dto.UsuarioDtoCreate;
import com.spi.rest.projeto.pratico.dto.UsuarioDtoRead;
import com.spi.rest.projeto.pratico.dto.UsuarioDtoResponse;
import com.spi.rest.projeto.pratico.mapper.UsuarioMapper;
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
    @Autowired
    private UsuarioMapper usuarioMapper;

    public UsuarioDtoResponse create(UsuarioDtoCreate usuarioDtoCreate) {
        UsuarioModel usuarioModel = usuarioMapper.toEntity(usuarioDtoCreate);
        UsuarioModel salvo = usuarioRepository.save(usuarioModel);
        return usuarioMapper.toDto(salvo);
    }

    public List<UsuarioDtoRead> read(){
       return usuarioMapper.toDtoList(usuarioRepository.findAll());
    }

    public UsuarioModel update(UsuarioModel usuario, Long id){
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }
}
