package com.ohgiraffers.section03.abstraction3;

public class User {

    private Laptop laptop = new Laptop();

    public void turnOn() {
        laptop.turnOn();
    }

    public void boostUp() {
        laptop.boostUp();
    }

    public void boostDown() {
        laptop.boostDown();
    }

    public void turnOff() {
        laptop.turnOff();
    }
}
