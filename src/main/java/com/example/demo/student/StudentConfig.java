package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student miles = new Student(
                    "Miles",
                    "miles@gmail.com",
                    LocalDate.of(2000, Month.MAY, 31)
            );

            Student axl = new Student(
                    "Axl",
                    "axl@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 1)
            );

            repository.saveAll(
                    List.of(miles, axl)
            );
        };
    }
}
