package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.core.gateway.MoviesGateway;
import com.dev.CineBark.infra.exceptions.DuplicateMovieException;

public class CreateMoviesCaseImpl implements CreateMoviesCase {

    private final MoviesGateway movieGateway;

    public CreateMoviesCaseImpl(MoviesGateway movieGateway){
        this.movieGateway = movieGateway;
    }

    @Override
    public Movies execute(Movies movie) {
        if(movieGateway.existId(movie.ticket())){
            throw new DuplicateMovieException("O id numero: " + movie.title() + " já existe no nosso sistema." );        }
        return movieGateway.createMovie(movie);
    }
}