package com.example.objectExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class nextController {
    @Autowired StudentRepository repository;

    @RequestMapping("student/{id}")
    @ResponseBody
    Student getStudent(){
        return new Student("Przemysław","Stokłosa");
    }

    @RequestMapping("addStudent")
    @ResponseBody
    String addStudent(@RequestParam(value = "name",defaultValue = "Przemysław") String name, @RequestParam(value = "surname", defaultValue = "Stokłosa") String surname){
        Student student = new Student(name,surname);
        repository.save(student);

        return "Zapisano studenta";
    }

    @RequestMapping("students")
    @ResponseBody
    Iterable<Student> getStudents(){
        return repository.findAll();
    }
}
