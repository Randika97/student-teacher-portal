package com.abc.portal.studentteacherportal.service.Impl;

import com.abc.portal.studentteacherportal.dto.StudentDTO;
import com.abc.portal.studentteacherportal.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    StudentDTO studentDTO;

    @Override
    public List<StudentDTO> fetchStudentsList() {
        return studentList();
    }

    @Override
    public String fetchStudentNameById(int studentId) {
        for (StudentDTO studentDTO : studentList()) {
            if (studentDTO.getStudentId()==studentId) {
                return studentDTO.getName();
            }
        }
        return "user is not registered in the system";
    }

    @Override
    public String fetchStudentAgeById( int studentId) throws ParseException {
        LocalDate curDate = LocalDate.now();
        String age = null;
        for (StudentDTO studentDTO : studentList()) {
            if (studentDTO.getStudentId()==studentId) {
                LocalDate lt = LocalDate.parse(studentDTO.getDob());
                age = String.valueOf(Period.between(lt, curDate).getYears());
                return age;
            }
        }
        return "user is not registered or dob is missing";
    }
    @Bean
    public List<StudentDTO> studentList() {
        ArrayList<StudentDTO> myArrayList=new ArrayList<StudentDTO>();
        StudentDTO student=new StudentDTO(001,"Student one","1997-07-07");
        StudentDTO student2=new StudentDTO(002,"Student two","1999-07-07");
        myArrayList.add(student);
        myArrayList.add(student2);
        return myArrayList;
    }
}
