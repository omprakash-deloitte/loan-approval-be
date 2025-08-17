package com.loan.approval.controller;

import com.loan.approval.exception.GeneralException;
import com.loan.approval.model.User;
import com.loan.approval.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Integer userId){
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/create-dummy")
    public ResponseEntity<String> createUserListInDB(){
        String response = userService.createUserList();
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

}
