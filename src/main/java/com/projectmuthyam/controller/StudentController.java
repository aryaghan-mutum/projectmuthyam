package com.projectmuthyam.controller;

import com.projectmuthyam.pojo.Student;
import com.projectmuthyam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/examples/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Student> students() {
        System.out.println(studentService.getStudents());
        return studentService.getStudents();
    }

}
