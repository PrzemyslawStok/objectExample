package com.example.objectExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class nextController {
    @Autowired StudentRepository repository;

    @RequestMapping("student/{id}")
    @ResponseBody
    Student getStudent(){
        return new Student("Przemysław","Stokłosa");
    }
}
