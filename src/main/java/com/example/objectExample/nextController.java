package com.example.objectExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class nextController {
    @Autowired StudentRepository repository;

    @RequestMapping("student/{id}")
    @ResponseBody
    Optional<Student> getStudent(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @RequestMapping("addStudent")
    @ResponseBody
    String addStudent(@RequestParam(value = "name",defaultValue = "Przemysław") String name, @RequestParam(value = "surname", defaultValue = "Stokłosa") String surname){
        Student student = new Student(name,surname);
        repository.save(student);

        return "Zapisano: "+student;
    }

    @RequestMapping("students")
    @ResponseBody
    Iterable<Student> getStudents(){
        return repository.findAll();
    }
}
