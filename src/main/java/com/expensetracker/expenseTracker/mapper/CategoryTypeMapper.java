package com.expensetracker.expenseTracker.mapper;

import com.expensetracker.expenseTracker.dto.CategoryTypeDto;
import com.expensetracker.expenseTracker.model.CategoryType;

import java.util.ArrayList;
import java.util.List;

public class CategoryTypeMapper {

    public static CategoryTypeDto convertToDto(CategoryType categoryType){
        CategoryTypeDto categoryTypeDto=new CategoryTypeDto();
        categoryTypeDto.setId(categoryType.getId());
        categoryTypeDto.setName(categoryType.getName());
        return categoryTypeDto;
    }

    public static List<CategoryTypeDto> convertToDtos(List<CategoryType> categoryTypes) {
        List<CategoryTypeDto> categoryTypeDtos = new ArrayList<>();
        for(CategoryType categoryType: categoryTypes){
            categoryTypeDtos.add(convertToDto(categoryType));
        }
        return categoryTypeDtos;
    }
}
