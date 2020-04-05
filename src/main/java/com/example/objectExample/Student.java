package com.example.objectExample;

import lombok.Data;

@Data
public class Student {
    String name;
    String surname;

    Integer id;

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
}
