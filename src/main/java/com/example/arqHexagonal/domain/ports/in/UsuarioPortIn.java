package com.example.arqHexagonal.domain.ports.in;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.dto.UsuarioResponse;

public interface UsuarioPortIn {
    // crear un usuario
    ResponseBase<UsuarioResponse> createUsuario(UsuarioCreateDto usuarioCreateDto);
    ResponseBase<UsuarioResponse> findUsuarioById(int id);
    ResponseBase<Boolean> deleteUsuarioById(int id);
}
