package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num) {

        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr) {

        // 배열의 값 출력
        System.out.println("배열의 값 출력");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.println("변경 후 배열의 값 출력");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

    }

    public void testClassTypeParameter(Rectangle rectangle) {

        System.out.println("매개변수로 전달받은 값 : " + rectangle);

        // 사각형의 넓이와 둘레 출력
        System.out.println("=========== 변경 전 사각형의 넓이와 둘레 ===========");
        rectangle.calcArea(); // 넓이 출력
        rectangle.calcRound(); // 둘레 출력

        rectangle.setWidth(100); // 자동형병환
        rectangle.setHeight(100);

        System.out.println("=========== 변경 전 사각형의 넓이와 둘레 ===========");
        rectangle.calcArea(); // 넓이 출력
        rectangle.calcRound(); // 둘레 출력
    }
}
