package com.example.employeemanagementsystem.services;

import com.example.employeemanagementsystem.entities.StaffMember;
import com.example.employeemanagementsystem.repositories.StaffMemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffMemberInterfaceImp implements StaffMemberInterface {

    private final StaffMemberRepository staffMemberRepository;

    // Constructor injection (Spring auto-wires this)
    public StaffMemberInterfaceImp(StaffMemberRepository staffMemberRepository) {
        this.staffMemberRepository = staffMemberRepository;
    }

    @Override
    public StaffMember addStaffMember(StaffMember staffMember) {
        System.out.println("Saving staff member: " + staffMember);
        StaffMember savedStaffMember = staffMemberRepository.save(staffMember);
        System.out.println("Staff member saved with ID: " + savedStaffMember.getMemberID());
        return savedStaffMember;
    }

    @Override
    public List<StaffMember> getAllMembers() {
        return staffMemberRepository.findAll();
    }

    @Override
    public StaffMember getStaffMemberById(Long id) {
        return staffMemberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Staff member not found with ID: " + id));
    }

    @Override
    public StaffMember updateStaffMember(StaffMember staffMember) {
        if (staffMember.getMemberID() == null || !staffMemberRepository.existsById(staffMember.getMemberID())) {
            throw new RuntimeException("Cannot update: Staff member not found");
        }
        return staffMemberRepository.save(staffMember);
    }

    @Override
    public void deleteStaffMember(Long id) {
        if (!staffMemberRepository.existsById(id)) {
            throw new RuntimeException("Cannot delete: Staff member not found with ID: " + id);
        }
        staffMemberRepository.deleteById(id);
    }
}