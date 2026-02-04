package com.dev.CineBark.infra.persistence;

import com.dev.CineBark.core.enums.Ticket;

import java.time.LocalDateTime;

public record Movies(String title,
                     String ticket,
                     Ticket typeTicket,
                     int room,
                     String description,
                     String category,
                     double rating,
                     int capacity,
                     LocalDateTime beginningMovie,
                     LocalDateTime endMovie) {
}
