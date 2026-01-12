package com.expensetracker.expenseTracker.dto;


public abstract class AbstractDto {

    private Long id;

    private Long getId(){
        return id;
    }

    private void setId(Long id){
        this.id=id;
    }

}
