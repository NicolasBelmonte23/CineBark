package com.dev.CineBark.infra.mappers;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.infra.dtos.MoviesDto;
import org.springframework.stereotype.Component;

@Component
public class MoviesMapper {

    public MoviesDto toDTO(Movies movie) {
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
                movie.userId()
        );
    }

    public Movies toDomain(MoviesDto dto) {
        return new Movies(
                dto.id(),
                dto.title(),
                dto.ticket(),
                dto.typeTicket(),
                dto.room(),
                dto.description(),
                dto.category(),
                dto.rating(),
                dto.capacity(),
                dto.beginningMovie(),
                dto.endMovie(),
                dto.userId()
        );
    }
}
