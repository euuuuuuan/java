package com.ohgiraffers.section02.encapsulation.excercise.ex2;

public class App {

    public static void main(String[] args) {
        Book book = new Book();

        book.setWriter("Joshua Bloch");
        book.setName("Effective Java");
        book.setPage(416);
        book.setCover("Hard cover");

        System.out.println(book.getInfo());
    }
}
