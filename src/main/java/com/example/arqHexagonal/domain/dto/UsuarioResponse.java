package com.example.arqHexagonal.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class UsuarioResponse {
    private int usuarioId;
    private String username;
    private String city;

    public UsuarioResponse(int usuarioId, String username, String city) {
        this.usuarioId = usuarioId;
        this.username = username;
        this.city = city;
    }
}
