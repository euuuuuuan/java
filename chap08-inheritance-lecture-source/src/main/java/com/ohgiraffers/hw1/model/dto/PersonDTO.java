package com.ohgiraffers.hw1.model.dto;

public class PersonDTO {
    protected String name;
    private int age;
    private double height;
    private double weight;

    public PersonDTO() {}

    public PersonDTO(double weight, double height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDTO" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight;
    }
}
