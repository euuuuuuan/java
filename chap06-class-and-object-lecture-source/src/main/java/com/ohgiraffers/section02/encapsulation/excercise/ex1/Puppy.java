package com.ohgiraffers.section02.encapsulation.excercise.ex1;

public class Puppy {

    private String name;
    private String breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getInfo() {
        return "강아지의 이름은 " + name + "이고, 나이는 " + age + "살이며, 종은 " + breed + "입니다.";
    }
}
