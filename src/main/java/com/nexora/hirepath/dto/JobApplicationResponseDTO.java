package com.nexora.hirepath.dto;

import java.time.LocalDate;

import com.nexora.hirepath.model.JobApplicationStatus;

public record JobApplicationResponseDTO(Long jobApplicationId, LocalDate applicationDate, String comments,
        JobApplicationStatus status, String curriculum, String file, Long jobVacancyId, String jobVacancyTitle,
        Long userId, String userFirstName, String userLastName, Long companyId, String companyName, Long categoryId,
        String categoryName) {

}
