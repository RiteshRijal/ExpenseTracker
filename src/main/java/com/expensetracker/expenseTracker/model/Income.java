package com.expensetracker.expenseTracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "INCOME")
@Getter
@Setter
@NoArgsConstructor
public class Income extends AbstractProfile {

}
