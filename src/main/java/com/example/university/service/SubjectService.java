package com.example.university.service;

import com.example.university.dto.subject.InsertSubjectDTO;
import com.example.university.entity.Subject;
import com.example.university.repository.SubjectRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aleksandr on 28.11.2023
 * @projectName University
 */

@Service
public class SubjectService {

    private SubjectRepository subjectRepository;
    private ModelMapper modelMapper;

    @Autowired
    public SubjectService(SubjectRepository subjectRepository, ModelMapper modelMapper) {
        this.subjectRepository = subjectRepository;
        this.modelMapper = modelMapper;
    }

    public void saveSubject(InsertSubjectDTO insertSubjectDTO) {
        var subject = modelMapper.map(insertSubjectDTO, Subject.class);

        var optionalSubject = subjectRepository.getByName(subject.getName());
        if (optionalSubject.isPresent()) {
            return;
        }

        subjectRepository.saveAndFlush(subject);
    }
}
