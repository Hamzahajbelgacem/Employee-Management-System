package com.example.employeemanagementsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class User implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String username ;

    private String password;

    @Enumerated(EnumType.STRING)
    private Set<Roles>  roles ;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private StaffMember staffMember ;
}
