package com.dev.CineBark.core.domain;

public record Users(Long id,
                    String name,
                    String email,
                    String password,
                    String cpf) {
}
