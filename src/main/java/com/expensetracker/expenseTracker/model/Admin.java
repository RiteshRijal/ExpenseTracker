package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ADMIN")
@Getter
@Setter
@NoArgsConstructor
public class Admin extends AbstractEntity{

    public String adminId;

    public String password;

    public String phoneNo;

    public String email;

    public Long noOfAttempts;

    public String oldPassword;
}
