package com.ohgiraffers.section02.encapsulation.excercise.ex1;

public class Puppy {

    private String name;
    private String breed;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age); // 절대값
        }
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getInfo() {
        return "강아지의 이름은 " + this.name + "이고, 나이는 " + age + "살이며, 종은 " + breed + "입니다.";
    }
}
