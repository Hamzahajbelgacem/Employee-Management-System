package com.example.employeemanagementsystem.restControllers;

import com.example.employeemanagementsystem.entities.StaffMember;
import com.example.employeemanagementsystem.services.StaffMemberInterface;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffMembers")
@AllArgsConstructor
public class StaffMemberControllers {
    private StaffMemberInterface staffMemberInterface ;

@PostMapping("/add")
    public StaffMember addMember(StaffMember staffMember){
        return staffMemberInterface.addStaffMember(staffMember);
    }

@GetMapping("/getAll")
  public List<StaffMember> gettAllMember(){
    return staffMemberInterface.getAllMemmbers();
  }
  @GetMapping("/getById/{id}")
    public StaffMember getMemberById(@PathVariable long id){
    return staffMemberInterface.getStaffMemberById(id);
  }

  @PutMapping("/update/")
    public StaffMember updateMember(StaffMember staffMember){
    return staffMemberInterface.updateStaffMember(staffMember);
  }

  @DeleteMapping("/delete/{id}")
    void deleteMember(Long id){
    staffMemberInterface.deleteStaffMember(id);
  }







}
