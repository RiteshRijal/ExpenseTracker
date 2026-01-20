package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.IncomeDto;
import com.expensetracker.expenseTracker.model.Income;
import com.expensetracker.expenseTracker.repository.IncomeRepository;
import com.expensetracker.expenseTracker.service.IncomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService {

    private final IncomeRepository incomeRepository;

    @Override
    public boolean save(IncomeDto incomeDto){
        Income income=new Income();
        income.setName(incomeDto.getName());
        income.setCreatedDate(LocalDate.now());
        income.setCreatedTime(LocalDateTime.now());
        incomeRepository.save(income);
        return true;
    }

    @Override
    public boolean delete(IncomeDto incomeDto){
        return true;
    }

    @Override
    public boolean update(IncomeDto incomeDto){
        return true;
    }
}
