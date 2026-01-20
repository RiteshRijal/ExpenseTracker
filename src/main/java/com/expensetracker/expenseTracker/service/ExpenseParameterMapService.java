package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.ExpenseParameterMapDto;

public interface ExpenseParameterMapService {

    boolean save(ExpenseParameterMapDto expenseParameterMapDto);

    boolean delete(ExpenseParameterMapDto expenseParameterMapDto);

    boolean update(ExpenseParameterMapDto expenseParameterMapDto);
}
