package com.ohgiraffers.section02.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /*
        * match
        *
        * boolean anyMatch(Predicate<? super T> predicate); // 하나라도 조건을 만족하는 값이 있는지
        * boolean allMatch(Predicate<? super T> predicate); // 모든 조건을 만족하는지
        * boolean noneMatch(Predicate<? super T> predicate); // 모든 조건을 만족하지 않는지
        * */

        List<String> stirngList = Arrays.asList("Java", "Spring", "SpringBoot");

        // 하나라도 조건을 만족하는 값이 있는지 확인
        boolean anyMatch = stirngList
                .stream()
                .anyMatch(str -> str.contains("p")); // 문자열이 p를 포함하고 있는지

        System.out.println("anyMatch = " + anyMatch);

        boolean allMatch = stirngList
                .stream()
                .allMatch(str -> str.length() > 4); // 문자열의 길이가 4보다 큰지

        System.out.println("allMatch = " + allMatch);

        boolean noneMatch = stirngList
                .stream()
                .noneMatch(str -> str.contains("c")); // 문자열이 "c"를 포함하는지

        System.out.println("noneMatch = " + noneMatch); // true

    }
}
