package com.dev.CineBark.infra.persistence;

import com.dev.CineBark.core.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<UsersEntity,Long> {

    Optional<Users> findByid(Long id);
}
