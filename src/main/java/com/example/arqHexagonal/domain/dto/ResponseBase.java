package com.example.arqHexagonal.domain.dto;

import java.util.Optional;

public class ResponseBase<T> {
    private int code;
    private String message;
    private Optional<T> data;
}
