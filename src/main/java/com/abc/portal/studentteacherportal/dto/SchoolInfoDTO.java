package com.abc.portal.studentteacherportal.dto;

public class SchoolInfoDTO {

    private String name;
    private String province;
    private String address;
    private String establishOn;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEstablishOn() {
        return establishOn;
    }

    public void setEstablishOn(String establishOn) {
        this.establishOn = establishOn;
    }
}
