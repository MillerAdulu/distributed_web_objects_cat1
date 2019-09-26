package com.adulu.cat1.models.requests;

public class RejectMatchDTO {

    private int studentId;
    private String reason;

    public RejectMatchDTO() {}

    public RejectMatchDTO(int studentId, String reason) {
        this.studentId = studentId;
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
