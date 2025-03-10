package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.Department;
import com.example.employeemanagementsystem.repositories.DepartmentRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

@Getter
@Setter
public class DepartmentInterfaceImp implements DepartmentInterface{

   private final DepartmentRepository departmentRepository;

    public DepartmentInterfaceImp(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @Override
    public Department createDepartment(Department department) {
        System.out.println("Saving department: " + department .getDepartmentName());
        Department savedDepartment = departmentRepository.save(department);
        System.out.println("Department saved with ID: " + savedDepartment.getDepartmentId());
        return savedDepartment;
    }

    @Override
    public List<Department> getAllDepartments() {

        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);

    }

    @Override
    public Department getDepartementByName(String departmentName) {
        return departmentRepository.getDepartmentByDepartmentName(departmentName);
    }


    @Override
    public Department updateDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);

    }
}
