package com.example.loginregistrationspringbootthymeleaf.repository;

import com.example.loginregistrationspringbootthymeleaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
