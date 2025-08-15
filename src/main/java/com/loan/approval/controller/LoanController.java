package com.loan.approval.controller;

import com.loan.approval.model.LoanRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @PostMapping("/create-request")
    public ResponseEntity<?> createNewLoanRequest(@RequestParam String userName){
        System.out.println("User Name is : -> " + userName);
        return new ResponseEntity<>("Created", HttpStatus.CREATED);
    }

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendEmailForApproval(@RequestBody LoanRequest loanRequest){
        String sendNotification = "Notification sent";
        if(Objects.equals(loanRequest.getNotificationType(), "Final")){
            sendNotification = "Sent Final Notification to " + loanRequest.getUser().getUserName() ;
        }else {
            sendNotification = "Sent Loan Approval Notification to " + loanRequest.getUser().getUserName() ;
        }
        return new ResponseEntity<>(sendNotification,HttpStatus.OK);
    }
}
