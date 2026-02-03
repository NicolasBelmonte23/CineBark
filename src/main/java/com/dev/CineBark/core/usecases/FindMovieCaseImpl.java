package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Movies;

public class FindMovieCaseImpl implements FindMovieCase{

    @Override
    public Movies execute(Movies movies){
        return movies;
    }
}
