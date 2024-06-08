package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {

        int num = 0;

        /*
        * 전달인자와 매개변수를 이용한 메소드 호출
        *
        * 변수의 종류
        *   1. 지역변수
        *   2. 매개변수
        *   3. 전역변수(필드)
        *   4. 클래스(static) 변수
        * */

        /*
        * 지역변수
        *
        * 지역변수는 선언한 메소드 블럭(영역) 안에서 내부에서만 사용 가능하다.
        * 다른 메소드간 서로 공유해야하는 값이 존재할 경우, 메소드 호출시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        * 이 때, 전달되는 값을 전단일자라고 부르고
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 '매개변수'라고 부른다.
        * */
        Application3 app3 = new Application3();
        app3.testMethod(20);
//        app3.testMethod("20"); // 자료형이 다름
//        app3.testMethod(20, 30, 40); // 매개변수 갯수가 다름
//        app3.testMethod(); // 아무것도 들어가지 않음
        // 전달인자와 매개변수를 이용한 메소드 호출 테스트

        // 변수에 값을 저장해서 전달할 수 있다.
        int age = 15;
//        String str = "15";
        app3.testMethod(age);

        // 자동형변환을 이용해 값 전달이 가능하다.
        byte byteAge = 10;
        app3.testMethod(byteAge); // 자동형변환

        long longAge = 2;
        app3.testMethod((int)longAge); // 강제형변환

        app3.testMethod(age + 3); // 기본연산 15 + 3
    }

    // 나이를 받아와서 "당신의 나이는 ~세 입니다."
    public void testMethod(int age) {

        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
