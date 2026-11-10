package com.marcos.cadastro.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, Object>> tratarErrosDeValidacao(
            MethodArgumentNotValidException ex) {

        Map<String, Object> erros = new HashMap<>();

        ex.getBindingResult().getFieldErrors().forEach(erro -> {
            erros.put(erro.getField(), erro.getDefaultMessage());
        });

        Map<String, Object> resposta = new HashMap<>();

        resposta.put("status", 400);
        resposta.put("mensagem", "Erro de validação");
        resposta.put("erros", erros);

        return ResponseEntity.badRequest().body(resposta);
    }

}