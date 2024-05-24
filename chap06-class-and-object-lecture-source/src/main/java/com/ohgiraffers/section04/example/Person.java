package com.ohgiraffers.section04.example;

public class Person {

    private String name;
    private int age;
    private String breed;

    public Person(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getInfo() {
        return "이름이 " + this.name + "이고, " + this.age + "살이며, " + breed + "종인 강아지입니다.";
    }
}
