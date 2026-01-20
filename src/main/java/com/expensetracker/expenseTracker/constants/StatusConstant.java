package com.expensetracker.expenseTracker.constants;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum StatusConstant {

    CREATED("Created"),
    UPDATED("Updated"),
    DELETED("Deleted");

    private final String name;

    StatusConstant(String name) {
        this.name = name;
    }

    public static String[] getNames() {
        return java.util.Arrays.stream(values())
                .map(StatusConstant::getName)
                .toArray(String[]::new);
    }



}
