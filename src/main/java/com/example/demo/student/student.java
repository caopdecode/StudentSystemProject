/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Camilo Osorio Paez
 */
@Entity
@Table
public class student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long id;
    private String name;
    private int age;
    private long numContact;
    private String email;
    
    public student(){
        
    }

    public student(long id, String name, int age, long numContact, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.numContact = numContact;
        this.email = email;
    }

    public student(String name, int age, long numContact, String email) {
        this.name = name;
        this.age = age;
        this.numContact = numContact;
        this.email = email;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getNumContact() {
        return numContact;
    }

    public void setNumContact(long numContact) {
        this.numContact = numContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + 
                ", name=" + name + 
                ", age=" + age + 
                ", numContact=" + numContact + 
                ", email=" + email + '}';
    }
    
    
    
    
}
