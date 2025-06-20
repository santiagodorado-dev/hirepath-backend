package com.nexora.hirepath.dto;

import java.time.LocalDate;

public record CompanyResponseDTO(String companyId, String name, String fiscalAddress, String country, String email,
        String firstName, String lastName, Boolean enabled, LocalDate createdAt) {

}
