package com.tzl.controller;

import com.tzl.entity.User;
import com.tzl.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/")
    public User insertOne(User user){
        User save = userRepository.save(user);
        return save;
    }
}
