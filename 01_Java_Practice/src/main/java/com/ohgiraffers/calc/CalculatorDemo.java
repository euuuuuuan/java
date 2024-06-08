package com.ohgiraffers.calc;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setOprands(new int[]{10,20});
        calc.sum();
//        calc.avg();
//
//        calc.setOprands(new int[]{10,20,30});
//        calc.sum();
//        calc.avg();
    }
}
