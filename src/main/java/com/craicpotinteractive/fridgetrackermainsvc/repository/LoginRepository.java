package com.craicpotinteractive.fridgetrackermainsvc.repository;

import com.craicpotinteractive.fridgetrackermainsvc.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoginRepository extends JpaRepository<Login, Long> {
    //@Query("SELECT * FROM Login l WHERE Login.username = l.username")
    public Login findLoginByUserName(String userName);
}
