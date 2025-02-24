package com.example.employeemanagementsystem.repositories;

import com.example.employeemanagementsystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department , Long> {
    Department getDepartmentByDepartmentName (String departementName) ;
}
