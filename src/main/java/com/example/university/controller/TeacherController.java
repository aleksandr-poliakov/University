package com.example.university.controller;

import com.example.university.dto.teacher.InsertTeacherDTO;
import com.example.university.dto.teacher.TeacherDTO;
import com.example.university.service.TeacherService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author aleksandr on 28.11.2023
 * @projectName University
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/add")
    @Operation(summary = "add teacher to database")
    TeacherDTO addTeacher(@Valid @RequestBody InsertTeacherDTO insertTeacherDTO) {
        return teacherService.mapToDTO(teacherService.saveTeacher(insertTeacherDTO));
    }

    @GetMapping("/{teacherId}")
    @Operation(summary = "get teacher by id")
    TeacherDTO getById(@PathVariable UUID teacherId) {
        return teacherService.mapToDTO(teacherService.getTeacherById(teacherId).get());
    }

}
