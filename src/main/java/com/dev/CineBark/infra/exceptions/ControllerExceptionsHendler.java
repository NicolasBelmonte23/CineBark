package com.dev.CineBark.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionsHendler {

    @ExceptionHandler
    public ResponseEntity<Map<String,String>> handleDuplicateMovieExceptions(DuplicateMovieException ex){
        Map<String,String> response = new HashMap<>();
        response.put("Error: ",ex.getMessage());
        response.put("Message "," Por favor, insira um id valido para o filme");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler
    public ResponseEntity<Map<String,String>> handleDuplicateMovieExceptions(DuplicateUserException ex){
        Map<String,String> response = new HashMap<>();
        response.put("Error: ",ex.getMessage());
        response.put("Message "," Por favor, insira um id valido para o filme");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}
