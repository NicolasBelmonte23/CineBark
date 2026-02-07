package com.dev.CineBark.infra.gateway;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.core.gateway.MoviesGateway;
import com.dev.CineBark.infra.mappers.MovieEntityMapper;
import com.dev.CineBark.infra.persistence.MoviesEntity;
import com.dev.CineBark.infra.persistence.MoviesRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component

public class MoviesRepositoryGateway implements MoviesGateway {

    private final MoviesRepository movieRepository;
    private final MovieEntityMapper mapper;

    public MoviesRepositoryGateway(MoviesRepository movieRepository, MovieEntityMapper mapper) {
        this.movieRepository = movieRepository;
        this.mapper = mapper;
    }

    @Override
    public Movies createMovie(Movies movies) {
        MoviesEntity movieEntity = mapper.toEntity(movies);
        MoviesEntity movie = movieRepository.save(movieEntity);
        return mapper.toDomain(movie);
    }

    @Override
    public List<Movies> findMovies() {
        return movieRepository.findAll().stream()
                .map(mapper :: toDomain)
                .collect(Collectors.toList());
        }
    }
