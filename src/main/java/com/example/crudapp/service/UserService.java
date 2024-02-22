package com.example.crudapp.service;

import com.example.crudapp.model.User;
import com.example.crudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getuserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User simpanUser(User user) {
        return userRepository.save(user);
    }

    public void hapusUser(Long id) {
        userRepository.deleteById(id);
    }
}
