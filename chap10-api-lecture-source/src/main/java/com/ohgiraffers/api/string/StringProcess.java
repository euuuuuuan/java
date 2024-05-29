package com.ohgiraffers.api.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcess {
    public String preChar(String helloWorld) {

        String result = helloWorld.substring(0, 1).toUpperCase() + helloWorld.substring(1);

        return result;

        // String 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
    }

    public int charSu(String s, char ch) {

        int count = s.length() - s.replace("c", "").length();

        return count;

//        String num = "application car cable";
//        System.out.println(s.indexOf("s")); // 문자열 탐색
//        System.out.println(s.indexOf("ch")); //문자 탐색
//        int test = s.indexOf("kkk");//해당 문자열이 없을 경우 -1 반환
//        System.out.println(test);
        //        System.out.println(s.contains("s"));
//        System.out.println(s.contains("c"));
//        System.out.println(s.indexOf("c")); //문자 탐색

        /*public static int runTest(String regex, String text) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            int matches = 0;
            while (matcher.find()) {
                matches++;
            }
            return matches;
        }*/

        // int 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성

        //        substring()
        //        매개변수 2개 : 처음 위치 ~ 해당지점 문자열 분활
        //        매개변수 1개 : 해당 지점부터 ~마지막 까지 문자열 분할*/
        //        String str1 = "Hello World Hi java";
        //        System.out.println(str1);
        //        str1 = str1.substring(0, 5) + str1.substring(6, 11) + str1.substring(12, 14) + str1.substring(15);
        //        System.out.println(str1);
        //        //Hello World Hi java
        //        //HelloWorldHijava
    }
}
