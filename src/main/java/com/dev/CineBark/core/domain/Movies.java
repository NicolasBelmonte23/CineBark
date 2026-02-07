package com.dev.CineBark.core.domain;

import com.dev.CineBark.core.enums.Ticket;

import java.time.LocalDateTime;

public record Movies(Long id,
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
                     Long userId) {
}
