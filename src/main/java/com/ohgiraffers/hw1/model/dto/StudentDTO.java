package com.ohgiraffers.hw1.model.dto;

public class StudentDTO extends PersonDTO {
    private int grade; // 학년
    private String major; // 전공

    public StudentDTO() {
    }

    public StudentDTO(String name, int age, double height, double weight, int grade, String major) {
        super(weight, height, age);
        super.name = name;
        this.grade = grade;
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String information() {
        return "";
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                super.toString() +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", grade=" + grade +
                '}';
    }
}
