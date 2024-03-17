package com.craicpotinteractive.fridgetrackermainsvc.service;

import com.craicpotinteractive.fridgetrackermainsvc.model.Login;
import com.craicpotinteractive.fridgetrackermainsvc.model.User;

public interface LoginService {
    public User Login(Login userLogin);
}
