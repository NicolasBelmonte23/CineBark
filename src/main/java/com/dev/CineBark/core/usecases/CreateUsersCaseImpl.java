package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.gateway.UsersGateway;

public class CreateUsersCaseImpl implements CreateUserCase{

    private final UsersGateway usersGateway;

    public CreateUsersCaseImpl(UsersGateway usersGateway) {
        this.usersGateway = usersGateway;
    }

    @Override
    public Users execute(Users users) {
        return users;
    }
}
