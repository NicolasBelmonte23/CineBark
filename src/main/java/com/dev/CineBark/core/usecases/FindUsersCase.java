package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;

import java.util.List;

public interface FindUsersCase {

    List<Users> execute();
}
