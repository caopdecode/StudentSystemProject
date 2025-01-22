/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.student;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Camilo Osorio Paez
 */
@Service
public class studentService {
    private final studentRepository stRepository;
    
    
    @Autowired
    public studentService (studentRepository stRepository){
        this.stRepository = stRepository;
    }
    public List<student> getStudent(){
            return stRepository.findAll();
        }

    public void addNewStudent(student newStudent) {
        Optional<student> studentOptional = stRepository.findStudentByEmail(newStudent.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("email taken");
        }
        stRepository.save(newStudent);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = stRepository.existsById(studentId);
        if(!exists){
            throw new IllegalStateException("The student with id: " + studentId + " doesn't exists");
        }
        stRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        student student = stRepository.findById(studentId)
                .orElseThrow(()-> new IllegalStateException("Student with id: " + studentId + " doesn't exists"));

        if(name != null && name.length()>0 && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }

        if(email != null && email.length()>0 && !Objects.equals(student.getEmail(), email)){
            Optional<student> studentOptional = stRepository.findStudentByEmail(email);
            if(studentOptional.isPresent()){
                throw new IllegalStateException("email taken");
            }
            student.setEmail(email);
        }

    }
}
