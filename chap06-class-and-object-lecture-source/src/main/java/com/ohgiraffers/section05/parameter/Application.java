package com.ohgiraffers.section05.parameter;

public class Application {

    // 메소드의 파라미터(매개변수)

    /*
    * 매개변수로 사용가능한 자료형
    * 1. 기본자료형
    * 2. 기본자료형 배열
    * 3. 클래스 자료형
    * 4. 클래스 자료형 배열
    * 5. 가변인자
    * */

    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();

        // 기본 자료형을 매개변수로 전달받은 메소드 호출 확인.
        // 기본 자료형 8가지 모두 가능 (byte short int long / float double / char / boolean)
        int num = 20;
        pt.testPrimaryTypeParameter(num);

        // 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인
        int[] iarr = new int[] {1, 2, 3, 4, 5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println();

        System.out.println("변경 후 원본 배열의 값 출력");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }

        // 클래스 자료형
        Rectangle r1 = new Rectangle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassTypeParameter(r1);

        System.out.println("=========== 변경 후 원본 사각형의 넓이와 둘레 ===========");
        r1.calcArea(); // 넓이 출력
        r1.calcRound(); // 둘레 출력

    }
}
