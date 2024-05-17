package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_IfElse {

    /*
    * [if-else 문 표현식]
    *
    * if([조건식]) {
    *   // 조건식이 True 일 경우 실행할 명령문
    * } else {
    *   // 조건식이 False 일 경우 실행할 명령문
    * }
    *
    * if문은 조건식의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
    * 조건식의 결과 값이 거짓(false)이면 else { } 안에 있는 코드를 실행한다.
    * */

    public void testSimpleIfElseStatement(){
        // 정수 한 개를 입력받아
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 하나 입력하세요. : ");
        int num = sc.nextInt();

        // 그 수가 홀수이면 "입력하신 숫자는 홀수입니다."라고 출력하고,
        if(num % 2 == 1) {

            System.out.println("입력하신 숫자는 홀수입니다.");
        } else {
            // 홀수가 아니면 "입력하신 숫자는 짝수입니다."라고 출력하는 코드를 작성해보자.
            System.out.println("입력하신 숫자는 짝수입니다.");
        }

        // 단, 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다."라고 출력되도록 해보자.
        System.out.println("프로그램을 종료합니다.");
    }

    // 중첩된 if-else 문 실행 흐름 확인
    public void testNestedIfElseStatement(){

        // 숫자를 하나 입력받아
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        // 양수이면 "입력하신 숫자는 양수입니다." 출력하고
        if(num != 0){
        if(num > 0){
            System.out.println("입력하신 숫자는 양수입니다.");
        }
         else {
            // 음수이면 "입력하신 숫자는 음수입니다." 출력하고
            System.out.println("입력하신 숫자는 음수입니다.");
        }
        } else {
            // 단, 0이면 "0 입니다." 라고 출력하세요
            System.out.println("0입니다.");
        }
        System.out.println("프로그램을 종료합니다.");
        // 조건과 상관없이 프로그램이 종료될 때 "프로그램을 종료합니다."라고 출력되도록 한다.
    }


}


