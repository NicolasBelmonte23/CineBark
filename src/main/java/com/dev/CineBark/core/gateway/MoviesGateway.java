package com.dev.CineBark.core.gateway;

import com.dev.CineBark.core.domain.Movies;

import java.util.List;
import java.util.Optional;

public interface MoviesGateway {

    Movies createMovie(Movies movies);

    List<Movies> findMovies();

    Boolean existId(String ident);

    Optional<Movies> filterMovies(String id);

}
