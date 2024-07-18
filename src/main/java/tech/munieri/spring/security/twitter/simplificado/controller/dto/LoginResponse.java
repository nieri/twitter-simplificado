package tech.munieri.spring.security.twitter.simplificado.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
