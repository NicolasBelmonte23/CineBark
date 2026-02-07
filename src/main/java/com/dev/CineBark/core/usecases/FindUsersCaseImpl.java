package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.gateway.UsersGateway;

import java.util.List;

public class FindUsersCaseImpl implements FindUsersCase {

    private final UsersGateway usersGateway;

    public FindUsersCaseImpl(UsersGateway usersGateway){
        this.usersGateway = usersGateway;
    }

    @Override
    public List<Users> execute() {
        return List.of();
    }
}
