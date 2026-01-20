package com.expensetracker.expenseTracker.serviceImpl;


import com.expensetracker.expenseTracker.dto.ExpenseCategoryMapDto;
import com.expensetracker.expenseTracker.service.ExpenseCategoryMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseCategoryMapServiceImpl implements ExpenseCategoryMapService {

    @Override
    public boolean save(ExpenseCategoryMapDto expenseCategoryMapDto){
        return true;
    }

    @Override
    public boolean delete(ExpenseCategoryMapDto expenseCategoryMapDto){
        return true;
    }

    @Override
    public boolean update(ExpenseCategoryMapDto expenseCategoryMapDto){
        return true;
    }
}
