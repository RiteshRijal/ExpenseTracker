package com.expensetracker.expenseTracker.mapper;

import com.expensetracker.expenseTracker.dto.ExpenseDto;
import com.expensetracker.expenseTracker.model.Expense;

public class ExpenseMapper {

    public ExpenseDto convertToDto(Expense expense){
        ExpenseDto expenseDto=new ExpenseDto();
        expenseDto.setId(expense.getId());
        expenseDto.setName(expense.getName());
        return expenseDto;
    }
}
