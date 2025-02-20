package com.example.employeemanagementsystem.repositories;

import com.example.employeemanagementsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
