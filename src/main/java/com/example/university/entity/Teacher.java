package com.example.university.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table(name = "teacher_tbl")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "teacher_name")
    private String name;
    @OneToMany
    @JsonManagedReference
    private List<Subject> subjects;
}
