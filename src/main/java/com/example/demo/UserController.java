package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @GetMapping("/users")
    public List<UserResponse> getAllUser() {
        List<UserResponse> usersResponses = new ArrayList<>();
        usersResponses.add(new UserResponse(1, "User1"));
        usersResponses.add(new UserResponse(2, "User2"));
        usersResponses.add(new UserResponse(3, "User3"));
        return usersResponses;
    }

    @GetMapping("/users/{id}")
    public UserResponse getUserById(@PathVariable int id){
        return new UserResponse(id, "User " + id);

    }
}