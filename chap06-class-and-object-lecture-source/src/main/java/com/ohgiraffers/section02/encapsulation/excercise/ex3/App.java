package com.ohgiraffers.section02.encapsulation.excercise.ex3;

public class App {
    public static void main(String[] args) {
        Car car = new Car();

//        System.out.println(car.model); //private가 붙어서 선언 불가
        System.out.println(car.year); //private가 안붙어서 선언 가능

        car.setModel("Tesla Model S");
        car.year(2022);
        car.engineType("Electronic Engine");

        System.out.println(car.getInfo());

    }
}
