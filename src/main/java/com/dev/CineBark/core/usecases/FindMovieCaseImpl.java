package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.core.gateway.MoviesGateway;

import java.util.List;

public class FindMovieCaseImpl implements FindMovieCase{

    private final MoviesGateway moviesGateway;

    public FindMovieCaseImpl(MoviesGateway moviesGateway){
        this.moviesGateway = moviesGateway;
    }

    @Override
    public List<Movies> execute() {
        return moviesGateway.findMovies();
    }
}
