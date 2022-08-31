package com.abc.portal.studentteacherportal.controllers;

import com.abc.portal.studentteacherportal.dto.StudentDTO;
import com.abc.portal.studentteacherportal.dto.TeacherDTO;
import com.abc.portal.studentteacherportal.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @GetMapping("/getAllTeachers")
    public List<TeacherDTO> fetchTeacherList() {
        return teacherService.fetchTeacherList();
    }

    @GetMapping("/name")
    public String fetchTeacherNameById(@RequestBody TeacherDTO teacherDTO) {
        return teacherService.fetchTeacherNameById(teacherDTO.getTeacherId());
    }
    @GetMapping("/age")
    public String fetchTeacherAgeById(@RequestBody TeacherDTO teacherDTO) throws ParseException {
        return teacherService.fetchTeacherAgeById(teacherDTO.getTeacherId());
    }
}
