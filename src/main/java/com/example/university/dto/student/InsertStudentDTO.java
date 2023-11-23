package com.example.university.dto.student;

import com.example.university.dto.subject.InsertSubjectDTO;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Data
public class InsertStudentDTO {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private List<InsertSubjectDTO> subjects;
}
