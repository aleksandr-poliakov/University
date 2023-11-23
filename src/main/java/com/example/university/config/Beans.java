package com.example.university.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author aleksandr on 23.11.2023
 * @projectName University
 */
@Component
public class Beans {

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
