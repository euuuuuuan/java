package com.ohgiraffers.section02.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {

        /*
        * collect() : Collector 타입을 받아서 처리하는데,
        *               메소드를 통해 컬렉션을 출력으로 받을 수 있다.
        * */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02", "testName02"),
                new Member("test03", "testName03")
        );

        List<String> collectorCollection = memberList
                .stream()
                .map(Member::getMemberName) // testName01, testName02, testName03
                .toList();

        System.out.println("collectorCollection = " + collectorCollection);

        System.out.println();
        String str = memberList
                .stream()
                .map(Member::getMemberName) // 각 member 객체를 이름으로 매핑
                .collect(Collectors.joining(", "));
                // Stream에 있는 값을 구분자 없이 하나의 문자열로 출력

        System.out.println("str = " + str);

        System.out.println();
        String str2 = memberList
                .stream()
                .map(Member::getMemberName)
                .collect(Collectors.joining("||", "*시작*", "*끝*"));
                //  '||'가 구분자로 들어가고, 시작과 끝의 구분자를 추가로 지정해줌.
        System.out.println("str2 = " + str2);
    }
}
