package com.example.arqHexagonal.domain.ports.in;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.dto.UsuarioUpdateDto;

public interface UsuarioPortIn {
    // crear un usuario
    ResponseBase createUsuario(UsuarioCreateDto usuarioCreateDto);
    ResponseBase findUsuarioById(int id);
    ResponseBase deleteUsuarioById(int id);
    ResponseBase updateUsuarioById(int id, UsuarioUpdateDto usuarioUpdateDto);
}
