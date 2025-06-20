package com.nexora.hirepath.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CompanyUpdateRequestDTO(
        @NotBlank(message = "Name is required") @Size(max = 80, message = "Name must be less than 80 characters") String name,
        @NotBlank(message = "Fiscal address is required") @Size(max = 100, message = "Fiscal address must be less than 100 characters") String fiscalAddress,
        @NotBlank(message = "Country is required") @Size(max = 40, message = "Country must be less than 40 characters") String country,
        @NotBlank(message = "First name is required") @Size(max = 40, message = "First name must be less than 40 characters") String firstName,
        @NotBlank(message = "Last name is required") @Size(max = 100, message = "Last name must be less than 100 characters") String lastName) {

}
