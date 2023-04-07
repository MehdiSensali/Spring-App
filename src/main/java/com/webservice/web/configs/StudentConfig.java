package com.webservice.web.configs;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.webservice.web.entities.Student;
import com.webservice.web.repositories.StudentRepository;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Mehdi = new Student("Mehdi", "sensalimehdi@gmail.com", LocalDate.of(1999, 7, 14));
            Student Anass = new Student("An ass", "amixaninja@gmail.com", LocalDate.of(1999, 10, 31));
            repository.saveAll(List.of(Mehdi, Anass));
        };
    }
  
}
