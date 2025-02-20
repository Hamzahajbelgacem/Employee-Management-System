package com.example.employeemanagementsystem.repositories;

import com.example.employeemanagementsystem.entities.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffMemberRepository extends JpaRepository<StaffMember ,Long > {
}
