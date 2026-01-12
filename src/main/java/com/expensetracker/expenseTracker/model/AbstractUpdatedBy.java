package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public abstract class AbstractUpdatedBy extends AbstractCreatedBy {

    private Date updateDate;

    private Date updateTime;

    public Date getUpdateDate(){
        return updateDate;
    }

    public Date getUpdateTime(){
        return updateTime;
    }

    public void setUpdateTime(Date updateTime){
        this.updateTime=updateTime;
    }

    public void setUpdateDate(Date updateDate){
        this.updateDate=updateDate;
    }

}
