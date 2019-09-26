package com.adulu.cat1.models.requests;

public class MatchDTO {
    private String gender;
    private Long studentId;

    public MatchDTO() {}

    public MatchDTO(String gender, Long studentId) {
        this.gender = gender;
        this.studentId = studentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }
}
