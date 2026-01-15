package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractCreatedDetail extends AbstractStatus {


    protected Date createdDate;

    protected Date createdTime;

    protected String deletedReason;

}
