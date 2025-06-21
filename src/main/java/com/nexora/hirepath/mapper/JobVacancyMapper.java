package com.nexora.hirepath.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.nexora.hirepath.dto.JobVacancyRequestDTO;
import com.nexora.hirepath.dto.JobVacancyResponseDTO;
import com.nexora.hirepath.model.Category;
import com.nexora.hirepath.model.Company;
import com.nexora.hirepath.model.JobVacancy;

@Mapper(componentModel = "spring", uses = { CompanyMapper.class, CategoryMapper.class })
public interface JobVacancyMapper {

    @Mapping(source = "company.companyId", target = "companyId")
    @Mapping(source = "company.name", target = "companyName")
    @Mapping(source = "category.categoryId", target = "categoryId")
    @Mapping(source = "category.name", target = "categoryName")
    @Mapping(source = "company.country", target = "country")
    JobVacancyResponseDTO toDTO(JobVacancy jobVacancy);

    @Mapping(target = "jobVacancyId", ignore = true)
    @Mapping(target = "publishedAt", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(target = "company", source = "companyId")
    @Mapping(target = "category", source = "categoryId")
    JobVacancy toEntity(JobVacancyRequestDTO jobVacancyRequestDTO);

    @Mapping(target = "jobVacancyId", ignore = true)
    @Mapping(target = "publishedAt", ignore = true)
    @Mapping(target = "status", ignore = true)
    @Mapping(source = "companyId", target = "company")
    @Mapping(source = "categoryId", target = "category")
    void updateJobVacancyFromDTO(JobVacancyRequestDTO jobVacancyRequestDTO, @MappingTarget JobVacancy jobVacancy);

    default Company mapCompany(Long companyId) {
        if (companyId == null)
            return null;
        Company company = new Company();
        company.setCompanyId(companyId);
        return company;
    }

    default Category mapCategory(Long categoryId) {
        if (categoryId == null) {
            return null;
        }
        Category category = new Category();
        category.setCategoryId(categoryId);
        return category;
    }
}
