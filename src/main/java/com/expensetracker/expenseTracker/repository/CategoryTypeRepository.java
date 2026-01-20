package com.expensetracker.expenseTracker.repository;

import com.expensetracker.expenseTracker.model.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryTypeRepository extends JpaRepository<CategoryType, Long> {

    boolean existsByName(String name);

}
