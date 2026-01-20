package com.expensetracker.expenseTracker.repository;

import com.expensetracker.expenseTracker.model.StatusType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusTypeRepository extends JpaRepository<StatusType, Long> {

    boolean existsByName(String name);
}
