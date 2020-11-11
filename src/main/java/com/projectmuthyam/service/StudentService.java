package com.projectmuthyam.service;

import com.projectmuthyam.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents() {
        List<Student> studentsList = new ArrayList<>();
        studentRepository.findAll().forEach(student -> studentsList.add(student));
        return studentsList;
    }
}
