package com.ohgiraffers.section1.literal;

public class application1 {
    public static void main(String[] args) {
        System.out.print("a");
        System.out.print("a");
        System.out.println("b");
        System.out.print("c");

        System.out.println("");
        //'sout' 치면 인텔리제이는 Sys~println 자동입력
//        System.out.print("");
        //CTRL + / 주석처리 한번 더 누르면 주석해제. 드래그 후 단축키하면 단체 주석

        // 수업목표 : 여러 가지 값의 형태를 출력할 수 있다.
        System.out.println(123);
        // 정수 출력
        System.out.println(12.3);
        // 실수 출력

        // 문자 출력
        System.out.println('a'); // 문자 형태 값은 홀따옴표로 감싸주어야한다.
        //System.out.println('ab');
        System.out.println('1'); // 숫자 값이지만 홀따옴표로 감싸져 있는 경우 문자 '1'이라고 판단한다.
        //System.out.println('');

        // 문자열 출력
        System.out.println("안녕"); // 문자열은 문자가 여러개가 나열된 형태를 의미함. 쌍따옴표로 감싸져있다.
        System.out.println("123"); // 필기 : 정수이지만 쌍따옴표로 감싸져 있기에 문자열로 보아야 한다.
        System.out.println(""); // 아무 값도 없는 빈쌍따옴표도 문자열로 취급한다.
        System.out.println("a"); // 한개의 문자도 쌍또옴표로 감싸면 문자열이다. (문자 'a'랑은 다르다.)

        // 논리값 출력
        System.out.println(true);
        System.out.println(false);

        ///alt+1 왼쪽 프로젝트창 생성/제거. alt+insert 새프로젝트 생성 단축키.
    }
}
