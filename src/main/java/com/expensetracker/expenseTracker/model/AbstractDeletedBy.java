package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;

import java.util.Date;

@MappedSuperclass
public abstract class AbstractDeletedBy extends AbstractUpdatedBy {

    private Date deletedDate;

    private Date deletedTime;

    private String deletedReason;

    public Date getDeletedDate(){
        return deletedDate;
    }

    public Date getDeletedTime(){
        return deletedTime;
    }

    public void setDeletedTime(Date deletedTime){
        this.deletedTime=deletedTime;
    }

    public void setDeletedDate(Date deletedDate){
        this.deletedDate=deletedDate;
    }
}
