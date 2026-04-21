package dev.integration.hub.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequest(
        @NotEmpty(message = "Nome é obrigatório") String userName,
        @NotEmpty(message = "E-mail é obrigatório") String email,
        @NotEmpty(message = "Senha é obrigatória") String password) {



}
