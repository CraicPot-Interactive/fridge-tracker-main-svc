package com.craicpotinteractive.fridgetrackermainsvc.service;

import com.craicpotinteractive.fridgetrackermainsvc.model.Login;
import com.craicpotinteractive.fridgetrackermainsvc.model.User;
import com.craicpotinteractive.fridgetrackermainsvc.repository.LoginRepository;
import com.craicpotinteractive.fridgetrackermainsvc.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    private final UserRepository USERS;
    private final LoginRepository LOGINS;

    private final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);

    public LoginServiceImpl(UserRepository USERS, LoginRepository LOGINS) {
        this.USERS = USERS;
        this.LOGINS = LOGINS;
    }

    @Override
    public User Login(Login userLogin) {
        Login empty = new Login();
        try {
            empty = LOGINS.findLoginByUserName(userLogin.getUserName());
        }catch(Exception ex){
            LOGGER.error("Exception encountered at login {}", ex.getMessage());
        }
        if(empty.getPassword().equals(userLogin.getPassword())){
            return USERS.findUserByLoginId(empty.getId());
        }
        else{
            return null;
        }
    }
}
