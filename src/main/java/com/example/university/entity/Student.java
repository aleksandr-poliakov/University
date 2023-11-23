package com.example.university.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    @OneToMany
    @JsonManagedReference
    private List<Subject> subjects;

    // Method to add a subject to the student
    public void addSubject(Subject subject) {
        if (subjects == null) {
            subjects = new ArrayList<>();
        }
        subjects.add(subject);
        subject.setStudent(this); // Set the reference to the owning student
    }
}
