package com.example.university.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Data
public class InsertStudentDTO {
    private String firstName;
    private String lastName;
    private Date birthdate;
}
