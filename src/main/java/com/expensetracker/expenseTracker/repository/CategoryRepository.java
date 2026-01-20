package com.expensetracker.expenseTracker.repository;

import com.expensetracker.expenseTracker.model.Balance;
import com.expensetracker.expenseTracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByAdminId(Long adminId);
}
