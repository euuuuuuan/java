package com.ohgiraffers.section02.encapsulation.excercise.ex1;

public class App {

    public static void main(String[] args) {
        Puppy puppy = new Puppy(); // 인스턴스. puppy라는 객체

        puppy.setName("Max");
        puppy.setAge(5);
        puppy.setBreed("골든 리트리버");

        System.out.println(puppy.getInfo());

        Puppy dog1 = new Puppy();

        dog1.setName("구찌");
        dog1.setAge(11);
        dog1.setBreed("푸들");

        System.out.println(dog1.getInfo());
    }
}
