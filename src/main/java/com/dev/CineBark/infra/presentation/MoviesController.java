package com.dev.CineBark.infra.presentation;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.core.usecases.CreateMoviesCase;
import com.dev.CineBark.core.usecases.FindMovieCase;
import com.dev.CineBark.infra.dtos.MoviesDto;
import com.dev.CineBark.infra.mappers.MoviesMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/")
public class MoviesController {

    private final CreateMoviesCase createMoviesCase;
    private final MoviesMapper moviesMapper;
    private final FindMovieCase findMovieCase;

    public MoviesController(CreateMoviesCase createMoviesCase, MoviesMapper moviesMapper,FindMovieCase findMovieCase) {
        this.createMoviesCase = createMoviesCase;
        this.moviesMapper = moviesMapper;
        this.findMovieCase = findMovieCase;
    }

    @PostMapping("createmovie")
    public MoviesDto createMovie(@RequestBody MoviesDto moviesDTO){
        Movies movies = createMoviesCase.execute(moviesMapper.toDomain(moviesDTO));
        return moviesMapper.toDTO(movies);
    }

    @GetMapping("findmovie")
    public List<MoviesDto> findMovie(){
        return findMovieCase.execute()
                .stream()
                .map(moviesMapper::toDTO)
                .collect(Collectors.toList());
    }
}
