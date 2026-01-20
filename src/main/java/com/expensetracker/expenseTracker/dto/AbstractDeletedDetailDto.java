package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public abstract class AbstractDeletedDetailDto extends AbstractUpdatedDetailDto {

    private LocalDate deletedDate;

    private LocalDate deletedTime;

    private String deletedReason;

    private LocalDate getDeletedDate(){
        return deletedDate;
    }

    private LocalDate getDeletedTime(){
        return deletedTime;
    }

}
