package com.dev.CineBark.infra.mappers;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.infra.dtos.MoviesDto;
import org.springframework.stereotype.Component;

@Component
public class MoviesMapper {

    public MoviesDto map(Movies movie) {
        return new MoviesDto(
        movie.id(),
        movie.title(),
        movie.ticket(),
        movie.typeTicket(),
        movie.room(),
        movie.description(),
        movie.category(),
        movie.rating(),
        movie.capacity(),
        movie.beginningMovie(),
        movie.endMovie(),
        movie.users()
        );
    }

    public Movies map(MoviesDto moviesDto) {
        return new Movies(
                moviesDto.id(),
                moviesDto.title(),
                moviesDto.ticket(),
                moviesDto.typeTicket(),
                moviesDto.room(),
                moviesDto.description(),
                moviesDto.category(),
                moviesDto.rating(),
                moviesDto.capacity(),
                moviesDto.beginningMovie(),
                moviesDto.endMovie(),
                moviesDto.users()
        );

    }
}
