package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.User;
import com.example.employeemanagementsystem.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserInterfaceImp implements UserInterface{

     UserRepository userRepository;
    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }
}
