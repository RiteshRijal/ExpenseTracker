package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.IncomeDto;

public interface IncomeService {

    boolean save(IncomeDto balanceDto);

    boolean delete(IncomeDto balanceDto);

    boolean update(IncomeDto balanceDto);
}
