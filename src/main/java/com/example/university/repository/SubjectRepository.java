package com.example.university.repository;

import com.example.university.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * @author aleksandr on 28.11.2023
 * @projectName University
 */
@Repository
public interface SubjectRepository extends JpaRepository <Subject, UUID> {
    @Query("SELECT s FROM Subject s WHERE s.name = ?1")
    Optional<Subject> getByName(String name);
}
