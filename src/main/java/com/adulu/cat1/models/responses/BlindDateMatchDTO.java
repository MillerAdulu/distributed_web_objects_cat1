package com.adulu.cat1.models.responses;

public class BlindDateMatchDTO {
    private int id;
    private RegisterStudentResponse student;
    private  Match match;
    private String requested;
    private String reason;

    public BlindDateMatchDTO() {}

    public BlindDateMatchDTO(int id, RegisterStudentResponse student, Match match, String requested, String reason) {
        this.id = id;
        this.student = student;
        this.match = match;
        this.requested = requested;
        this.reason = reason;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RegisterStudentResponse getStudent() {
        return student;
    }

    public void setStudent(RegisterStudentResponse student) {
        this.student = student;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public String getRequested() {
        return requested;
    }

    public void setRequested(String requested) {
        this.requested = requested;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "BlindDateMatchDTO{" +
                "id=" + id +
                ", student=" + student +
                ", match=" + match +
                ", requested='" + requested + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
