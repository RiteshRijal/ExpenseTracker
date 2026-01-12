package com.expensetracker.expenseTracker.dto;

import java.util.Date;

public abstract class AbstractDeletedByDto extends AbstractUpdatedByDto {

    private Date deletedDate;

    private Date deletedTime;

    private String deletedReason;

    private Date getDeletedDate(){
        return deletedDate;
    }

    private Date getDeletedTime(){
        return deletedTime;
    }

    private void setDeletedTime(Date deletedTime){
        this.deletedTime=deletedTime;
    }

    public void setDeletedDate(Date deletedDate){
        this.deletedDate=deletedDate;
    }
}
