package com.nexora.hirepath.dto;

import java.time.LocalDate;

public record UserResponseDTO(Long userId, String email, String firstName, String lastName, String role,
        Boolean enabled, LocalDate createdAt) {

}
