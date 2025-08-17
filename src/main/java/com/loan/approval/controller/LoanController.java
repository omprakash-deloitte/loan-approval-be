package com.loan.approval.controller;

import com.loan.approval.dto.ComplianceRequestDTO;
import com.loan.approval.dto.LoanRequestDTO;
import com.loan.approval.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendEmailForApproval(@RequestBody LoanRequestDTO loanRequestDTO) {
        String sendNotification;
        if (Objects.equals(loanRequestDTO.getNotificationType(), "Final")) {
            sendNotification = "Sent Final Approved Loan Notification with documents to " + loanRequestDTO.getUser().getUserName();
        } else {
            sendNotification = "Sent Loan Approval Notification to stage 1 " + loanRequestDTO.getUser().getUserName();
        }
        return new ResponseEntity<>(sendNotification, HttpStatus.OK);
    }

    @PostMapping("/check-compliance")
    public ResponseEntity<Boolean> checkForCompliance(@RequestBody ComplianceRequestDTO complianceRequestDTO) {
        Boolean isCompliant = loanService.checkForCompliance(complianceRequestDTO);
        return new ResponseEntity<>(isCompliant, HttpStatus.OK);
    }
}
