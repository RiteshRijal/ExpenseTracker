package com.expensetracker.expenseTracker.dto;

public class AbstractProfileDto extends AbstractDeletedByDto {

    private String name;

    private String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
