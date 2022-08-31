package com.abc.portal.studentteacherportal.controllers;

import com.abc.portal.studentteacherportal.dto.StudentDTO;
import com.abc.portal.studentteacherportal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/get-students")
    public List<StudentDTO> fetchStudentList() {
      return studentService.fetchStudentsList();
    }
    @GetMapping("/name")
    public String fetchStudentName(@RequestBody StudentDTO studentDTO) {
        return studentService.fetchStudentNameById(studentDTO.getStudentId());
    }
    @GetMapping("/age")
    public String fetchStudentAge(@RequestBody StudentDTO studentDTO) throws ParseException {
        return studentService.fetchStudentAgeById(studentDTO.getStudentId());
    }

}
