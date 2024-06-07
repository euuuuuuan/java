package com.ohgiraffers.section02.generation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        // 배열과 컬렉션 객체의  stream() 메소드를 활용한 스트림 생성

        String[] sarr = new String[]{"java", "oracle", "jdbc"};

        Stream<String> strStream = Arrays.stream(sarr);
        strStream.forEach(System.out::println);

        System.out.println();
        // 배열의 일부분(0번 인덱스부터 2번 인덱스 이전까지)를 스트림으로 변환
        System.out.println("================== 부분형 스트림 ==================");
        Stream<String> strStream2 = Arrays.stream(sarr, 0, 2);
        strStream2.forEach(System.out::println);


        System.out.println();
        System.out.println("================== List를 스트림으로 변환 ==================");
        // Arrays.asList로 만들 때는 add remove가 되지 않는다. (불변 객체)
        List<String> stringList = Arrays.asList("html", "css", "javascript");
        Stream<String> strStream3 = stringList.stream(); // 변환하기
        strStream3.forEach(System.out::println);

        System.out.println();
        System.out.println("================== List를 바로 forEach로 출력 ==================");
        // 컬렉션의 경우 스트림 생성을 생략하고 사용가능
        stringList.forEach(System.out::println);

        System.out.println();
        System.out.println("================== builder().build()로 스트림 생성 ==================");
        // Builder를 활용한 스트림 생성
        Stream<String> builderStream = Stream.<String>builder()
                .add("홍길동")
                .add("유관순")
                .add("윤봉길")
                .build();

        builderStream.forEach(System.out::println);
    }
}
