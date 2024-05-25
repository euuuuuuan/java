package com.ohgiraffers.section03.abstraction4;

import java.util.Scanner;

public class Menu {

    Scanner scan = new Scanner(System.in);
    User user = new User();
    Order order = new Order();

    public void firstScreen() {

        System.out.println("========== Welcome to EuanBottle ==========");
        System.out.println("1) Menu");
        System.out.println("2) Order");
        System.out.println("0) Exit");
        System.out.println("===========================================");
        System.out.print("Please enter the number you want : ");

        int option = scan.nextInt();
        switch (option) {
            case 1:
                System.out.println("Please enter the number you are interested in down below");
                System.out.println("========== Euanbottle menu ==========");
                showingMenu();
                System.out.println("=====================================");
                break;
            case 0:
                System.out.println("Thanks for visit! Hava a good day! :)");
                break;
            default:
                firstScreen();
                System.out.println("Please enter a valid option");
                System.out.println();
                break;
        }
    }

    public void showingMenu() {
        System.out.println("1) Coffee");
        System.out.println("2) Non-Coffee");
        System.out.println("3) Tea");
        System.out.println("4) Deserts");
        System.out.println("0) Back to main menu");
        System.out.print("Enter your choice: ");
        int option = scan.nextInt();

        switch (option) {
            case 0:
                firstScreen();
                break;
            case 1:
                coffeeMenu();
                break;
            case 2:
                nonCoffeeMenu();
                break;
            case 3:
                teaMenu();
                break;
            case 4:
                desertsMenu();
                break;
            default:
                showingMenu();
                System.out.println("Invalid choice");
                break;
        }
    }

    public void coffeeMenu() {
        System.out.println("========== Coffee ==========");
        System.out.println("1) Espresso \t 3000 KRW");
        System.out.println("2) Americano \t 3000 KRW");
        System.out.println("3) Latte     \t 3500 KRW");
        System.out.println("4) Coldbrew \t 3500 KRW");
        System.out.println("5) Cappuccino \t 4000 KRW");
        System.out.println("6) Flatwhite \t 4000 KRW");
        System.out.println("7) Macchiato \t 4000 KRW");

        System.out.println("8) Previous");
        System.out.println("9) Next");
        System.out.println("0) Exit");
        System.out.println("============================");
        System.out.print("Enter your choice: ");
        int option = scan.nextInt();

        switch (option) {
            case 0:
                showingMenu();
                break;
            case 8:
                desertsMenu();
                break;
            case 9:
                nonCoffeeMenu();
                break;
            default:
                coffeeMenu();
                System.out.println("Invalid choice");
                break;
        }

    }

    public void nonCoffeeMenu() {
        System.out.println("========== Non-Coffee ==========");
        System.out.println("1) Hot Chocolate \t 4000 KRW");
        System.out.println("2) Milkshake \t 5000 KRW");
        System.out.println("3) Smoothie \t 5500 KRW");
        System.out.println("4) Lemonade \t 5500 KRW");

        System.out.println("8) Previous");
        System.out.println("9) Next");
        System.out.println("0) Exit");
        System.out.println("================================");
        System.out.print("Enter your choice: ");
        int option = scan.nextInt();

        switch (option) {
            case 0:
                showingMenu();
                break;
            case 8:
                coffeeMenu();
                break;
            case 9:
                teaMenu();
                break;
            default:
                nonCoffeeMenu();
                System.out.println("Invalid choice");
                break;
        }


    }

    public void teaMenu() {
        System.out.println("========== Tea ==========");
        System.out.println("1) Apple Tea \t 4500 KRW");
        System.out.println("2) Mango Tea \t 5000 KRW");
        System.out.println("3) Jasmine Tea \t 4500 KRW");
        System.out.println("4) Green Tea \t 5500 KRW");
        System.out.println("5) Mint Tea \t 6000 KRW");

        System.out.println("8) Previous");
        System.out.println("9) Next");
        System.out.println("0) Exit");
        System.out.println("=========================");
        System.out.print("Enter your choice: ");
        int option = scan.nextInt();

        switch (option) {
            case 0:
                showingMenu();
                break;
            case 8:
                nonCoffeeMenu();
                break;
            case 9:
                desertsMenu();
                break;
            default:
                teaMenu();
                System.out.println("Invalid choice");
                break;
        }
    }

    public void desertsMenu() {
        System.out.println("========== Deserts ==========");
        System.out.println("1) Chocolate Waffle \t 6000 KRW");
        System.out.println("2) Strawberry Cake \t 5000 KRW");
        System.out.println("3) Mango Muffin \t 4500 KRW");
        System.out.println("4) Fish Bread \t 4000 KRW");

        System.out.println("8) Previous");
        System.out.println("9) Next");
        System.out.println("0) Exit");
        System.out.println("=============================");
        System.out.print("Enter your choice: ");
        int option = scan.nextInt();

        switch (option) {
            case 0:
                showingMenu();
                break;
            case 8:
                teaMenu();
                break;
            case 9:
                coffeeMenu();
                break;
            default:
                desertsMenu();
                System.out.println("Invalid choice");
                break;
        }
    }
}
