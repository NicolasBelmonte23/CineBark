package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.gateway.UsersGateway;
import com.dev.CineBark.infra.exceptions.NotFoundUserException;


public class FilterUsersCaseImpl implements FilterUsersCase{

    private final UsersGateway usersGateway;
    public FilterUsersCaseImpl(UsersGateway usersGateway){
        this.usersGateway = usersGateway;
    }
    @Override
    public Users execute (Long id) {
       return usersGateway.filterUsers(id).orElseThrow(() ->new NotFoundUserException("Usuario com id: " + id + " não encontrado"));

    }
}