package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.Roles;
import com.example.employeemanagementsystem.entities.User;
import com.example.employeemanagementsystem.repositories.UserRepository;
import com.example.employeemanagementsystem.services.UserInterface;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Getter
@Setter

public class UserInterfaceImp implements UserInterface {

    private final UserRepository userRepository;

    // ✅ Constructor-based Dependency Injection
    public UserInterfaceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    @Transactional
    public User createUser(User user) {
        System.out.println("Creating user: " + user); // Log the user object
        if (user.getRoles() == null) {
            user.setRoles(Roles.EMPLOYEE_ACCESS); // Default role if not provided
        }
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
