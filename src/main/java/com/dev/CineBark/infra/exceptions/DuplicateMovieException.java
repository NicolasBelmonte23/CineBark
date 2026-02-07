package com.dev.CineBark.infra.exceptions;

public class DuplicateMovieException extends RuntimeException{

    public DuplicateMovieException(String message){
        super(message);
    }
}
