package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
    // 내부 인터페이스
    @FunctionalInterface
    public interface Addition {
        int addTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Subtraction {
        int subtractTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Multiplication {
        int multiplyTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Division {
        int divideTwoNumbers(int a, int b);
    }


}
