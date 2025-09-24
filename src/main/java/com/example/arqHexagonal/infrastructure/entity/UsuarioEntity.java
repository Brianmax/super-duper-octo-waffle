package com.example.arqHexagonal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int usuarioId;
    private String username;
    private String password;
    private Date createdAt;
    private Date updatedAt;
    private boolean status;
    private String city;
}
