package com.dev.CineBark.infra.mappers;

import com.dev.CineBark.core.domain.Movies;
import com.dev.CineBark.infra.persistence.MoviesEntity;
import org.springframework.stereotype.Component;

@Component
public class MovieEntityMapper {

    public MoviesEntity toEntity(Movies movie) {
        MoviesEntity entity = new MoviesEntity();
        entity.setId(movie.id());
        entity.setTitle(movie.title());
        entity.setTicket(movie.ticket());
        entity.setTypeTicket(movie.typeTicket());
        entity.setRoom(movie.room());
        entity.setDescription(movie.description());
        entity.setCategory(movie.category());
        entity.setRating(movie.rating());
        entity.setCapacity(movie.capacity());
        entity.setBeginningMovie(movie.beginningMovie());
        entity.setEndMovie(movie.endMovie());
        // NÃO seta user aqui
        return entity;
    }

    public Movies toDomain(MoviesEntity entity) {
        return new Movies(
                entity.getId(),
                entity.getTitle(),
                entity.getTicket(),
                entity.getTypeTicket(),
                entity.getRoom(),
                entity.getDescription(),
                entity.getCategory(),
                entity.getRating(),
                entity.getCapacity(),
                entity.getBeginningMovie(),
                entity.getEndMovie(),
                entity.getUser() != null ? entity.getUser().getId() : null
        );
    }
}
