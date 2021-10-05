package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->  {
            Student paul= new Student("paul","paul@ndb");
            Student john= new Student("john","john@ndb");
            Student eli= new Student("eli","eli@ndb");
            repository.saveAll(List.of(paul,john,eli));
        };

    }
}
