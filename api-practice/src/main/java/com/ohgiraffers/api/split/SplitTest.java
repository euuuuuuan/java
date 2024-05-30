package com.ohgiraffers.api.split;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";

        // 문자열분리
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr)); // 1번째 방법

        // 문자 배열로 바꾸기
        // 1) 문자배열을 문자열배열 크기로 만들기
        char[] chArr = new char[strArr.length];

        // 2) 문자열배열의 값을 문자로 바꿔서, 문자배열에 값 넣기
        for (int i = 0; i < strArr.length; i++) {
            chArr[i] = strArr[i].charAt(0);
        }

        System.out.println("문자배열 개수 출력 : " + chArr.length);
        // 문자배열에 값이 잘 들어갔는지 확인
        System.out.println("문자배열 개수 출력 : " + Arrays.toString(chArr));

        // 문자배열 -> 문자열
        System.out.println("포문");
        String result = "";
        for (char ch : chArr) {
            result = result + ch;
        }
        System.out.println("result = " + result);

        String result2 = new String(chArr);
        System.out.println("result2 = " + result2);

        // 대문자로 바꾸기
        result = result.toUpperCase();
        System.out.println("모두 대문자로 바꾼 result = " + result);

        for (String s : strArr) { // 2번째 방법
            System.out.println(s);
        }


    }
}
