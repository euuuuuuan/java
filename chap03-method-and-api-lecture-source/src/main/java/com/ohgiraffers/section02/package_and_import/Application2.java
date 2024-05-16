package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.staticMaxNumberOf;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우, 패키지명을 포함한 풀 클래스 이름을 사용해야하지만
        * 너무 길다.
        *
        * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.
        *
        * */

        Calculator calc = new Calculator();
        int min = calc.nonStaticNumberOf(50, 60);
        System.out.println("50과 60중 더 작은 것은? " + min);

        // static 메소드의 경우
        int max = staticMaxNumberOf(100, 200);
        System.out.println("100과 200중 더 큰 것은? " + max);

        int max2 = staticMaxNumberOf(100, 200);
        System.out.println("100과 200중 더 큰 것은? " + max2);
    }
}
