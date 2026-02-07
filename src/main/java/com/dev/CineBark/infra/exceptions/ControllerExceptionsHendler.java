package com.dev.CineBark.infra.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ControllerExceptionsHendler {

    @ExceptionHandler(DuplicateMovieException.class)
    public ResponseEntity<Map<String,String>> handleDuplicateMovieExceptions(DuplicateMovieException ex){
        Map<String,String> response = new HashMap<>();
        response.put("Error: ",ex.getMessage());
        response.put("Message "," Por favor, insira um id valido para o filme");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DuplicateUserException.class)
    public ResponseEntity<Map<String,String>> handleDuplicateUserExceptions(DuplicateUserException ex){
        Map<String,String> response = new HashMap<>();
        response.put("Error: ",ex.getMessage());
        response.put("Message "," Por favor, insira um id valido para o usuario");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundMoviesException.class)
    public ResponseEntity<Map<String,String>> handleNotFoundMovieExceptions(NotFoundMoviesException ex){
        Map<String,String> response = new HashMap<>();
        response.put("Error: ",ex.getMessage());
        response.put("Message "," Filme não encontrado.");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundUserException.class)
    public ResponseEntity<Map<String,String>> handleNotFoundUserExceptions(NotFoundUserException ex){
        Map<String,String> response = new HashMap<>();
        response.put("Error: ",ex.getMessage());
        response.put("Message "," Usuario não encontrado.");
        return new ResponseEntity<>(response, HttpStatus.CONFLICT);
    }
}
