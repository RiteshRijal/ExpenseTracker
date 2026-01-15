package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.ExpenseCategoryMapDto;


public interface ExpenseCategoryMapService {

    boolean save(ExpenseCategoryMapDto expenseCategoryMapDto);

    boolean delete(ExpenseCategoryMapDto expenseCategoryMapDto);

    boolean update(ExpenseCategoryMapDto expenseCategoryMapDto);

}
