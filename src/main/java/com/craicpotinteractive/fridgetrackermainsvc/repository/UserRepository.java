package com.craicpotinteractive.fridgetrackermainsvc.repository;

import com.craicpotinteractive.fridgetrackermainsvc.model.Login;
import com.craicpotinteractive.fridgetrackermainsvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    //@Query("SELECT * FROM Users u WHERE Users.loginId = u.Id")
    public User findUserByLoginId(Long Id);
}
