package com.nexora.hirepath.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.nexora.hirepath.dto.JobApplicationRequestDTO;
import com.nexora.hirepath.dto.JobApplicationResponseDTO;
import com.nexora.hirepath.model.JobApplication;

@Mapper(componentModel = "spring")
public interface JobApplicationMapper {

    @Mapping(source = "jobVacancy.jobVacancyId", target = "jobVacancyId")
    @Mapping(source = "jobVacancy.title", target = "jobVacancyTitle")
    @Mapping(source = "user.userId", target = "userId")
    @Mapping(source = "user.firstName", target = "userFirstName")
    @Mapping(source = "user.lastName", target = "userLastName")
    @Mapping(source = "jobVacancy.company.companyId", target = "companyId")
    @Mapping(source = "jobVacancy.company.name", target = "companyName")
    @Mapping(source = "jobVacancy.category.categoryId", target = "categoryId")
    @Mapping(source = "jobVacancy.category.name", target = "categoryName")
    JobApplicationResponseDTO toDTO(JobApplication jobApplication);

    @Mapping(target = "jobApplicationId", ignore = true)
    @Mapping(target = "applicationDate", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "user", ignore = true)
    @Mapping(target = "jobVacancy", ignore = true)
    JobApplication toEntity(JobApplicationRequestDTO jobApplicationRequestDTO);

}
