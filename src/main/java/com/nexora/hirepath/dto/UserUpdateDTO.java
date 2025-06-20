package com.nexora.hirepath.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserUpdateDTO(
        @NotBlank(message = "First name is required") @Size(max = 40, message = "First name must be less than 40 characters") String firstName,
        @NotBlank(message = "Last name is required") @Size(max = 100, message = "Last name must be less than 100 characters") String lastName) {

}
