package com.dev.CineBark.infra.gateway;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.gateway.UsersGateway;
import com.dev.CineBark.infra.mappers.UserEntityMapper;
import com.dev.CineBark.infra.persistence.UsersEntity;
import com.dev.CineBark.infra.persistence.UsersRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class UsersRepositoyGatewayImpl implements UsersGateway {

    private final UsersRepository usersRepository;
    private final UserEntityMapper mapper;

    public UsersRepositoyGatewayImpl(UsersRepository usersRepository, UserEntityMapper mapper) {
        this.usersRepository = usersRepository;
        this.mapper = mapper;
    }

    @Override
    public Users createUsers(Users user) {
        UsersEntity usersEntity = mapper.toEntity(user);
        UsersEntity users = usersRepository.save(usersEntity);
        return mapper.toDomain(users);
    }

    @Override
    public List<Users> findUsers() {
        return usersRepository.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());}

    @Override
    public Boolean existId(Long id) {
        return usersRepository.existsById(id);
    }

    @Override
    public Optional<Users> filterUsers(Long id) {
        return usersRepository.findByid(id);
    }


}
