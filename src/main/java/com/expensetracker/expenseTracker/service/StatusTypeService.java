package com.expensetracker.expenseTracker.service;

import com.expensetracker.expenseTracker.dto.StatusTypeDto;

public interface StatusTypeService {

    boolean save(StatusTypeDto statusTypeDto);

    boolean delete(StatusTypeDto statusTypeDto);

    boolean update(StatusTypeDto statusTypeDto);
}
