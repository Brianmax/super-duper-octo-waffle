package com.example.arqHexagonal.infrastructure.controller;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.ports.in.UsuarioPortIn;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    private final UsuarioPortIn usuarioPortIn;

    public UsuarioController(UsuarioPortIn usuarioPortIn) {
        this.usuarioPortIn = usuarioPortIn;
    }

    @PostMapping("/save")
    public ResponseBase createResponse(@RequestBody UsuarioCreateDto usuarioCreateDto) {
        return usuarioPortIn.createUsuario(usuarioCreateDto);
    }
}
