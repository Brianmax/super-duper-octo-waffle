package com.example.arqHexagonal.infrastructure.config;

import com.example.arqHexagonal.domain.ports.out.UsuarioPortOut;
import com.example.arqHexagonal.infrastructure.repository.UsuarioRepository;
import com.example.arqHexagonal.infrastructure.repository.UsuarioRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public UsuarioPortOut usuarioPortOut(UsuarioRepositoryAdapter usuarioRepositoryAdapter) {
        return usuarioRepositoryAdapter;
    }
}
