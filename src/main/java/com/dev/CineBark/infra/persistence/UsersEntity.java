package com.dev.CineBark.infra.persistence;

import com.dev.CineBark.core.domain.Movies;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String cpf;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MoviesEntity> movies;

}
