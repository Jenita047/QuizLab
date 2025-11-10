package com.quiz.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, String> {
    user findByUsernameAndPassword(String username, String password);
}
