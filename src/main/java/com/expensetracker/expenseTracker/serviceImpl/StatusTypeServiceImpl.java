package com.expensetracker.expenseTracker.serviceImpl;

import com.expensetracker.expenseTracker.dto.StatusTypeDto;
import com.expensetracker.expenseTracker.model.StatusType;
import com.expensetracker.expenseTracker.repository.StatusTypeRepository;
import com.expensetracker.expenseTracker.service.StatusTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class StatusTypeServiceImpl implements StatusTypeService {

    private final StatusTypeRepository statusTypeRepository;

    @Override
    public boolean save(StatusTypeDto statusTypeDto){
        StatusType statusType =new StatusType();
        statusType.setName(statusTypeDto.getName());
        statusTypeRepository.save(statusType);
        return true;
    }

    @Override
    public boolean delete(StatusTypeDto statusTypeDto){
        return true;
    }

    @Override
    public boolean update(StatusTypeDto expenseDto){
        return true;
    }
}
