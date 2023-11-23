package com.example.university.dto.student;

import com.example.university.dto.subject.SubjectDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Data
public class StudentDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private Date birthdate;
    private List<SubjectDTO> subjects;
}
