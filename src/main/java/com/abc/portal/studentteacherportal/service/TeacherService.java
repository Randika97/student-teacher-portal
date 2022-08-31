package com.abc.portal.studentteacherportal.service;

import com.abc.portal.studentteacherportal.dto.StudentDTO;
import com.abc.portal.studentteacherportal.dto.TeacherDTO;

import java.text.ParseException;
import java.util.List;

public interface TeacherService {
    List<TeacherDTO> fetchTeacherList();
    String fetchTeacherNameById(int teacherId);
    String fetchTeacherAgeById(int teacherId) throws ParseException;


}
