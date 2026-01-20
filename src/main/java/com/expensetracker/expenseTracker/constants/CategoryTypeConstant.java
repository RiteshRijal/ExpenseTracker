package com.expensetracker.expenseTracker.constants;

import lombok.Getter;

@Getter
public enum CategoryTypeConstant {


    EXPENSES("Expenses"),
    INCOME("Income");

    private final String name;

    CategoryTypeConstant(String name) {
        this.name = name;
    }

    public static String[] getNames() {
        return java.util.Arrays.stream(values())
                .map(CategoryTypeConstant::getName)
                .toArray(String[]::new);
    }



}
