package com.dev.CineBark.core.gateway;

import com.dev.CineBark.core.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UsersGateway {

    Users createUsers(Users user);

    List<Users> findUsers();

    Boolean existId(Long id);

    Optional<Users> filterUsers(Long id);
}
