package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;

public class CreateMovieCaseImpl implements CreatMovieCase {



    @Override
    public Movies execute(Movies movie) {
        return movie;
    }
}
