package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.CategoryDto;

public interface CategoryService {

    boolean save(CategoryDto categoryDto);

    boolean delete(CategoryDto categoryDto);

    boolean update(CategoryDto categoryDto);
}
