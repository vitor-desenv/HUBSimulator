package dev.integration.hub.dto;

import dev.integration.hub.enuns.UserRole;

public record RegisterDTO(
        String userName,
        String email,
        String password,
        String departamentId,
        UserRole role) {
}
