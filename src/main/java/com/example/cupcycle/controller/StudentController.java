package com.example.cupcycle.controller;

import com.example.cupcycle.entity.Student;
import com.example.cupcycle.service.ApiResponse;
import com.example.cupcycle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<String>> registerStudent(
            @RequestParam String name,
            @RequestParam String email) {

        if (studentService.isEmailExists(email)) {
            ApiResponse<String> response = new ApiResponse<>(false, 4001, "이미 등록된 이메일입니다.");
            return ResponseEntity.badRequest().body(response);
        }

        studentService.registerStudent(name, email);
        ApiResponse<String> response = new ApiResponse<>(true, 1000, "회원가입이 완료되었습니다.");
        return ResponseEntity.ok(response);
    }

}
