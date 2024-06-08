package com.ohgiraffers.section01.intro;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Addition addition = (x, y) -> x + y;
        System.out.println("20과 10의 더하기 : " + addition.addTwoNumbers(20, 10));

        OuterCalculator.Subtraction subtraction = (x, y) -> x - y;
        System.out.println("110과 10의 빼기 : " + subtraction.subtractTwoNumbers(110, 10));

        OuterCalculator.Multiplication multiplication = (x, y) -> x * y;
        System.out.println("10과 30의 곱하기 : " + multiplication.multiplyTwoNumbers(10, 30));

        OuterCalculator.Division division = (x, y) -> x / y;
        System.out.println("20과 10의 나누기 : " + division.divideTwoNumbers(20, 10));
    }
}
