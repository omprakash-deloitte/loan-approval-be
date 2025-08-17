package com.loan.approval.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequest {
    private User user;
    private Boolean isEligibleForLoan;
    private Integer loanAmount;
    private String notificationType;
}
