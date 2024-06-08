package com.ohgiraffers.section02.encapsulation.excercise.ex4;

public class Profile {

    private int age;
    private String name;
    private String married;
    protected int kids;

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarried(String married) {
        this.married = married;
    }
    public void setKids(int kids) {
        this.kids = kids;
    }

    public String getProfile() {
        return "나이가 " + age + "이고, 이름이 "
                + name + "인 남자가 있습니다. 이 남자는"
                + married + "을 했고, 자식이 " + kids + " 있습니다.";
    }



}
