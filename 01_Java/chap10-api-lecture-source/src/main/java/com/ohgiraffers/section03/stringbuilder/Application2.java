package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    // StringBuilder에 자주 사용되는 메소드
    public static void main(String[] args) {

        /*
         * delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열 제거
         * deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거
         * => 둘다 원본에 영향을 미친다.
         * */

        /*
        StringBuilder.deleteCahrAt()
        해당 문자의 index를 매개변수로 넣으면 해당 index의 문자를 지운다.*/
        StringBuilder sb = new StringBuilder("javaoracle");
        StringBuilder sb2 = new StringBuilder("javaoracle");

        System.out.println("sb = " + sb);
        System.out.println("delete() : " + sb.delete(2, 5)); // 첫째 지정 문자열에서 둘째 지정문자열 이전까지 삭제
        System.out.println("sb = " + sb);

        System.out.println("sb2 = " + sb2);
        System.out.println("delete() : " + sb2.deleteCharAt(3)); // 해당 문자열의 배열순만 삭제
        System.out.println("sb2 = " + sb2);


        /*
        replace(str1, str2)
        -> str1을 str2로 대체함
        str2를 ""(빈 문자열)로 할시 str1은 해당 문자열에서 제거된다.*/
        String str = "Hello World Hi Java";
        System.out.println(str);
        str = str.replace(" ", "");
        System.out.println(str);
        //Hello World Hi Java
        //HelloWorldHiJava

        /*
        substring()
        매개변수 2개 : 처음 위치 ~ 해당지점 문자열 분활
        매개변수 1개 : 해당 지점부터 ~마지막 까지 문자열 분할*/
        String str1 = "Hello World Hi java";
        System.out.println(str1);
        str1 = str1.substring(0, 5) + str1.substring(6, 11) + str1.substring(12, 14) + str1.substring(15);
        System.out.println(str1);
        //Hello World Hi java
        //HelloWorldHijava
    }
}
