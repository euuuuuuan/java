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
            if(boost <= 300) {
                System.out.println("Booster is on");
                boost += 100;
                System.out.println("Laptop performance is " + boost + " high now");
            }
            if(boost == 400){
                System.out.println(boost + "boost now");
            }
            if(boost > 400) {
//                boost -= 100;
                System.out.println("Warning : performance is " + boost + " high now");
                System.out.println("Booster is maximum now.");

            }
        } else {
            System.out.println("Laptop is off. Please turn on your laptop first");
        }
    }
    public void boostDown() {
        if(power) {
            System.out.println("Slowing down your booster");
            boost -= 100;
            System.out.println("Laptop performance is " + boost + " now");
            if (this.boost > 0) {
//                this.boost = 0;
                System.out.println("Slowing down booster...");

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
