package com.mani.example.productservices.systemdesign.BuilderDesignPattern.BasicVersion;

public class Builder {
    String name;
    String email;
    int age;
    String university;
    int yearOfGraduation;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}
