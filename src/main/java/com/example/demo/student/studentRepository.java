/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 * @author Camilo Osorio Paez
 */
@Repository
public interface studentRepository extends JpaRepository<student, Long>{
    @Query("SELECT s FROM student s WHERE s.email = ?1")
    Optional<student> findStudentByEmail(String email);
}
