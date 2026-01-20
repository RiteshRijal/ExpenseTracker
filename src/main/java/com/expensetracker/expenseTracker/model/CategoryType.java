package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "CATEGORY_TYPE")
@Getter
@Setter
@NoArgsConstructor
public class CategoryType extends AbstractEntity{

    @Column(unique = true, nullable = false)
    private String name;
}
