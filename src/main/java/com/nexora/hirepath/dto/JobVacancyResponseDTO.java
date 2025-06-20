package com.nexora.hirepath.dto;

import java.time.LocalDate;

import com.nexora.hirepath.model.JobVacancyStatus;

public record JobVacancyResponseDTO(Long jobVacancyId, String title, String description, LocalDate publishedAt, Double salary, JobVacancyStatus status, Boolean featured, String imageUrl, String details, Long categoryId, String categoryName, Long companyId, String companyName, String country) {

}
