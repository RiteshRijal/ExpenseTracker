package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.BalanceDto;

public interface BalanceService {

    boolean save(BalanceDto balanceDto);

    boolean delete(BalanceDto balanceDto);

    boolean update(BalanceDto balanceDto);
}
