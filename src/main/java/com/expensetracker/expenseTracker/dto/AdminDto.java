package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDto {

    public String adminId;

    public String password;

    public String phoneNo;

    public String email;

    public String noOfAttempts;

    public String oldPassword;

}
