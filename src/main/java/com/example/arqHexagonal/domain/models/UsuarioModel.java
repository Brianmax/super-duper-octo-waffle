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

    public UsuarioModel(int usuarioId, String city, String username, String password, Date createdAt, Date updatedAt, boolean status) {
        this.usuarioId = usuarioId;
        this.city = city;
        this.username = username;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
    }
}
