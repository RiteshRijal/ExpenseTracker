package com.expensetracker.expenseTracker.repository;

import com.expensetracker.expenseTracker.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Long id(Long id);
}
