package com.loan.approval.dto;

import com.loan.approval.model.Compliance;
import com.loan.approval.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComplianceRequestDTO {
    private Compliance compliance;
    private User user;
}
