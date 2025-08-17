package com.loan.approval.controller;

import com.loan.approval.model.LoanRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/loan")
public class LoanController {

    @PostMapping("/send-notification")
    public ResponseEntity<String> sendEmailForApproval(@RequestBody LoanRequest loanRequest){
        String sendNotification;
        if(Objects.equals(loanRequest.getNotificationType(), "Final")){
            sendNotification = "Sent Final Approved Loan Notification with documents to " + loanRequest.getUser().getUserName() ;
        }else {
            sendNotification = "Sent Loan Approval Notification to stage 1 " + loanRequest.getUser().getUserName() ;
        }
        return new ResponseEntity<>(sendNotification,HttpStatus.OK);
    }
}
