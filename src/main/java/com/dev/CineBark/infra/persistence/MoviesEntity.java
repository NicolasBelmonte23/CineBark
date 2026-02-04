package com.dev.CineBark.infra.persistence;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.enums.Ticket;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "movies")
public class MoviesEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String ticket;
    @Enumerated(EnumType.STRING)
    private Ticket typeTicket;
    private int room;
    private String description;
    private String category;
    private double rating;
    private int capacity;
    private LocalDateTime beginningMovie;
    private LocalDateTime endMovie;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsersEntity user;

}
