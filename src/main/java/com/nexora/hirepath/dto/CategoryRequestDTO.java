package com.nexora.hirepath.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryRequestDTO(
        @NotBlank(message = "Name is required") @Size(max = 100, message = "Name must be less than 100 characters") String name,
        @NotBlank(message = "Description is required") @Size(max = 1000, message = "Description must be less than 1000 characters") String description) {

}
