package com.dev.CineBark.infra.exceptions;

public class NotFoundUserException extends RuntimeException{

    public NotFoundUserException(String message){
        super(message);
    }
}
