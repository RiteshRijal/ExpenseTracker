package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class AbstractCreatedDetailDto extends AbstractStatusDto {

    private Date createdDate;

    private Date createdTime;

}
