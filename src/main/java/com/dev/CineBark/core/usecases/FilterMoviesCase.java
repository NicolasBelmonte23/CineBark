package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;


public interface FilterMoviesCase {

    Movies execute(String id);
}
