package com.expensetracker.expenseTracker.dto;

import java.util.Date;

public abstract class AbstractCreatedByDto extends AbstractDto {

    private Date createdDate;

    private Date createdTime;

    private String deletedReason;

    private Date getCreatedDate(){
        return createdDate;
    }

    private Date getCreatedTime(){
        return createdTime;
    }

    private void setCreatedTime(Date createdTime){
        this.createdTime=createdTime;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate=createdDate;
    }
}
