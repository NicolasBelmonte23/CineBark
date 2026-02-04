package com.dev.CineBark.infra.presentation;

import com.dev.CineBark.infra.dtos.UsersDto;
import com.dev.CineBark.infra.persistence.UsersEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v2/")
public class UsersController {

    @PostMapping("createuser")
    public String createUser(@RequestBody UsersDto users){
        return "Usuario criado";
    }
}
