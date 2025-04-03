package br.com.tiansouza.helpdesk.domain;

import java.util.UUID;

public record User(
        UUID id,
        String username,
        String email,
        String password,
        String name,
        Boolean active
) {
}
