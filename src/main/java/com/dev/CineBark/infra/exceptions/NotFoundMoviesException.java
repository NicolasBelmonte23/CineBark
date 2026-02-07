package com.dev.CineBark.infra.exceptions;

public class NotFoundMoviesException extends RuntimeException {
    public NotFoundMoviesException(String message) {
        super(message);
    }
}
