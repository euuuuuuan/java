package com.ohgiraffers.section02.enumtype;

public class Application {

    /*
     * Enum을 이용하여 선언된 인스턴스는 싱글턴으로 관리가 된다.
     * = 인스턴스가 한개임을 보장한다.
     * */
    public static void main(String[] args) {
        Subjects subjects1 = Subjects.JAVA;
        Subjects subjects2 = Subjects.HTML;

        // toString을 이용해 문자열로 관리하기 쉽다.
        System.out.println(Subjects.JAVA.toString());

        // values()를 이용해 상수값 배열을 반환
        Subjects[] subjects = Subjects.values();

        for (Subjects s : subjects) {
            System.out.println(s);
        }

        // 타입 안전을 보장
//        Subjects subjects3 = 0; // 에러 발생
        Subjects subjects4 = Subjects.JAVA;
    }

}
