package com.nexora.hirepath.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RegistrationRequestDTO(
        @NotBlank(message = "Email is required") @Email(message = "Invalid email address") String email,
        @NotBlank(message = "First name is required") @Size(max = 40, message = "First name must be less than 40 characters") String firstName,
        @NotBlank(message = "Last name is required") @Size(max = 100, message = "Last name must be less than 100 characters") String lastName,
        @NotBlank(message = "Password is required") @Size(min = 8, max = 80, message = "Password must be between 8 and 80 characters") String password) {

}
