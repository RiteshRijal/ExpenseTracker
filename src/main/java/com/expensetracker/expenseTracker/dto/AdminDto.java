package com.expensetracker.expenseTracker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdminDto extends AbstractDto{

    public String adminId;

    public String firstName;

    public String fullName;

    public String middleName;

    public String lastName;

    public String age;

    public String password;

    public String phoneNo;

    public String email;

    public Long noOfAttempts;

    public String oldPassword;

}
