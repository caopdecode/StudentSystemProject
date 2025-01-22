/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.student;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Camilo Osorio Paez
 */
@Configuration
public class studentConfig {
    @Bean
    CommandLineRunner commandLineRunner(studentRepository repository){
        return args -> {
            student camilo = new student(
                    "Camilo Osorio Páez",
                    22,
                    301897653,
                    "camilo@gmail.com"
            );
            
            student mary = new student(
                    "Mary Rogers Smith",
                    24,
                    301997653,
                    "mery@gmail.com"
            );
            
            repository.saveAll(
                    List.of(camilo, mary)
            );
        };
    };
}
