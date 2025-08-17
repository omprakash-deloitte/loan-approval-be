package com.loan.approval.service;

import com.loan.approval.dto.ComplianceRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    public Boolean checkForCompliance(ComplianceRequestDTO complianceRequestDTO){
        System.out.println(complianceRequestDTO.getCompliance().getName() + " Compliance completed for " + complianceRequestDTO.getUser().getUserName());
        System.out.println("--- PASS ---");
//        Add logic to check for different compliance and return based on that
        return complianceRequestDTO.getCompliance().getIsRequired();
    }
}
