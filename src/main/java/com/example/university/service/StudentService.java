package com.example.university.service;

import com.example.university.dto.InsertStudentDTO;
import com.example.university.dto.StudentDTO;
import com.example.university.entity.Student;
import com.example.university.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    // CREATE, READ, UPDATE, DELETE

    public Student saveStudent(InsertStudentDTO insertStudentDTO) {
        var student = modelMapper.map(insertStudentDTO, Student.class);
        return studentRepository.save(student);
    }

    public StudentDTO mapToDTO(Student student) {
        return modelMapper.map(student, StudentDTO.class);
    }
}
