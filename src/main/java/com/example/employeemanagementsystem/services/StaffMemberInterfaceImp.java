package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.StaffMember;
import com.example.employeemanagementsystem.repositories.StaffMemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StaffMemberInterfaceImp implements StaffMemberInterface{

     StaffMemberRepository staffMemberRepository;


    @Override
    public StaffMember addStaffMember(StaffMember staffMember) {

        return staffMemberRepository.save(staffMember);
    }

    @Override
    public List<StaffMember> getAllMemmbers() {
        return staffMemberRepository.findAll();
    }

    @Override
    public StaffMember getStaffMemberById(Long id) {
        return staffMemberRepository.findById(id).orElse(null);
    }

    @Override
    public StaffMember updateStaffMember(StaffMember staffMember) {
        return staffMemberRepository.save(staffMember);
    }

    @Override
    public void deleteStaffMember(Long id) {
        staffMemberRepository.deleteById(id);

    }
}
