package com.expensetracker.expenseTracker.model;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractProfile extends AbstractDeletedDetail {

    protected String name;
}
