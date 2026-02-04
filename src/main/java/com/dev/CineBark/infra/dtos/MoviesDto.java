package com.dev.CineBark.infra.dtos;

import com.dev.CineBark.core.domain.Users;
import com.dev.CineBark.core.enums.Ticket;
import java.time.LocalDateTime;

public record MoviesDto(Long id,
                        String title,
                        String ticket,
                        Ticket typeTicket,
                        int room,
                        String description,
                        String category,
                        double rating,
                        int capacity,
                        LocalDateTime beginningMovie,
                        LocalDateTime endMovie,
                        Users users)
{}
