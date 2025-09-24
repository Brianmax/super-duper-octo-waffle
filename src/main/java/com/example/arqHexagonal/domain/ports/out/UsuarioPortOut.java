package com.example.arqHexagonal.domain.ports.out;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.dto.UsuarioResponse;

public interface UsuarioPortOut {
    ResponseBase<UsuarioResponse> createUsuarioOut(UsuarioCreateDto usuarioCreateDto);
    ResponseBase<UsuarioResponse> findUsuarioByIdOut(int id);
    ResponseBase<Boolean> deleteUsuarioByIdOut(int id);
}
