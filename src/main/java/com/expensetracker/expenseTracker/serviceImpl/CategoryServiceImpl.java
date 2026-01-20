package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.constants.StatusConstant;
import com.expensetracker.expenseTracker.dto.AdminDto;
import com.expensetracker.expenseTracker.dto.CategoryDto;
import com.expensetracker.expenseTracker.dto.StatusTypeDto;
import com.expensetracker.expenseTracker.mapper.CategoryMapper;
import com.expensetracker.expenseTracker.model.Category;
import com.expensetracker.expenseTracker.repository.AdminRepository;
import com.expensetracker.expenseTracker.repository.CategoryRepository;
import com.expensetracker.expenseTracker.repository.CategoryTypeRepository;
import com.expensetracker.expenseTracker.repository.StatusTypeRepository;
import com.expensetracker.expenseTracker.service.AdminService;
import com.expensetracker.expenseTracker.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {


   private final CategoryRepository categoryRepository;

   private final CategoryTypeRepository categoryTypeRepository;

   private final StatusTypeRepository statusTypeRepository;

   private final AdminRepository adminRepository;

    @Override
    public boolean save(CategoryDto categoryDto){
        Category category= new Category();
        category.setImageIconLocation("");
        category.setAdmin(adminRepository.getReferenceById(categoryDto.getAdminDto().getId()));
        category.setName(categoryDto.getName());
        category.setCategoryType(categoryTypeRepository.getReferenceById(categoryDto.getCategoryTypeDto().getId()));
        category.setCreatedTime(LocalDateTime.now());
        category.setCreatedDate(LocalDate.now());
        category.setImageIconLocation("");
        category.setStatusType(statusTypeRepository.getReferenceById(categoryDto.getStatusTypeDto().getId()));
//        categoryRepository.save(category);
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

    @Override
    public List<CategoryDto> getAllCategoryByAdminId(AdminDto adminDto){
        return CategoryMapper.convertToDtos(categoryRepository.findByAdminId(adminDto.getId()));
    }
}
