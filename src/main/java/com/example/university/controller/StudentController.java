package com.example.university.controller;

import com.example.university.dto.InsertStudentDTO;
import com.example.university.dto.StudentDTO;
import com.example.university.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    @Operation(summary = "Posibility to add student to database")

    public StudentDTO save(@Valid @RequestBody InsertStudentDTO insertStudentDTO) {
        return studentService.mapToDTO(studentService.saveStudent(insertStudentDTO));
    }
}
