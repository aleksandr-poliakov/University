package com.example.university.repository;

import com.example.university.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * @author aleksandr on 28.11.2023
 * @projectName University
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, UUID> { }
