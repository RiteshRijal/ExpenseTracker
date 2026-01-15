package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AbstractStatusDto extends AbstractDto {

    protected AdminDto adminDto;

    protected String statusDesc;
}
