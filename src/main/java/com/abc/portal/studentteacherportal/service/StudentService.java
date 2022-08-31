package com.abc.portal.studentteacherportal.service;

import com.abc.portal.studentteacherportal.dto.StudentDTO;

import java.text.ParseException;
import java.util.List;

public interface StudentService {
    List<StudentDTO> fetchStudentsList();
    String fetchStudentNameById(int studentId);
    String fetchStudentAgeById(int studentId) throws ParseException;
}
