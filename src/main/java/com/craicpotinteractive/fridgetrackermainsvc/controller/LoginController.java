package com.craicpotinteractive.fridgetrackermainsvc.controller;

import com.craicpotinteractive.fridgetrackermainsvc.model.Login;
import com.craicpotinteractive.fridgetrackermainsvc.model.User;
import com.craicpotinteractive.fridgetrackermainsvc.repository.UserRepository;
import com.craicpotinteractive.fridgetrackermainsvc.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/login")
public class LoginController {
    private final LoginService LOGINSERVICE;
    private final UserRepository USERREPO;

    public LoginController(LoginService LOGINSERVICE, UserRepository USERREPO) {
        this.LOGINSERVICE = LOGINSERVICE;
        this.USERREPO = USERREPO;
    }

    @PostMapping("/login")
    public User Login(Login user){
        return LOGINSERVICE.Login(user);
    }

    @GetMapping("/index")
    public String Index(){
        //User print = USERREPO.findUserByLoginId(1L);
        return "Hi";
    }
}
