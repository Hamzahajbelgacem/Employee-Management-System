package com.example.employeemanagementsystem.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StaffMember implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberID;

    private String firstName ;

    private String LastName ;

@Email(message = "Invalid email format ")
    private String email ;

    private String salary ;
@ManyToOne
@JoinColumn(name = "department_id")
    private Department department ;

@OneToOne
@JoinColumn(name = "user_id")
    private User user ;

}
