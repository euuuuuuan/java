package com.ohgiraffers.section02.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    /*
     * Calculating
     * 수학연산과 관련된, 다양한 메소드를 제공하는데 최소, 최대, 종합 등의 결과를 보여준다.
     * */

    public static void main(String[] args) {

        // count() : 스트림에 담겨있는 개수를 반환
        long count = IntStream.range(1, 10).count();
        // sum() : 스트림에 담겨있는 정수의 총합을 반환
        long sum = IntStream.range(1, 10).sum();

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        int oddSum = IntStream.range(1, 10)
                .filter(i -> i % 2 == 1) // 1, 3, 5, 7, 9
                .sum();
        System.out.println("oddSum = " + oddSum); // 25

        // OptionalInt : 값이 있을 수도 없을 수도 있다.
        OptionalInt min = IntStream.range(1, 10).min();
        OptionalInt max = IntStream.range(1, 10).max();
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
