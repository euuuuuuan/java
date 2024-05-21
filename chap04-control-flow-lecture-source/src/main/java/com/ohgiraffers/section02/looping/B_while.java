package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_while {

    /*
    * [while 문 표현식]
    *
    * [초기식]
    *
    * while([조건식]) {
    *
    *   조건을 만족하는 경우 수행할 구문(반복될 코드)
    *   [증감식]
    * }
    * */

    public void testSimpleWhileStatement() {
        // 1부터 10까지 1씩 증가시키면서 i 값을 출력하는 기본 반복문
        /*
        int i = 1;
        while (i <= 10) {
            System.out.println(i);

            i++;
        }*/
        int i = 10;
        while (i >= 1) {
            System.out.println(i);

            i--;
        }
    }

    public void testWhileExample1() {

        // 입력한 문자열의 인덱스를 이용해서 문자 하나씩 출력해보기
        /*
        * charAt() : 문자열에서 인덱스에 해당하는 문자를 char형으로 반환하는 기능
        * lenghth() : String 클래스의 메소드로 문자열의 길이를 int형으로 반환한다.
        *
        * index : 0부터 시작하고, 마지막 인덱스는 항상 길이보다 한개 작은 숫자를 가진다.
        * 만약에 존재하지 않는 인덱스에 접근하게 되면
        * StringIndexOutOfBoundsException이 발생한다.
        *
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력 : ");


        String str = sc.nextLine();

        System.out.println("=============== for 문 ===============");
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }

        System.out.println("=============== while 문 ===============");
        int i = 0;
        // int index = 0;

        while (i < str.length()) {

            char ch = str.charAt(i);
            System.out.println(i + " : " + ch);

            i++;
            // index++;
        }

    }

    public void testWhileExample2() {

        /*
        * 정수 하나를 입력받아 1부터 입력받은 정수까지의 합계를 구한다.
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나를 입력해 주세요 : ");
        int num = sc.nextInt();

        int i = 1; // 1부터 시작
        int total = 0;

        while(i <= num) {
            total += i;

            i++;
        }
        System.out.println("1부터 입력 받은 정수 " + num + "까지의 합은 " + total + "입니다.");
    }

    // 중첩 while
    public void testWhileExample3() {
        /*
        * 중첩 while을 이용해 구구단 출력하기
        * */
        int dan = 0;
        while (dan < 10) {
            System.out.println(dan + "단");

            int su = 1;
            // su가 1~9까지 반복
            while(su < 10) {
                System.out.println(dan + " * " + su + " = " + (dan * su));

                su++;

            }
            System.out.println();
            dan++;
        }
    }
}