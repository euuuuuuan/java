package com.ohgiraffers.section07.practice;

public class Application1 {
    public static void main(String[] args) {

        //산술연산자
        //1.
        int a = 15, b = 4;
        System.out.println("변수 a와 b의 나누기 결과값 : " + (a / b)); //3
        //2.
        int num3 = 8, num4 = 3;
        System.out.println("8과 3의 나머지 연산 결과값 : " + (num3 % num4)); //2
        //3.
        int num5 = 5, num6 = 2, num7 = 3;
        System.out.println("5 * 2 - 3의 결과값 : " + (num5 * num6 - num7)); //7

        System.out.println();

        //복합 대입 연산자
        int x = 10, y = 20, z = 8;
        //1.
        System.out.println("x=10이다. x += 5의 결과갑 : " + (x += 5)); //15
        //2.
        System.out.println("y=20이다. y /= 4의 결과갑 : " + (y /= 4)); //5
        //3.
        System.out.println("z=8이다. z %= 3의 결과갑 : " + (z %= 3)); //2

        System.out.println();

        //증감 연산자
        int i = 0, j = 10, k = 5;
        //1.
        System.out.println("i=0이다. i++ 후의 i 출력값 : " + i++); //0
        //2.
        System.out.println("j=10이다. -j의 출력값 : " + -j); //-10
        //3
        System.out.println("k=5이다. k값 증가후 증가된 값 출력 : " + ++k); //6

        System.out.println();

        //비교 연산자
        int num1 = 10, num2 = 20, age = 20;
        //1.
        System.out.println("num1과 num2가 같은지 비교 : " + (num1 == num2)); //false
        //2.
        System.out.println("10이 15보다 큰지 확인 : " + (10 > 15)); //false
        //3.
        System.out.println("age가 18이상인지 확인 : " + (age>18)); //false

        System.out.println();

        //논리 연산자
        boolean a1 = true, b1 = false;
        //1.
        System.out.println("a1와 b1가 둘 다 참이어야 참을 반환하는 조건문은 a!=b이다. : " + (a!=b)); //true
        //2.
        System.out.println("age가 18이상이고 65미만인지 확인 : " + (age>=18 && age<65)); //true
        //3.
        System.out.println("x가 10이 아니거나 y가 25 이상인지 확인 : " + (x!=10 || y>25)); //true
    }
}
