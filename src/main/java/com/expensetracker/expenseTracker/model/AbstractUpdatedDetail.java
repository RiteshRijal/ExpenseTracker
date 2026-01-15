package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractUpdatedDetail extends AbstractCreatedDetail {

    protected Date updateDate;

    protected Date updateTime;

}
