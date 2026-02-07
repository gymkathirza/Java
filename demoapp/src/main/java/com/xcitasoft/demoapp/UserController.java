package com.xcitasoft.demoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.xcitasoft.models.User;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/list")
    public User[] getUsers(){
        return new User[] {
            new User("Alice", "alice@example.com"),
            new User("Bob", "bob@example.com")
        };
    }
};