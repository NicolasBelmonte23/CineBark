package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;

public class CreateUserCaseImpl implements CreateUserCase{
    @Override
    public Users execute(Users users) {
        return users;
    }
}
