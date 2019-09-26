package com.adulu.cat1.models.responses;

public class Match {
    private int id;
    private String name;
    private String gender;
    private String description;

    public Match() {}

    public Match(int id, String name, String gender, String description) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
