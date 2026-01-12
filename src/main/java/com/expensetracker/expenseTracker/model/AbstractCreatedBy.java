package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public abstract class AbstractCreatedBy extends AbstractEntity {


    private Date createdDate;

    private Date createdTime;

    private String deletedReason;

    public Date getCreatedDate(){
        return createdDate;
    }

    public Date getCreatedTime(){
        return createdTime;
    }

    public void setCreatedTime(Date createdTime){
        this.createdTime=createdTime;
    }

    public void setCreatedDate(Date createdDate){
        this.createdDate=createdDate;
    }
}
