package com.example.arqHexagonal.application;

import com.example.arqHexagonal.domain.dto.ResponseBase;
import com.example.arqHexagonal.domain.dto.UsuarioCreateDto;
import com.example.arqHexagonal.domain.dto.UsuarioResponse;
import com.example.arqHexagonal.domain.ports.in.UsuarioPortIn;
import com.example.arqHexagonal.domain.ports.out.UsuarioPortOut;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioPortIn {
    private final UsuarioPortOut usuarioPortOut;

    public UsuarioServiceImpl(UsuarioPortOut usuarioPortOut) {
        this.usuarioPortOut = usuarioPortOut;
    }

    @Override
    public ResponseBase<UsuarioResponse> createUsuario(UsuarioCreateDto usuarioCreateDto) {
        // validar el password
        // convertir a mayuscula la ciudad
        String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).+$";
        String password = usuarioCreateDto.getPassword();
        if (!password.matches(regex) || (password.length() < 8 || password.length() > 64)){
            return null;
        }
        String city = usuarioCreateDto.getCity();
        usuarioCreateDto.setCity(city.toUpperCase());
        return usuarioPortOut.createUsuarioOut(usuarioCreateDto);
    }

    @Override
    public ResponseBase<UsuarioResponse> findUsuarioById(int id) {
        return null;
    }

    @Override
    public ResponseBase<Boolean> deleteUsuarioById(int id) {
        return null;
    }
}
