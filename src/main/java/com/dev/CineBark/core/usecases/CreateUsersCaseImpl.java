package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.gateway.UsersGateway;
import com.dev.CineBark.infra.exceptions.DuplicateUserException;

public class CreateUsersCaseImpl implements CreateUserCase{

    private final UsersGateway usersGateway;

    public CreateUsersCaseImpl(UsersGateway usersGateway) {
        this.usersGateway = usersGateway;
    }

    @Override
    public Users execute(Users users) {
        if(usersGateway.existId(users.id())){
            throw new DuplicateUserException("Já existe o id: " + users.id() + " no nosso sistema");
        }
        return users;
    }
}
