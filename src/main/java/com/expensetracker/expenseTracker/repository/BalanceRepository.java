package com.expensetracker.expenseTracker.repository;

import com.expensetracker.expenseTracker.model.Balance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BalanceRepository extends JpaRepository<Balance, Long> {
}
