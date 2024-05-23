package com.ohgiraffers.section03.abstraction3;

public class Laptop {

    private boolean power;
    private int boost;

    public void turnOn() {
        if (power) {
            System.out.println("Laptop is already on");
        } else {
            this.power = true;
            System.out.println("Laptop is on");
        }
    }

    public void boostUp() {
        if (power) {
            System.out.println("Booster is on");
            boost += 100;
            System.out.println("Laptop performance is " + boost + " high now");
            if(boost >= 400) {
                System.out.println("Warning : performance is " + boost + " high now"); // this를 안쓸 때와
                System.out.println("Booster is maximum now.");
                boost -= 100;
            }
        } else {
            System.out.println("Laptop is off. Please turn on your laptop first");
        }
    }
    public void boostDown() {
        if(power) {
            System.out.println("Slowing down your booster");
            if (this.boost > 0) {
                this.boost = 0; // this를 쓸 때의 차이는?
                System.out.println("Turning off booster...Please wait");
            } else {
                System.out.println("Booster is already off");
            }
        } else {
            System.out.println("Laptop is off. Please turn on your laptop first");
        }
    }

    public void turnOff() {
        if(power) {
            if (boost > 0) {
                System.out.println("Please turn off your booster first");
            } else {
                this.power = false;
                System.out.println("Turning off system... Please, turn on if you want to use your system again");
            }

        } else {
            System.out.println("Laptop is off. Please turn on your laptop first");
        }
    }

}
