package com.example.crudapp.controller;

import com.example.crudapp.model.User;
import com.example.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Iterable<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getuserById(id);
    }

    @PostMapping
    public User simpanUser(@RequestBody User user) {
        return userService.simpanUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setIdUser(id);
        return userService.simpanUser(user);
    }

    @DeleteMapping("/{id}")
    public void hapusUser(@PathVariable Long id) {
        userService.hapusUser(id);
    }

}
