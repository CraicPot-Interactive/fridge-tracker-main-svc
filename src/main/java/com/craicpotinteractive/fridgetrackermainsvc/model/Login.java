package com.craicpotinteractive.fridgetrackermainsvc.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity(name="logins")
@Data
public class Login {
    @Id
    @Column(name="loginId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(name="userName")
    private String userName;
    @Column(name="password")
    private String password;
}
