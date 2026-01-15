package com.expensetracker.expenseTracker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "EXPENSE_CATEGORY_MAP")
@Getter
@Setter
@NoArgsConstructor
public class ExpenseCategoryMap extends AbstractProfile {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATEGORY_ID", nullable = false)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EXPENSE_ID", nullable = false)
    private Expense expense;


}
