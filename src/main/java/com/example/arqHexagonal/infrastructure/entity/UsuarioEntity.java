package com.example.arqHexagonal.infrastructure.entity;

import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.models.UsuarioModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
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
    private Date createdAt = new Date();
    private Date updatedAt;
    private boolean status = true;
    private String city;

    public UsuarioEntity(int usuarioId, String city, String username, String password, Date updatedAt) {
        this.usuarioId = usuarioId;
        this.city = city;
        this.username = username;
        this.password = password;
        this.updatedAt = updatedAt;
    }

    public UsuarioEntity(String username, String password, String city) {
        this.username = username;
        this.password = password;
        this.city = city;
    }

    public static UsuarioEntity toUsuarioEntity(UsuarioModel usuarioModel) {
        return new UsuarioEntity(
                usuarioModel.getUsuarioId(),
                usuarioModel.getCity(),
                usuarioModel.getUsername(),
                usuarioModel.getPassword(),
                usuarioModel.getUpdatedAt()
        );
    }

    public UsuarioModel toDomain() {
        return new UsuarioModel(
                this.usuarioId,
                this.city,
                this.username,
                this.password,
                this.createdAt,
                this.updatedAt,
                this.status
        );
    }
}
