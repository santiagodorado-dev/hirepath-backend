package com.nexora.hirepath.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record JobApplicationRequestDTO(
        @NotBlank(message = "Comments are required") @Size(max = 1000, message = "Comments must be less than 1000 characters") String comments,
        @NotBlank(message = "Curriculum is required") @Size(max = 1000, message = "Curriculum must be less than 1000 characters") String curriculum,
        @NotBlank(message = "File is required") @Size(max = 1000, message = "File must be less than 1000 characters") String file,
        @NotNull(message = "Job vacancy ID is required") Long jobVacancyId) {

}
