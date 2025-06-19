package com.nexora.hirepath.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nexora.hirepath.model.JobApplication;
import com.nexora.hirepath.model.JobApplicationStatus;
import com.nexora.hirepath.model.JobVacancy;
import com.nexora.hirepath.model.User;

import jakarta.transaction.Transactional;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    List<JobApplication> findByUserEmail(String email);

    List<JobApplication> findByJobVacancyAndUser(JobVacancy jobVacancy, User user);

    List<JobApplication> findByJobVacancyJobVacancyId(Long jobVacancyId);

    Boolean existsByJobVacancyJobVacancyIdAndUserUserId(Long jobVacancyId, Long userId);

    @Modifying
    @Transactional
    @Query("DELETE FROM JobApplication ja WHERE ja.jobVacancy.jobVacancyId = :jobVacancyId")
    void deleteByJobVacancyId(@Param("jobVacancyId") Long jobVacancyId);

    @Modifying
    @Transactional
    @Query("UPDATE JobApplication ja SET ja.status = :status WHERE ja.jobApplicationId = :jobApplicationId")
    void updateStatus(@Param("jobApplicationId") Long jobApplicationId, @Param("status") JobApplicationStatus status);

}
