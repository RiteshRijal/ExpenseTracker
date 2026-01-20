package com.expensetracker.expenseTracker.repository;

import com.expensetracker.expenseTracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
