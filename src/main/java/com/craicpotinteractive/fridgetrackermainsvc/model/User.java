package com.craicpotinteractive.fridgetrackermainsvc.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name="User")
public class User {
    @Id
    @Column(name="userId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="surname")
    private String surname;

    @Column(name="emailAddress")
    private String email;

    @Column(name="dateOfBirth")
    private long dateOfBirth;

    @Column(name="loginId")
    private long loginId;
}
