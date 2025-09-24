package com.example.arqHexagonal.infrastructure.repository;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.dto.UsuarioResponse;
import com.example.arqHexagonal.domain.ports.out.UsuarioPortOut;
import com.example.arqHexagonal.infrastructure.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class UsuarioRepositoryAdapter implements UsuarioPortOut {
    private final UsuarioRepository usuarioRepository;

    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public ResponseBase createUsuarioOut(UsuarioCreateDto usuarioCreateDto) {
        UsuarioEntity usuarioEntity = new UsuarioEntity(
                usuarioCreateDto.getUsername(),
                usuarioCreateDto.getPassword(),
                usuarioCreateDto.getCity()
        );
        usuarioRepository.save(usuarioEntity);
        UsuarioResponse usuarioResponse = new UsuarioResponse(
                usuarioEntity.getUsuarioId(),
                usuarioEntity.getUsername(),
                usuarioEntity.getCity()
        );
        return new ResponseBase(200, "Exito", Optional.of(usuarioResponse));
    }

    @Override
    public ResponseBase findUsuarioByIdOut(int id) {
        return null;
    }

    @Override
    public ResponseBase deleteUsuarioByIdOut(int id) {
        return null;
    }
}
