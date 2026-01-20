package com.expensetracker.expenseTracker.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractStatus extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Admin_ID", nullable = false)
    protected Admin admin;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_TYPE_ID", nullable = false)
    protected StatusType statusType;

}
