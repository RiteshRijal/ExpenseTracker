package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class AbstractUpdatedDetailDto extends AbstractCreatedDetailDto {

    private Date updateDate;

    private Date updateTime;

    private Date getUpdateDate() {
        return updateDate;
    }

    private Date getUpdateTime() {
        return updateTime;
    }
    
}
