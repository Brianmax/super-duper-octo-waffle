package com.example.arqHexagonal.domain.ports.out;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;

public interface UsuarioPortOut {
    ResponseBase createUsuarioOut(UsuarioCreateDto usuarioCreateDto);
    ResponseBase findUsuarioByIdOut(int id);
    ResponseBase deleteUsuarioByIdOut(int id);
}
