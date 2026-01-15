package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto extends AbstractProfileDto{

    private String imageIconLocation;

    private String getImageIconLocation(){
        return imageIconLocation;
    }

}
