package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

public class UserController {

    private final UserService userService = new UserService();

    public User getUser(Long userId) {

        return userService.getUser(userId);
    }

    public boolean login(String username, String password) {

        return userService.authenticate(username, password);
    }
}