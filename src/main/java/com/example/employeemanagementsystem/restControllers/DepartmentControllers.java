package com.example.employeemanagementsystem.restControllers;

import com.example.employeemanagementsystem.entities.Department;
import com.example.employeemanagementsystem.services.DepartmentInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")

public class DepartmentControllers {

@Autowired
   private  DepartmentInterface departmentInterface ;

    @PostMapping("/add")
    public Department addDepartment(@RequestBody Department department){
        return departmentInterface.createDepartment(department);
    }

    @GetMapping("/getAll")
    public List<Department> getAllDepartment(){
        return departmentInterface.getAllDepartments();
    }


    @GetMapping("/getById/{id}")
    public Department getDepartmentById(@PathVariable Long id ){
        return departmentInterface.getDepartmentById(id);
    }

    @GetMapping("/getByName")
    public Department getDepartementByName( String departmentName){
        return departmentInterface.getDepartementByName(departmentName);
    }

    @PutMapping("/update")
    public Department updateDepartment(@RequestBody Department department){
        return departmentInterface.updateDepartment(department);
    }

    @DeleteMapping("/Delete/{id}")
    void deleteDepartment(@PathVariable Long id){
        departmentInterface.deleteDepartment(id);
    }

}
