package com.dev.CineBark.infra.beans;

import com.dev.CineBark.core.gateway.MoviesGateway;

import com.dev.CineBark.core.gateway.UsersGateway;
import com.dev.CineBark.core.usecases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateMoviesCase createMovieCase(MoviesGateway movieGateway){
        return new CreateMoviesCaseImpl(movieGateway);
    }

    @Bean
    public CreateUserCase createUserCase(UsersGateway usersGateway){
        return new CreateUsersCaseImpl(usersGateway);
    }

    @Bean
    public FindMovieCase findMovie(MoviesGateway moviesGateway){
        return new FindMovieCaseImpl(moviesGateway);
    }

    @Bean
    public FindUsersCase findUsersCase(UsersGateway usersGateway){
        return new FindUsersCaseImpl(usersGateway);
    }
}
