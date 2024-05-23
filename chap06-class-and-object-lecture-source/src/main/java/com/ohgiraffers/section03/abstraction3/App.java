package com.ohgiraffers.section03.abstraction3;

import com.ohgiraffers.section02.encapsulation.excercise.ex4.Profile;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {


        User user = new User();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("========= Laptop Configuration Setting Simulator =========");
            System.out.println("1. Turn on the laptop");
            System.out.println("2. Boosting up the laptop");
            System.out.println("3. Boosting down the laptop");
            System.out.println("4. Turn off your laptop");
            System.out.println("0. Close your laptop");
            System.out.print("Select your option: ");

            int num = scan.nextInt();

            switch (num) {
                case 1:
                    user.turnOn();
                    break;
                case 2:
                    user.boostUp();
                    break;
                case 3:
                    user.boostDown();
                    break;
                case 4:
                    user.turnOff();
                    break;
                case 0:
                    System.out.println("Closed");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            if (num == 0) {
                break;
            }
        }
    }

}