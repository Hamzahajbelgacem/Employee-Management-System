package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.User;

import java.util.List;

public interface UserInterface {

   public User createUser (User user);

   public List<User> getAllUsers ();

   public User updateUser (User user);

   public User getUserById (Long id);

   void deleteUser (Long id);

}
