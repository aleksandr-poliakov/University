package com.example.university.service;

import com.example.university.dto.teacher.InsertTeacherDTO;
import com.example.university.dto.teacher.TeacherDTO;
import com.example.university.entity.Teacher;
import com.example.university.repository.TeacherRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * @author aleksandr on 28.11.2023
 * @projectName University
 */
@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository, ModelMapper modelMapper) {
        this.teacherRepository = teacherRepository;
        this.modelMapper = modelMapper;
    }

    public Teacher saveTeacher(InsertTeacherDTO insertTeacherDTO) {
        var teacher = modelMapper.map(insertTeacherDTO, Teacher.class);

        return teacherRepository.saveAndFlush(teacher);
    }

    public Optional<Teacher> getTeacherById(UUID teacherId) {
        return teacherRepository.findById(teacherId);
    }

    public TeacherDTO mapToDTO(Teacher teacher) {
        return modelMapper.map(teacher, TeacherDTO.class);
    }
}
