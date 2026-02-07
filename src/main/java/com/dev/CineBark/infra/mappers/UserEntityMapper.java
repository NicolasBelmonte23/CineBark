package com.dev.CineBark.infra.mappers;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.infra.persistence.UsersEntity;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {

    public UsersEntity toEntity(Users user) {
        return new UsersEntity(
                user.id(),
                user.name(),
                user.email(),
                user.password(),
                user.cpf()
        );
    }

    public Users toDomain(UsersEntity entity) {
        return new Users(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getPassword(),
                entity.getCpf()
        );
    }
}


