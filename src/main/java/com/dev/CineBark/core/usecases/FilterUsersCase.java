package com.dev.CineBark.core.usecases;

import com.dev.CineBark.core.domain.Users;

public interface FilterUsersCase {

    Users execute(Long id);
}
