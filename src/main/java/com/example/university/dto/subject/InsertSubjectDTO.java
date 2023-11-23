package com.example.university.dto.subject;

import lombok.Data;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Data
public class InsertSubjectDTO {
    private Integer note;
    private String name;
    private String description;
}
