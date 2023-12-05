package com.example.university.controller;

import com.example.university.dto.student.InsertStudentDTO;
import com.example.university.dto.student.StudentDTO;
import com.example.university.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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
        var student = new StudentDTO();
        return studentService.mapToDTO(studentService.saveStudent(insertStudentDTO));
    }

    @GetMapping("/{studentId}")
    @Operation(summary = "Get Student by Id")
    public StudentDTO getStudentById(@PathVariable("studentId") UUID studentId) {

        var student = studentService.getStudentById(studentId);
        return studentService.mapToDTO(student.get());
    }
}
