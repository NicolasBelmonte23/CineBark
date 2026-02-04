package com.dev.CineBark.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<MoviesEntity, Long> {
}
