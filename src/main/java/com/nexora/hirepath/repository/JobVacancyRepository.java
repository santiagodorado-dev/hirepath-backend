package com.nexora.hirepath.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexora.hirepath.model.JobVacancy;

public interface JobVacancyRepository extends JpaRepository<JobVacancy, Long> {

    List<JobVacancy> findByCompanyCompanyId(Long companyId);

    List<JobVacancy> findByCategoryCategoryId(Long categoryId);

    List<JobVacancy> findByCompanyName(String companyName);

    List<JobVacancy> findByCategoryName(String categoryName);

}
