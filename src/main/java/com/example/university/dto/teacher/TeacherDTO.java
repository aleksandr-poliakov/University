package com.example.university.dto.teacher;

import com.example.university.dto.subject.SubjectDTO;
import lombok.Data;

import java.util.List;
import java.util.UUID;

/**
 * @author aleksandr on 28.11.2023
 * @projectName University
 */
@Data
public class TeacherDTO {
    private UUID id;
    private String name;
    private List<SubjectDTO> subjects;
}
