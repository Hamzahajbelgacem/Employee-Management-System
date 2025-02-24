package com.example.employeemanagementsystem.restControllers;

import com.example.employeemanagementsystem.entities.User;
import com.example.employeemanagementsystem.services.UserInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")

public class UserControllers {

    private UserInterface userInterface ;
    // ✅ Constructor-based dependency injection (Best practice)
    public UserControllers(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @GetMapping("/")
    public List<User> getAllUsers(){
       return userInterface.getAllUsers();
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userInterface.createUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userInterface.updateUser(user);
    }

    @GetMapping("/get/{id}")
    public User  getUserById(@PathVariable ("id") Long id){
        return userInterface.getUserById(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteUser(@PathVariable("id") Long id){
        userInterface.deleteUser(id);
    }



}
