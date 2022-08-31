package com.abc.portal.studentteacherportal.service.Impl;


import com.abc.portal.studentteacherportal.dto.TeacherDTO;
import com.abc.portal.studentteacherportal.service.TeacherService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    TeacherDTO teacherDTO;
    @Override
    public List<TeacherDTO> fetchTeacherList() {
        return teacherList();
    }

    @Override
    public String fetchTeacherNameById(int teacherId) {
        for (TeacherDTO teacherDTO : teacherList()) {
            if (teacherDTO.getTeacherId()==teacherId) {
                return teacherDTO.getName();
            }
        }
        return "user is not registered in the system";
    }

    @Override
    public String fetchTeacherAgeById(int teacherId) throws ParseException {
        LocalDate curDate = LocalDate.now();
        String age = null;
        for (TeacherDTO teacherDTO :teacherList()) {
            if (teacherDTO.getTeacherId()==teacherId) {
                LocalDate lt = LocalDate.parse(teacherDTO.getDob());
                age = String.valueOf(Period.between(lt, curDate).getYears());
                return age;
            }
        }
        return "user is not registered or dob is missing";
    }

    @Bean
    public List<TeacherDTO> teacherList() {
        ArrayList<TeacherDTO> myArrayList=new ArrayList<TeacherDTO>();
        TeacherDTO teacher1=new TeacherDTO(001,"Teacher one","1987-09-07");
        TeacherDTO teacher2=new TeacherDTO(002,"Teacher two","1977-05-07");
        myArrayList.add(teacher1);
        myArrayList.add(teacher2);
        return myArrayList;
    }
}
