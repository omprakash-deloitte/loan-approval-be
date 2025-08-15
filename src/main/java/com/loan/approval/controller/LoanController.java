package com.loan.approval.controller;

import com.loan.approval.model.LoanRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @PostMapping("/create-request")
    public ResponseEntity<?> createNewLoanRequest(@RequestParam String userName){
        System.out.println("User Name is : -> " + userName);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/send-email")
    public ResponseEntity<String> sendEmailForApproval(@RequestBody LoanRequest loanRequest){
        System.out.println("Received for approval status " + loanRequest.getEligibleForLoan());
        System.out.println("Received user name : " + loanRequest.getUser().getUserName());
        return new ResponseEntity<>("Received for approval",HttpStatus.OK);
    }
}
