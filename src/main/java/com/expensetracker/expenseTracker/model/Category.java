package com.expensetracker.expenseTracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CATEGORY")
@Getter
@Setter
@NoArgsConstructor
public class Category extends AbstractProfile {

    private String imageIconLocation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORYTYPE_ID", nullable = false)
    private CategoryType categoryType;

}
