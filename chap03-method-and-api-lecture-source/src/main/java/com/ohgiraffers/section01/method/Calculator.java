package com.ohgiraffers.section01.method;

public class Calculator {


    // 삼항연산자로 두 수를 비교해서 작은 값을 return 해주는 메소드
    public int nonStaticNumberOf(int first, int second) {

        //int result = (first > second)? second : first;
        return (first > second)? second : first;

    }

    // 삼항연산자로 두 수를 비교해서 큰 값을 return 해주는 메소드
    public static int staticMaxNumberOf(int first, int second){

        return (first > second)? first : second;
    }


    // non-static
    public int plusNumber(int first, int second) {

        return first + second;
    }

    public int minusNumber(int first, int second) {

        return first - second;
    }

    public int multipleNumber(int first, int second) {

        return first * second;
    }
    public int divideNumber(int first, int second) {

        return first / second;
    }

    //static
    public static int remainNumber(int first, int second) {

        return first % second;
    }


    // 더하기, 빼기, 곱하기, 나누기, 나머지
    // 각각을 수행하는 메소드를 만들고
    // 더하기, 빼기, 곱하기, 나누기 => non-static
    // 나머지 => static
}
