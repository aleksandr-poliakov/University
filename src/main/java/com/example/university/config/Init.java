package com.example.university.config;

import com.example.university.dto.subject.InsertSubjectDTO;
import com.example.university.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */

@Configuration
public class Init implements ApplicationRunner {

    private final SubjectService subjectService;

    @Autowired
    public Init(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<InsertSubjectDTO> insertSubjectDTOS = new ArrayList<>();
        insertSubjectDTOS.add(new InsertSubjectDTO(null, "Math", "Field of mathematics"));
        insertSubjectDTOS.add(new InsertSubjectDTO(null, "Physics", "Field of physics"));
        insertSubjectDTOS.add(new InsertSubjectDTO(null, "Psychology", "Field of psychology"));
        insertSubjectDTOS.add(new InsertSubjectDTO(null, "Geography", "Field of geography"));
        insertSubjectDTOS.add(new InsertSubjectDTO(null, "English", "Field of english"));
        insertSubjectDTOS.add(new InsertSubjectDTO(null, "German", "Field of german"));


        insertSubjectDTOS.forEach(subjectService::saveSubject);
    }
}
