package com.loan.approval.model;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Component;

public class LoanRequest {
    private User user;
    private Boolean isEligibleForLoan;
    private Integer loanAmount;

    public Integer getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Integer loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Boolean getEligibleForLoan() {
        return isEligibleForLoan;
    }

    public void setEligibleForLoan(Boolean eligibleForLoan) {
        isEligibleForLoan = eligibleForLoan;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
