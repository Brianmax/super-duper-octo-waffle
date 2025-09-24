package com.example.arqHexagonal.domain.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UsuarioModel {
    private int usuarioId;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;
    private boolean status;
    private String city;
}
