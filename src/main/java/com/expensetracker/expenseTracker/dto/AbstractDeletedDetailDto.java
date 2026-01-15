package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class AbstractDeletedDetailDto extends AbstractUpdatedDetailDto {

    private Date deletedDate;

    private Date deletedTime;

    private String deletedReason;

    private Date getDeletedDate(){
        return deletedDate;
    }

    private Date getDeletedTime(){
        return deletedTime;
    }

}
