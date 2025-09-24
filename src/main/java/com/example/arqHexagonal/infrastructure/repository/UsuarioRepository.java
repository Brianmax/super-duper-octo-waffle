package com.example.arqHexagonal.infrastructure.repository;

import com.example.arqHexagonal.infrastructure.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
