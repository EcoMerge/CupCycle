package com.example.cupcycle.service;

import com.example.cupcycle.entity.Student;
import com.example.cupcycle.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student registerStudent(String name, String email) {
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        student.setTotalRewards(0); // 초기 보상 포인트 설정
        return studentRepository.save(student);
    }

    public boolean isEmailExists(String email) {
        return studentRepository.existsByEmail(email);
    }
}

