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

        // 연산 결과를 저장할 변수
        int result = 0;

        switch (op){
            case '+':
                result = first + second;
                break;
            case '-':
                result = first + second;
                break;
            case '/':
                result = first / second;
                break;
            case '*':
                result = first * second;
                break;
            case '%':
                result = first % second;
                break;
                /* 산술연산 외에 다른 문자에 대한 처리는 생략하였음.*/
        }

        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void testSwitchVendingMachine() {
        /*
        * switch문을 이용해서 문자열 값 비교 및 break에 대한 테스트
        * 1. JDK 1.7 이상부터 switch 문을 이용해 문자열을 비교할 수 있다.
        * 2. break를 사용하지 않으면 멈추지 않고 계속 실행구문을 동작시킨다.
        * */

        // swtich문을 이용한 간단한 자판기
        System.out.println("=== Ohgiraffers vending machine ===");
        System.out.println("   사이다   콜라   환타   박카스   핫식스   ");
        System.out.println("========================================");
        System.out.println("음료를 선택해 주세요 : ");

        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();

        int price = 0;

        switch (selectedDrink) {
            case "사이다":
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
                break;
            case "콜라":
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
                break;
            case "환타":
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
                break;
            case "박카스":
                System.out.println("박카스를 선택하셨습니다.");
                price = 800;
                break;
            case "핫식스":
                System.out.println("핫식스를 선택하셨습니다.");
                price = 900;
                break;

        }
        System.out.println(price + "원을 투입해주세요.");
    }

    public void axeSwitch () {
        System.out.println("산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠트리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.");

        System.out.println("어느 도끼가 너의 도끼이냐? (1. 금도끼, 2. 은도끼, 3. 쇠도끼)");
        Scanner sc = new Scanner(System.in);
        String axe = sc.nextLine(); // case 뒤에 문자형으로 가능
//        int axe = sc.nextInt(); // case 뒤에 숫자로도 가능
        switch (axe) {
            case "1":
                System.out.println("이런 거짓말쟁이!! 너에게는 아무런 도끼도 줄 수 없구나, 이 욕심쟁이야!!");
                break;

            case "2":
                System.out.println("욕심이 과하지는 않지만, 넌 거짓말을 하고 있구나!! 어서 썩 사라지거라.");
                break;

            case "3":
                System.out.println("오호 ~ 정직하구나 금도끼, 은도끼, 쇠도끼 다 가져가거라~");
                break;

        }
        System.out.println("그렇게.. 산신령은.. 다시 연못으로.. 사라지고 말았다..");



    }
}
