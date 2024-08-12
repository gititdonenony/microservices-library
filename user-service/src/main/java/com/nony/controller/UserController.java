package com.nony.controller;

import com.nony.model.User;
import com.nony.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private final UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
