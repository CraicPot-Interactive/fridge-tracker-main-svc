package com.craicpotinteractive.fridgetrackermainsvc.repository;

import com.craicpotinteractive.fridgetrackermainsvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.loginId = :Id")
    public User findUserByLoginId(Long Id);
}
