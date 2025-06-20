package com.nexora.hirepath.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record JobVacancyRequestDTO(
        @NotBlank(message = "Title is required") @Size(max = 100, message = "Title must be less than 100 characters") String title,
        @NotBlank(message = "Description is required") @Size(max = 1000, message = "Description must be less than 1000 characters") String description,
        @NotNull(message = "Salary is required") @Positive(message = "Salary must be greater than 0") Double salary,
        @NotNull(message = "Featured is required") Boolean featured,
        @Size(max = 200, message = "Image URL must be less than 200 characters") String imageUrl,
        @NotBlank(message = "Details are required") @Size(max = 1000, message = "Details must be less than 1000 characters") String details,
        @NotNull(message = "Company ID is required") Long companyId,
        @NotNull(message = "Category ID is required") Long categoryId) {

}
