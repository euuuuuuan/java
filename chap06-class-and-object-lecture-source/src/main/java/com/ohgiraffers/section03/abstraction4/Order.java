package com.ohgiraffers.section03.abstraction4;

public class Order {
    // 종류 옵션 수량
    private int price = 0; // how much
    private int count = 0; // how many
    private String size; // Tall or Grande or Venti
    private String temp; // Iced or Hot
    private String eat; // for here or take away

    public void price() {
        if (price == 3000) {
            this.price += price;
            System.out.println("The price is: $" + price);
        }
        else if (price == 3500) {
            this.price += price;
            System.out.println("The price is: $" + price);
        }
        else if (price == 4000) {
            this.price += price;
            System.out.println("The price is: $" + price);
        }
        else if (price == 4500) {
            this.price += price;
            System.out.println("The price is: $" + price);
        }
        else if (price == 5000) {
            this.price += price;
            System.out.println("The price is: $" + price);
        }
        else if (price == 5500) {
            this.price += price;
            System.out.println("The price is: $" + price);
        }
        else if (price == 6000) {
            this.price += price;
            System.out.println("The price is: $" + price);
        } else if (price > 6000) {
            this.price += price;
            System.out.println("The total price is: $" + price);
        } else {
            System.out.println("Error");
        }
    }
    public void count() {
        this.count += 1;
        System.out.println("The count you've picked fow now is: " + count);
    }

    //    public String getInfo () {
//        return
//    }

}
