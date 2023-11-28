package com.example.university.dto.subject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertSubjectDTO {
    private Integer note;
    private String name;
    private String description;
}
