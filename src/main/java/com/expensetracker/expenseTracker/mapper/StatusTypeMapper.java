package com.expensetracker.expenseTracker.mapper;

import com.expensetracker.expenseTracker.dto.StatusTypeDto;
import com.expensetracker.expenseTracker.model.StatusType;

import java.util.ArrayList;
import java.util.List;

public class StatusTypeMapper {

    public static StatusTypeDto convertToDto(StatusType statusType){
        StatusTypeDto statusTypeDto=new StatusTypeDto();
        statusTypeDto.setId(statusType.getId());
        statusTypeDto.setName(statusType.getName());
        return statusTypeDto;
    }

    public static List<StatusTypeDto> convertToDtos(List<StatusType> statusTypes) {
        List<StatusTypeDto> statusTypeDtos = new ArrayList<>();
        for(StatusType statusType: statusTypes){
            statusTypeDtos.add(convertToDto(statusType));
        }
        return statusTypeDtos;
    }
}
