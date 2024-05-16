package com.ohgiraffers.section01.method;

public class Application10 {
    public static void main(String[] args) {

        int num1 = 16;
        int num2 = 5;


        Calculator calc = new Calculator();

        // 더하기
        int plusNum = calc.plusNumber(num1, num2);
        System.out.println("두 수 더한 값 : " + plusNum);

        // 빼기
        int minusNum = calc.minusNumber(num1, num2);
        System.out.println("두 수 뺀 값 : " + minusNum);

        // 곱하기
        int multipleNum = calc.multipleNumber(num1, num2);
        System.out.println("두 수 곱한 값 : " + multipleNum);

        // 나누기
        int divideNum = calc.divideNumber(num1, num2);
        System.out.println("두 수 나눈 값 : " + divideNum);

        // 나머지 (static)
        int remainNum = Calculator.remainNumber(num1, num2);
        System.out.println("두 수 나머지 값 : " + remainNum);

    }
}
