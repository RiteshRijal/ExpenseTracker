package com.expensetracker.expenseTracker.repository;


import com.expensetracker.expenseTracker.model.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
