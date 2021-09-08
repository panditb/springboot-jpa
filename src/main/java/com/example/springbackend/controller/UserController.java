package com.example.springbackend.controller;



import com.example.springbackend.entity.User;
import com.example.springbackend.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserRepository repository;

    @GetMapping("/users")
    private Iterable<User> getUsers() {
        return repository.findAll();

    }
}
