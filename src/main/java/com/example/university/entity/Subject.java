package com.example.university.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "subject_tbl")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(name = "subject_note")
    private Integer note;
    @Column(name = "subject_name")
    private String name;
    @Column(name = "subject_description")
    private String description;
    @ManyToOne
    @JsonBackReference
    private Student student;
    @ManyToOne
    @JsonBackReference
    private Teacher teacher;
}
