package com.expensetracker.expenseTracker.serviceImpl;



import com.expensetracker.expenseTracker.dto.ExpenseParameterMapDto;
import com.expensetracker.expenseTracker.service.ExpenseParameterMapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExpenseParameterMapServiceImpl implements ExpenseParameterMapService {

    @Override
    public boolean save(ExpenseParameterMapDto expenseParameterMapDto){
        return true;
    }

    @Override
    public boolean delete(ExpenseParameterMapDto expenseParameterMapDto){
        return true;
    }

    @Override
    public boolean update(ExpenseParameterMapDto expenseParameterMapDto){
        return true;
    }
}
