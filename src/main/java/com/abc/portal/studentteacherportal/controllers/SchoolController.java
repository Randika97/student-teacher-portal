package com.abc.portal.studentteacherportal.controllers;

import com.abc.portal.studentteacherportal.dto.SchoolInfoDTO;
import com.abc.portal.studentteacherportal.dto.TeacherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {



    @GetMapping("/getSchoolInfo")
    public SchoolInfoDTO getSchoolInfo() {
        SchoolInfoDTO schoolInfoDTO = new SchoolInfoDTO();
        schoolInfoDTO.setName("School one");
        schoolInfoDTO.setAddress("Main road,Kalutara");
        schoolInfoDTO.setProvince("Western province");
        schoolInfoDTO.setEstablishOn("1950");
        return schoolInfoDTO;
    }
}
