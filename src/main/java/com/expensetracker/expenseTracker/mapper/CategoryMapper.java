package com.expensetracker.expenseTracker.mapper;

import com.expensetracker.expenseTracker.dto.CategoryDto;
import com.expensetracker.expenseTracker.model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryMapper {

    public static CategoryDto convertToDto(Category category){
        CategoryDto categoryDto=new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        category.setImageIconLocation(category.getImageIconLocation());
        categoryDto.setAdminDto(AdminMapper.convertToDto(category.getAdmin()));
        categoryDto.setName(categoryDto.getName());
        categoryDto.setCategoryTypeDto(CategoryTypeMapper.convertToDto(category.getCategoryType()));
        return categoryDto;
    }

    public static List<CategoryDto> convertToDtos(List<Category> categorys) {
        List<CategoryDto> categoryDtos = new ArrayList<>();
        for(Category category: categorys){
            categoryDtos.add(convertToDto(category));
        }
        return categoryDtos;
    }
}
