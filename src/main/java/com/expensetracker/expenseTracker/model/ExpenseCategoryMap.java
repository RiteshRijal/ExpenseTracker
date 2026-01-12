package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;

@Entity
public class ExpenseCategoryMap extends AbstractProfile {

    private Category category;

    private Expense expense;

    private Category getCategory(){
        if(category==null){
            category= new Category();
        }
        return category;
    }

    public Expense getExpense(){
        if(expense == null){
            expense=new Expense();
        }
        return expense;
    }
}
