package com.ohgiraffers.section02.terminal;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /*
         * reduce
         * 스트림에 있는 모든 요소를 누적시킨다.
         * Optional<T> reduce(BinaryOperator<T> accumulator);
         * T reduce(T identity, BinaryOperator<T> accumulator);
         * */

        // 인자가 1개일 경우
        OptionalInt reduceOneParam = IntStream.range(1, 4) // 1, 2, 3
                .reduce((a, b) -> { // 1부터 3까지 누적
                    return Integer.sum(a, b); // 모든 인덱스의 합산갑 반환
                });
        // .reduce(Integer::sum); // 위 코드와 동일
        System.out.println("reduceOneParam = " + reduceOneParam);  // 6

        // 인자가 2개일 경우
        int reduceTwoParam = IntStream.range(1, 4) // 1, 2, 3
                .reduce(100, Integer::sum); // 100부터 Stream안의 요소를 누적시켜라
        System.out.println("reduceTwoParam = " + reduceTwoParam); // identity -> 초기값

    }
}
