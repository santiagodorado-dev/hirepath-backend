package com.nexora.hirepath.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexora.hirepath.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByNameIgnoreCase(String name);

}
