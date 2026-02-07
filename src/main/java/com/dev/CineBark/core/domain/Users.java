package com.dev.CineBark.core.domain;

import java.util.List;

public record Users(Long id,
                    String name,
                    String email,
                    String password,
                    String cpf) {
}
