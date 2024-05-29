package com.ohgiraffers.section02.string;

public class Application2 {
    // 문자열 객체를 만드는 다양한 방법
    public static void main(String[] args) {
        /*
        * 문자열 객체를 만드는 방법
        * 1. "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리 (singleton)
        * 2. new String("문자열") : 매번 새로운 인스턴스를 생성
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str2 == str3 : " + (str2 == str3)); // new로 새로운 주소가 할당되어 주소값 비교연산자이기에 false
        System.out.println("str3 == str4 : " + (str3 == str4)); // 새로운 new와 다른 new이기에 주사값이 다르다. false

        System.out.println();
        /*
        * 해시코드 값 비교
        * */
        System.out.println("str1의 hashCode = " + str1.hashCode());
        System.out.println("str2의 hashCode = " + str2.hashCode());
        System.out.println("str3의 hashCode = " + str3.hashCode());
        System.out.println("str4의 hashCode = " + str4.hashCode());
        // 같은 객체일 경우 내용이 같으면 hashCode()를 똑같이 해준다. (규약)

        System.out.println();
        // 문자열은 불변이라는 특징
        str2 += "oracle";
        System.out.println("str1 == str2 : " + (str1 == str2));

        System.out.println();
        /*
        * equals() : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열 값을 비교해서
        *           동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록
        *           Object이 equals() 메소드를 재정의(Overriding) 해두었다.
        *           따라서 문자열 인스턴스 생성 방식과 상관없이 동일한 문자열인지 비교하기 위해서는
        *           == 연산 대신에 equals() 메소드를 사용해야 한다.
        * */

        System.out.println("str1.equals(str3) : " + str1.equals(str3));
        System.out.println("str1.equals(str4) : " + str1.equals(str4));

    }
}
