package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractCreatedDetail extends AbstractStatus {

    protected LocalDate createdDate;

    protected LocalDateTime createdTime;

}
