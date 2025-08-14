package com.loan.approval.controller;

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
}
