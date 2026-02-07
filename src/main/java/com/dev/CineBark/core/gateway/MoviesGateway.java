package com.dev.CineBark.core.gateway;

import com.dev.CineBark.core.domain.Movies;

import java.util.List;

public interface MoviesGateway {

    Movies createMovie(Movies movies);

    List<Movies> findMovies();
}
