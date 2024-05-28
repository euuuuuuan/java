package com.ohgiraffers.section04.use3;

public class Application {
    public static void main(String[] args) {

        Dice dice = new HellDice(); // SuperDice로 변경해도 작동하게 만들기

        Dicer dicer = new Dicer();

        dicer.throwDice(dice);

    }
}
