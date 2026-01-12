package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;

@Entity
public class Category extends AbstractProfile {

    private String imageIconLocation;

    private String getImageIconLocation(){
        return imageIconLocation;
    }

    public void setImageIconLocation(String imageIconLocation){
        this.imageIconLocation=imageIconLocation;
    }
}
