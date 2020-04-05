package com.example.objectExample;

public class Student {
    String name;
    String surname;

    public Student(){
    }

    Student(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
}
