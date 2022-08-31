package com.abc.portal.studentteacherportal.dto;

public class StudentDTO {
    private int studentId;
    private String Name;
    private String dob;

    public StudentDTO(int studentId, String name, String dob) {

        this.studentId = studentId;
        Name = name;
        this.dob = dob;
    }
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
