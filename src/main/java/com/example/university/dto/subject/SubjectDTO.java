package com.example.university.dto.subject;

import lombok.Data;

import java.util.UUID;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Data
public class SubjectDTO {
    private UUID id;
    private Integer note;
    private String name;
    private String description;
}
