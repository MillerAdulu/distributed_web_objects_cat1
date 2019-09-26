package com.adulu.cat1.models.requests;

public class RegisterStudentDTO {
    private String studentNumber;
    private String firstName;

    public RegisterStudentDTO() {}

    public RegisterStudentDTO(String studentNumber, String firstName) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
