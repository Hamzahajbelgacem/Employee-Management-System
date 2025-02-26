package com.example.employeemanagementsystem.restControllers;

import com.example.employeemanagementsystem.entities.StaffMember;
import com.example.employeemanagementsystem.services.StaffMemberInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffMembers")

public class StaffMemberControllers {
    private final StaffMemberInterface staffMemberInterface ;

    public StaffMemberControllers(StaffMemberInterface staffMemberInterface) {
        this.staffMemberInterface = staffMemberInterface;
    }

    @PostMapping("/add")
    public StaffMember addMember(@RequestBody StaffMember staffMember){
        return staffMemberInterface.addStaffMember(staffMember);
    }

@GetMapping("/getAll")
  public List<StaffMember> gettAllMember(){
    return staffMemberInterface.getAllMembers();
  }
  @GetMapping("/getById/{id}")
    public StaffMember getMemberById(@PathVariable long id){
    return staffMemberInterface.getStaffMemberById(id);
  }

  @PutMapping("/update/")
    public StaffMember updateMember(@RequestBody StaffMember staffMember){
    return staffMemberInterface.updateStaffMember(staffMember);
  }

  @DeleteMapping("/delete/{id}")
    void deleteMember(@PathVariable Long id){
    staffMemberInterface.deleteStaffMember(id);
  }







}
