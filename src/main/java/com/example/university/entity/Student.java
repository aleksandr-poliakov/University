package com.example.university.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student_tbl")
public class Student {
    /*
    Last Name
First Name
Date of Birth
List of subjects studied
Grades for subjects

     */
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name ="birth_date")
    private Date birthdate;
}
