package com.expensetracker.expenseTracker.dto;

import java.time.LocalDate;

public class ExpenseCategoryMapDto extends AbstractProfileDto {

    private CategoryDto categoryDto;

    private ExpenseDto expenseDto;

    private LocalDate boughtdate;



    private CategoryDto getCategoryDto(){
        if(categoryDto==null){
            categoryDto= new CategoryDto();
        }
        return categoryDto;
    }

    public ExpenseDto getExpenseDto(){
        if(expenseDto == null){
            expenseDto=new ExpenseDto();
        }
        return expenseDto;
    }
}
