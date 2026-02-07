package com.dev.CineBark.infra.mappers;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.infra.dtos.UsersDto;
import org.springframework.stereotype.Component;


@Component
public class UsersMapper {

    public Users toDomain(UsersDto usersDTO){
        return new Users(
                usersDTO.id(),
                usersDTO.name(),
                usersDTO.email(),
                usersDTO.password(),
                usersDTO.cpf()
        );

    }

    public UsersDto toDto(Users users){
        return new UsersDto(
                users.id(),
                users.name(),
                users.email(),
                users.password(),
                users.cpf()
        );
    }
}
