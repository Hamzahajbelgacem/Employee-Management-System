package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.Department;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentInterfaceImp implements DepartmentInterface{
    @Override
    public Department createDepartment(Department department) {
        return null;
    }

    @Override
    public List<Department> getAllDepartments() {
        return null;
    }

    @Override
    public Department getDepartmentById(Long id) {
        return null;
    }

    @Override
    public Department updateDepartment(Long id, Department departmentDetails) {
        return null;
    }

    @Override
    public void deleteDepartment(Long id) {

    }
}
