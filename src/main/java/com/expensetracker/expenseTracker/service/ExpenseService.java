package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.ExpenseDto;

public interface ExpenseService {

    boolean save(ExpenseDto expenseDto);

    boolean delete(ExpenseDto expenseDto);

    boolean update(ExpenseDto expenseDto);
}
