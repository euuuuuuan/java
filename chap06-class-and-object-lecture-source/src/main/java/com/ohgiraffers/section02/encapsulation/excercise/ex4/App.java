package com.ohgiraffers.section02.encapsulation.excercise.ex4;

public class App {
    public static void main(String[] args) {

        Profile profile = new Profile();

        profile.setAge(30);
        profile.setName("James");
        profile.setMarried("결혼");
        profile.setKids(3);
        System.out.println(profile.getProfile());
    }
}
