package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractDeletedDetail extends AbstractUpdatedDetail {

    protected LocalDate deletedDate;

    protected LocalDateTime deletedTime;

    protected String deletedReason;
    
}
