package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    /*
    * [switch문 표현식]
    *
    * switch([비교할변수]) {
    *   case [비교값1] : 비교값1과 일치하는 경우 실행할 구문; break;
    *   case [비교값2] : 비교값2과 일치하는 경우 실행할 구문; break;
    *   default : case에 모두 해당하지 않는 경우 실행할 구문; break;
    * }
    *
    * 여러개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것
    * if-else-if와 유사하다. 일부 호환도 가능하다.
    * swtich문으로 비교가능한 값은 정수, 문자, 문자열 형태의 값이다.
    * 정확하게 일치하는 경우만 비교가 가능하다. 대소 비교를 할 수 없다.
    * case절에는 변수를 사용할 수 없다.(값만 비교 가능)
    * */

    /*
    * 정수 두개와 연산자 기호 문자를 입력받아서
    * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
    * */

    public void testSimpleSwitchStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 정수 입력 : ");
        int first = sc.nextInt();

        System.out.println("두번째 정수 입력 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력(+, -, *, /, %) : ");
        char op = sc.next().charAt(0); // 문자는 바로 못받으니까 charAt으로 받음.
    }
}
