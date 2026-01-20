package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.AdminDto;
import com.expensetracker.expenseTracker.dto.CategoryDto;

import java.util.List;

public interface CategoryService {

    boolean save(CategoryDto categoryDto);

    boolean delete(CategoryDto categoryDto);

    boolean update(CategoryDto categoryDto);

    public List<CategoryDto> getAllCategoryByAdminId(AdminDto adminDto);
}
