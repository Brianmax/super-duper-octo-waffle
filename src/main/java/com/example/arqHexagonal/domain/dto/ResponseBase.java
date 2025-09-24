package com.example.arqHexagonal.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Optional;
@Getter
@Setter
public class ResponseBase {
    private int code;
    private String message;
    private Optional<Object> data;

    public ResponseBase(int code, String message, Optional<Object> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
