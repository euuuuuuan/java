package com.ohgiraffers.section1.literal;

public class Application2 {
    public static void main(String[] args) {

        //psvm 입력하면 위에 명령어 자동완성
        // 수업 목표 : 값을 직접 연산하여 출력할 수 있다.
        // 이때 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.

        // 정수와 정수의 연산
        System.out.println("============ 정수와 정수의 연산 ============");
        //ctrl+shift+화살표 방향 단체드래그
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10); //나누기를 한 몫의 값
        System.out.println(123 % 10); //나누기를 한 나머지 값

        // 실수와 실수의 연산
        System.out.println("============ 실수와 실수의 연산 ============");
        //ctrl+d 바로아랫줄 복사
        //ctrl+shift+방향키는 복사개체 이동
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23); // 계산의 결과는 실수 형태로 나온다.
        System.out.println(1.23 * 10);
        System.out.println(1.23 / 10);
        System.out.println(1.23 % 1.0);

        // 정수와 실수의 연산
        // 정수와 실수 연산 = 결과는 항상 실수
        System.out.println("============ 정수와 실수의 연산 ============");
        System.out.println(123 + 0.5); // 실수
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        //문자와 문자의 연산
        //문자는 내부적으로 숫자로 인식되어 연산된다. ex)아스키코드, 유니코드
        System.out.println("============ 문자와 문자의 연산 ============");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        // 문자와 정수의 연산
        System.out.println("============ 문자와 정수의 연산 ============");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 10);
        System.out.println('a' / 10);
        System.out.println('a' % 10);

        // 문자와 실수의 연산
        // 결과는 실수의 형태로 나오게 된다.
        System.out.println("============ 문자와 실수의 연산 ============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 10.0);
        System.out.println('a' / 10.0);
        System.out.println('a' % 10.0);

        /*
        결론 : 문자는 내부적으로 숫자 취급을 한다.
         */

        // 문자열과 문자열의 연산
        // 문자열과 문자열의 연산은 합치기(이어붙이기)가 된다.
        // 문자열의 연산은 '+' 연산만 기능한다.
        System.out.println("============ 문자열과 문자열의 연산 ============");
        System.out.println("hello" + " " + "world");

        // 문자열과 다른 형태의 값 연산
        System.out.println("============ 문자열과 다른 형태의 값 연산 ============");
        System.out.println("taegeun" + 123); //정수 연산
        System.out.println("taegeun" + 123.456); //실수 연산
        System.out.println("taegeun" + 'a'); //문자 연산
        System.out.println("taeguen" + true);

        // 주의할 점 : 숫자로 된 문자열 형태의 값도 + 연산을 했을 때 문자열 합치기가 된다.
        System.out.println("123" + "456");

        // 논리값과 논리값의 연산
        // 논리값 끼리의 연산은 모든 연산자 사용이 불가.
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);

        // 논리값과 정수의 연산도 마찬가지로 안됨.
        // 논리값과 실수의 연산도 마찬가지로 안됨.
        // 논리값과 문자의 연산도 안됨.

        // 논리값과 문자열의 연산
        System.out.println("============ 논리값과 문자열의 값 연산 ============");
        System.out.println(true + "a");

    }
}
