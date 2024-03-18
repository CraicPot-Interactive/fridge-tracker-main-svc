package com.craicpotinteractive.fridgetrackermainsvc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name="users")
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
    private Date dateOfBirth;

    @Column(name="loginId")
    private long loginId;

    @Override
    public String toString() {
        return "User{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", loginId=" + loginId +
                '}';
    }
}
