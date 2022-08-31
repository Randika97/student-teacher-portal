package com.abc.portal.studentteacherportal.dto;

public class TeacherDTO {
    private int teacherId;
    private String Name;
    private String dob;

    public TeacherDTO(int teacherId, String name, String dob) {
        this.teacherId = teacherId;
        Name = name;
        this.dob = dob;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
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
