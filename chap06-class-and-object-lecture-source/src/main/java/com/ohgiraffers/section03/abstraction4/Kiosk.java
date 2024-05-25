package com.ohgiraffers.section03.abstraction4;

public class Kiosk {
/*           - 키오스크 :
 *       메뉴를 제공해줘
 *           사용자 선택에 따라 주문을 생성해라
 *           생성된 주문을 사용자에게 확인하라
 *           주문을 바라스타에게 전달해라*/

    public void showingMenu() {
        System.out.println("Welcome to Euanbottle!");
        System.out.println("Plase put the number you are interested in down below");
        System.out.println("========== Euanbottle menu ==========");
        System.out.println("1) Coffee");
        System.out.println("2) Non-Coffee");
        System.out.println("3) Tea");
        System.out.println("4) Deserts");
    }

    public void coffee() {
        System.out.println("========== 1) Coffee ==========");
        System.out.println("Espresso");
        System.out.println("Americano");
        System.out.println("Latte");
        System.out.println("Coldbrew");
        System.out.println("Cappuccino");
        System.out.println("Flatwhite");
        System.out.println("Macchiato");
    }
    public void nonCoffee() {
        System.out.println("========== 2) Non-Coffee ==========");
        System.out.println("Hot Chocolate");
        System.out.println("Milkshake");
        System.out.println("Smoothie");
        System.out.println("Lemonade");
    }
    public void tea() {
        System.out.println("========== 3) Tea ==========");
        System.out.println("Apple Tea");
        System.out.println("Mango Tea");
        System.out.println("Jasmine Tea");
        System.out.println("Green Tea");
        System.out.println("Mint Tea");

    }
    public void deserts() {
        System.out.println("========== 4) Deserts ==========");
        System.out.println("Chocolate Waffle");
        System.out.println("Strawberry Cake");
        System.out.println("Mango Muffin");
        System.out.println("Fish Bread");
    }

    public void receivingOrder() {}

    public void confirmOrder() {}

    public void deliveringOrder() {}


}
