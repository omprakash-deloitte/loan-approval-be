package com.loan.approval.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private Integer userId;
    private String userName;
    private Integer age;
    private String phoneNumber;
    private String address;
    private Integer creditScore = 0;
    private String gender;
    private Integer loanAmount;

}
