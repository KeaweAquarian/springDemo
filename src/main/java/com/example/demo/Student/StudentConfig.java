package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(
                    "Mar",
                    "skdfj@gmail.com",
                    LocalDate.of(2000, APRIL, 5),
                    21
            );
            Student alik = new Student(
                    "al",
                    "sdfdsdfj@gmail.com",
                    LocalDate.of(2700, JANUARY, 5),
                    21
            );
            repository.saveAll(
                    List.of(mariam, alik )
            );
        };
    }
}
