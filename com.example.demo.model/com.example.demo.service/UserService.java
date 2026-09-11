package com.example.demo.service;

import com.example.demo.model.User;

public class UserService {

    public User getUser(Long userId) {

        // Simulating database lookup
        return new User(
                userId,
                "nitin",
                "nitin@example.com"
        );
    }

    public boolean authenticate(String username, String password) {

        return "admin".equals(username)
                && "password123".equals(password);
    }
}