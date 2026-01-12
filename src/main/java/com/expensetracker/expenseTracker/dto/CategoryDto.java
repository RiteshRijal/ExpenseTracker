package com.expensetracker.expenseTracker.dto;

public class CategoryDto extends AbstractProfileDto{

    private String imageIconLocation;

    private String getImageIconLocation(){
        return imageIconLocation;
    }

    private void setImageIconLocation(String imageIconLocation){
        this.imageIconLocation=imageIconLocation;
    }
}
