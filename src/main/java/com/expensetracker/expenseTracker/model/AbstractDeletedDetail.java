package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractDeletedDetail extends AbstractUpdatedDetail {

    protected Date deletedDate;

    protected Date deletedTime;

    protected String deletedReason;
    
}
