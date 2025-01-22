/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.student;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Camilo Osorio Paez
 */
@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    
    private final studentService stService;
    
    @Autowired
    public StudentController(studentService stService){
        this.stService = stService;
    }
    
    @GetMapping
        public List<student> getStudent(){
            return stService.getStudent();
        }

    @PostMapping
    public void registerNewStudent(@RequestBody student newStudent){
        stService.addNewStudent(newStudent);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId){
        stService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email){
        stService.updateStudent(studentId, name, email);
    }
}
