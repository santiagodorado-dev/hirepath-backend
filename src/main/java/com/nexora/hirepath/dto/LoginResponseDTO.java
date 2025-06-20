package com.nexora.hirepath.dto;

public record LoginResponseDTO(String token, Long userId, String email, String firstName, String lastName, String role) {

}
