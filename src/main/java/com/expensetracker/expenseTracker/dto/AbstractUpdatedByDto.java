package com.expensetracker.expenseTracker.dto;

import java.util.Date;

public abstract class AbstractUpdatedByDto extends AbstractCreatedByDto {

    private Date updateDate;

    private Date updateTime;

    private Date getUpdateDate(){
        return updateDate;
    }

    private Date getUpdateTime(){
        return updateTime;
    }

    private void setUpdateTime(Date updateTime){
        this.updateTime=updateTime;
    }

    public void setUpdateDate(Date updateDate){
        this.updateDate=updateDate;
    }

}
