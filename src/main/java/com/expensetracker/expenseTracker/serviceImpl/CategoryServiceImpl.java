package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.CategoryDto;
import com.expensetracker.expenseTracker.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    @Override
    public boolean save(CategoryDto categoryDto){
        return true;
    }

    @Override
    public boolean delete(CategoryDto categoryDto){
        return true;
    }

    @Override
    public boolean update(CategoryDto categoryDto){
        return true;
    }
}
