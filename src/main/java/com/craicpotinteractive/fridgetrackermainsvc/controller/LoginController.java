package com.craicpotinteractive.fridgetrackermainsvc.controller;

import com.craicpotinteractive.fridgetrackermainsvc.model.Login;
import com.craicpotinteractive.fridgetrackermainsvc.model.User;
import com.craicpotinteractive.fridgetrackermainsvc.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class LoginController {
    private final LoginService LOGINSERVICE;

    public LoginController(LoginService LOGINSERVICE) {
        this.LOGINSERVICE = LOGINSERVICE;
    }

    @PostMapping
    public User Login(Login user){
        return LOGINSERVICE.Login(user);
    }
}
