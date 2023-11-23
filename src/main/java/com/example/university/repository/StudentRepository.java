package com.example.university.repository;

import com.example.university.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {}
