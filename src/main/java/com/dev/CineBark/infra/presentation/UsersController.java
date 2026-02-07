package com.dev.CineBark.infra.presentation;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.usecases.CreateUserCase;
import com.dev.CineBark.core.usecases.FindUsersCase;
import com.dev.CineBark.infra.dtos.UsersDto;
import com.dev.CineBark.infra.mappers.UsersMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v2/")
public class UsersController {
    private final CreateUserCase createUsersCase;
    private final UsersMapper usersMapper;
    private final FindUsersCase findUsersCase;

    public UsersController(CreateUserCase createUsersCase, UsersMapper usersMapper, FindUsersCase findUsersCase) {
        this.createUsersCase = createUsersCase;
        this.usersMapper = usersMapper;
        this.findUsersCase = findUsersCase;
    }

    @PostMapping("createusers")
    public UsersDto createUser(@RequestBody UsersDto usersDTO){
        Users users = createUsersCase.execute(usersMapper.toDomain(usersDTO));
        return usersMapper.toDto(users);
    }

    @GetMapping("findusers")
    public List<UsersDto> findUsers(){
        return findUsersCase.execute()
                .stream()
                .map(usersMapper::toDto)
                .collect(Collectors.toList());
    }
}
