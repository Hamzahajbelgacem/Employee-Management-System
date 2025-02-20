package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.Department;

import java.util.List;

public interface DepartmentInterface {
    Department createDepartment(Department department);
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department updateDepartment(Long id, Department departmentDetails);
    void deleteDepartment(Long id);

}
