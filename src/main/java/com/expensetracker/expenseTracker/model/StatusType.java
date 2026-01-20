package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "STATUS_TYPE")
@Getter
@Setter
@NoArgsConstructor
public class StatusType extends AbstractEntity{

    private String name;
}
