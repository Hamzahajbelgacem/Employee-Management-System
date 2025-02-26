package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.StaffMember;

import java.util.List;

public interface StaffMemberInterface {
    public StaffMember addStaffMember (StaffMember staffMember);

    public List<StaffMember> getAllMembers ();

    public StaffMember getStaffMemberById(Long id);

    public StaffMember updateStaffMember(StaffMember staffMember);


    void deleteStaffMember (Long id);
}
