package com.ohgiraffers.section03.abstraction4;

public class Order {
    // 종류 옵션 수량
    private int price = 0; // how much
    private int count = 0; // how many
    private String size; // Tall or Grande or Venti
    private String temp; // Iced or Hot
    private String eat; // for here or take away

//    Menu menu = new Menu();

    int coffee1 = 3000; int coffee2 = 3000; int coffee3 = 3500;
//    private Menu menu;

    public void priceCoffee() {
        if (this.coffee1 == 3000) {
            System.out.println("You've chosen cuppa Espresso " + this.coffee1 + " KRW");
//            menu.coffeeMenu();
        } else if (this.coffee2 == 3000) {
            System.out.println("You've chosen cuppa Americano " + this.coffee2 + " KRW");
//            menu.coffeeMenu();
        } else if (this.coffee3 == 3500) {
            System.out.println("You've chosen cuppa Latte " + this.coffee3 + " KRW");
//            menu.coffeeMenu();
        } else {
            this.price += this.coffee1 + this.coffee2 + this.coffee3;
            System.out.println("The total price is: " + this.price + " KRW");
//            menu.coffeeMenu();
        }

    }
    public void priceNonCoffee() {}
    public void priceTea() {}
    public void priceDeserts() {}

    public void count() {
        this.count += 1;
        System.out.println("The count you've picked fow now is: " + count + "cup(s)");
    }
    //    public String getInfo () {
//        return
//    }

}
