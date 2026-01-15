package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.ExpenseDto;
import com.expensetracker.expenseTracker.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    @Override
    public boolean save(ExpenseDto expenseDto){
        return true;
    }

    @Override
    public boolean delete(ExpenseDto expenseDto){
        return true;
    }

    @Override
    public boolean update(ExpenseDto expenseDto){
        return true;
    }
}
