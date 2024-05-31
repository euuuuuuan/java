package com.ohgiraffers.section02;

public class Application1 {
    public static void main(String[] args) {

        /*
        * 사용자 정의의 예외클래스
        *
        * RuntimeException의 후손 대부분은 예외처리를 강제화하지 않음.
        * 이런 경우에도 예외를 강제화하고 싶을 때, 사전에 정의된 예외클래스 외에
        * 개발자가 원하는 명칭의 예외클래스를 만들어 작성할 수 있다.
        * */
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-10000, 5000);
        } catch (Exception e) {
            // Exception 출력 - 로그를 남기는 것
             e.printStackTrace();
        }
    }
}
