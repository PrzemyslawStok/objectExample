package com.example.objectExample;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Student {
    String name;
    String surname;

    @Id
    @GeneratedValue
    private Integer id;

    public Student(){
    }

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
