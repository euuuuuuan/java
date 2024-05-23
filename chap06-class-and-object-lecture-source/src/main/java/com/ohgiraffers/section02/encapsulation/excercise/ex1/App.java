package com.ohgiraffers.section02.encapsulation.excercise.ex1;

public class App {

    public static void main(String[] args) {
        Puppy puppy = new Puppy();

        puppy.setName("Max");
        puppy.setAge(5);
        puppy.setBreed("골든 리트리버");

        System.out.println(puppy.getInfo());
    }
}
