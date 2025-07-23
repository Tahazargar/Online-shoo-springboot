package com.example.shop.service;

import com.example.shop.model.User;
import com.example.shop.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user){
        if(userRepository.existsByUsername(user.getUsername())){
            throw new IllegalArgumentException("Username is already exists.");
        }
        return userRepository.save(user);
    }

    public List<User> listUsers(){
        return userRepository.findAll();
    }
}
