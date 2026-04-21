package dev.integration.hub.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record LoginRequest(@NotEmpty(message = "Email é obrigatório") String email,
                           @NotEmpty(message = "Senha é obrigatório") String password) {



}
