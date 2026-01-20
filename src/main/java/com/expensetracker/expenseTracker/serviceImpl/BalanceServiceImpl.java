package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.BalanceDto;
import com.expensetracker.expenseTracker.model.Balance;
import com.expensetracker.expenseTracker.repository.BalanceRepository;
import com.expensetracker.expenseTracker.service.BalanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BalanceServiceImpl implements BalanceService {

    private final BalanceRepository balanceRepository;

    @Override
    public boolean save(BalanceDto balanceDto){
        Balance balance =new Balance();
        balance.setName(balanceDto.getName());
        balance.setCreatedDate(LocalDate.now());
        balance.setCreatedTime(LocalDateTime.now());
        balanceRepository.save(balance);
        return true;
    }

    @Override
    public boolean delete(BalanceDto balanceDto){
        return true;
    }

    @Override
    public boolean update(BalanceDto expenseDto){
        return true;
    }
}
