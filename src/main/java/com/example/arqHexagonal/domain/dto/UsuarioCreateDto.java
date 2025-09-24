package com.example.arqHexagonal.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioCreateDto {
    private String username;
    private String password;
    private String city;
}
