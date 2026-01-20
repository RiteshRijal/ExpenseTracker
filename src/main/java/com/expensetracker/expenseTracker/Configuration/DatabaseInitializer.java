package com.expensetracker.expenseTracker.Configuration;

import com.expensetracker.expenseTracker.constants.CategoryTypeConstant;
import com.expensetracker.expenseTracker.constants.StatusConstant;
import com.expensetracker.expenseTracker.dto.StatusTypeDto;
import com.expensetracker.expenseTracker.model.CategoryType;
import com.expensetracker.expenseTracker.model.StatusType;
import com.expensetracker.expenseTracker.repository.CategoryTypeRepository;
import com.expensetracker.expenseTracker.repository.StatusTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    private final CategoryTypeRepository categoryTypeRepository;
    private final StatusTypeRepository statusTypeRepository;

    public DatabaseInitializer(
            CategoryTypeRepository categoryTypeRepository,
            StatusTypeRepository statusTypeRepository) {
        this.categoryTypeRepository = categoryTypeRepository;
        this.statusTypeRepository= statusTypeRepository;
    }

    @Override
    public void run(String... args) {
        for(String categoryTypeName: CategoryTypeConstant.getNames()){
            if(!categoryTypeRepository.existsByName(categoryTypeName)){
                CategoryType categoryType = new CategoryType();
                categoryType.setName(categoryTypeName);
                categoryTypeRepository.save(categoryType);
            }
        }
        for(String statusName: StatusConstant.getNames()){
            if(!statusTypeRepository.existsByName(statusName)){
                StatusType statusType = new StatusType();
                statusType.setName(statusName);
                statusTypeRepository.save(statusType);
            }
        }

    }

}

