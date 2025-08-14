package com.loan.approval.controller;

import com.loan.approval.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable Integer userId){

        System.out.println("User id called with : "+ userId);
        User user = new User();
        user.setUserId(userId);
        user.setUserName("Om Prakash new");
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
