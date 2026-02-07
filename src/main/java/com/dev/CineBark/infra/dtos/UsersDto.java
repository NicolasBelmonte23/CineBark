package com.dev.CineBark.infra.dtos;

import com.dev.CineBark.core.domain.Movies;

public record UsersDto (Long id,
                        String name,
                        String email,
                        String password,
                        String cpf)
{}