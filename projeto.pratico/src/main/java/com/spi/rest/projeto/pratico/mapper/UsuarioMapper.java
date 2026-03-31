package com.spi.rest.projeto.pratico.mapper;

import com.spi.rest.projeto.pratico.dto.UsuarioDtoCreate;
import com.spi.rest.projeto.pratico.dto.UsuarioDtoRead;
import com.spi.rest.projeto.pratico.dto.UsuarioDtoResponse;
import com.spi.rest.projeto.pratico.model.UsuarioModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDtoResponse toDto(UsuarioModel usuarioModel);
    UsuarioModel toEntity(UsuarioDtoCreate dto);
    List<UsuarioDtoRead> toDtoList(List<UsuarioModel> usuarioModel);

}
