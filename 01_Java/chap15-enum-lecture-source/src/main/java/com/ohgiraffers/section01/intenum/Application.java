package com.ohgiraffers.section01.intenum;

public class Application {

    public static void main(String[] args) {

        /*
         * Enum (열거타입)
         *
         * 제한된 값 목록이 필요할 때 사용한다.
         *
         * Enum이란 관련이 있는 상수의 집합 클래스를 의미한다.
         * 각각의 열거 상수는 열거 객체로 생성된다.
         * 기존의 상수를 정의하는 방법을 효과적으로 대체한다.
         *
         * 기존 정수 열거 패턴의 단점
         * 1. 정수형 상수는 의미가 있는 문자열로 출력하기 어렵다.
         * 2. 정수 열거 그룹에 속한 상수들을 순회할 수 없다. (개수 확인도 불가능)
         * 3. 타입의 안전을 보장할 수 없다.
         * */

        // 1. 정수값만을 저장하고 있는 필드일 뿐이다.
        int subject1 = Subjects.JAVA; // 0
        int subject2 = Subjects.HTML; // 0

        if (subject1 == subject2) {
            System.out.println("두 과목은 같은 과목입니다.");
        }

        // 2. 문자열로 출력하기가 까다롭다.
        int num = 0;
        String subjectText = "";

        switch (num) {
//            case Subjects.JAVA: subjectText = "JAVA"; break;
//            case Subjects.JDBC: subjectText = "JDBC"; break;
//            case Subjects.ORACLE: subjectText = "ORACLE"; break;

        }

        System.out.println("subjectText : " + subjectText);

        // 3. 타입 안전을 보장할 수 없다.
        printSubject(Subjects.JAVASCRIPT);
//        printSubject(5);

    }
    // switch문을 int를 매개변수로 입력받고
    // return은 없고, 과목명을 출력하는 메소드
    // public static, printSubject() {}

    public static void printSubject(int subjectNumber) {
        String subjectName = "";
        switch (subjectNumber) {
            case Subjects.JAVA:
                subjectName = "JAVA";
                break;
            case Subjects.JDBC:
                subjectName = "JDBC";
                break;
            case Subjects.ORACLE:
                subjectName = "ORACLE";
                break;
        }
        System.out.println("subject : " + subjectName);
    }
}
