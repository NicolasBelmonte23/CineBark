package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.core.gateway.MoviesGateway;

public class CreateMoviesCaseImpl implements CreateMoviesCase {

    private final MoviesGateway movieGateway;

    public CreateMoviesCaseImpl(MoviesGateway movieGateway){
        this.movieGateway = movieGateway;
    }

    @Override
    public Movies execute(Movies movie) {
        return movieGateway.createMovie(movie);
    }
}