package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractProfile extends AbstractDeletedBy {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
