package com.example.jdbc_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student added successfully!";
    }

    // Test için:
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

}
