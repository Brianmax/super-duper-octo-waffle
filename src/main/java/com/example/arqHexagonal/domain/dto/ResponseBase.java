package com.example.arqHexagonal.domain.dto;

import java.util.Optional;

public class ResponseBase<T> {
    private int code;
    private String message;
    private Optional<T> data;

    public ResponseBase(int code, String message, Optional<T> data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
