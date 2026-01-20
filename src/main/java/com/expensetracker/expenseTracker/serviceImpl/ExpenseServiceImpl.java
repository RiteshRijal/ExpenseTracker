package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.ExpenseDto;
import com.expensetracker.expenseTracker.model.AbstractCreatedDetail;
import com.expensetracker.expenseTracker.model.Expense;
import com.expensetracker.expenseTracker.repository.ExpenseRepository;
import com.expensetracker.expenseTracker.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Override
    public boolean save(ExpenseDto expenseDto){
        Expense expense=new Expense();
        expense.setName(expenseDto.getName());
        expense.setCreatedDate(LocalDate.now());
        expense.setCreatedTime(LocalDateTime.now());
        expenseRepository.save(expense);
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
