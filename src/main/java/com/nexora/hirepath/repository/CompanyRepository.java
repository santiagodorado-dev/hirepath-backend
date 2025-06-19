package com.nexora.hirepath.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexora.hirepath.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    Optional<Company> findByUserUserId(Long userId);

}
