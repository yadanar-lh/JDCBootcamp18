package com.jdc;

public class Student {
    private String name;
    private String school;
    private int grade;

    public Student(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
