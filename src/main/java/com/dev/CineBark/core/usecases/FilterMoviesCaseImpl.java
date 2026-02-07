package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.core.gateway.MoviesGateway;
import com.dev.CineBark.infra.exceptions.NotFoundMoviesException;

import java.util.Optional;

public class FilterMoviesCaseImpl implements FilterMoviesCase{

    private final MoviesGateway moviesGateway;

    public FilterMoviesCaseImpl(MoviesGateway moviesGateway){
        this.moviesGateway = moviesGateway;
    }
    @Override
    public Movies execute(String id) {
        return moviesGateway.filterMovies(id).orElseThrow(() -> new NotFoundMoviesException("filme com id" + id + " não encontrado"));
    }
}
