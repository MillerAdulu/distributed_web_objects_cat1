package com.adulu.cat1.models.responses;

public class RegisterStudentResponse {
    private String id;
    private String studentNumber;
    private String firstName;
    private int score;
    private String attachment;

    public RegisterStudentResponse() {}

    public RegisterStudentResponse(String id, String studentNumber, String firstName, int score) {
        this.id = id;
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Override
    public String toString() {
        return "RegisterStudentResponse{" +
                "id='" + id + '\'' +
                ", studentName='" + studentNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", score=" + score +
                ", attachment='" + attachment + '\'' +
                '}';
    }
}
