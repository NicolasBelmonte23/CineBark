package com.dev.CineBark.infra.persistence;

import com.dev.CineBark.core.domain.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MoviesRepository extends JpaRepository<MoviesEntity, Long> {
        Optional<Movies> findBytypeTicket(String id);

}
