package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*
        * [for문 표현식]
        *
        * for([초기식]); [조건식]; [증감식];) {
        *
        *   // 조건을 만족할 겨우 수행할 구문
        *
        * }
        * */

        // 1. 부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
        for(int i = 11; i >= 10; i = i++) {
            System.out.println(i);
        }
    }

    public void testForExample1() {
        /* 10명의 학생 이름을 입력받아 이름을 출력해보자. */

        Scanner sc = new Scanner(System.in);

        // 첫번째 학생
/*        System.out.print("1번째 학생의 이름을 입력해주세요 : ");
        String student1 = sc.nextLine();
        System.out.println("1번째 학생의 이름은 " + student1 + "입니다.");*/

        for(int i = 1; i <= 10; i++) {
            System.out.print(i + "번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i + "번째 학생의 이름은 " + student + "입니다.");

        }
    }

    public void testExample2() {
        /*
        * 1 ~ 10 까지의 합계를 구하시오
        *
        * 1부터 10까지 1씩 증가시키면서, 값을 저장할 변수(totla)에 계속 누적시켜 저장된 값을 출력하세요.
        * */
        int num = 1;

        // 어떤걸 반복하면 좋을지?
        // 1. 변수(num)에 1씩 증가하는 값을 담기
        // 2. 저장된 변수(num)을 total에 누적시키기

        int total2 = 0;

        for(num = 1; num <= 10; num++) {
            total2 += num;
            // total2 = total2 + num;
        }

        System.out.println("total2 : " + total2);
    }


    public void testExample3() {

        /*
         * 5 ~ 10 사이의 난수를 발생시켜서
         * 5, 6, 7, 8 9, 10
         * 1부터 발생한 난수까지의 합계를 구해보자.
         * */

        int random = (int) (Math.random() * 6) + 5;

        System.out.println("random = " + random);

        int total = 0;

        if(random == 5) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
        } else if (random == 6) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
        } else if (random == 7) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
        } else if (random == 8) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
            total += 8;
        } else if (random == 9) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
            total += 8;
            total += 9;
        } else if (random == 10) {
            total += 1;
            total += 2;
            total += 3;
            total += 4;
            total += 5;
            total += 6;
            total += 7;
            total += 8;
            total += 9;
            total += 10;
        }

        System.out.println("total1 : 1부터 " + random + "까지의 합은 : " + total);

        int total2 = 0;
        for(int num = 1; num <= random; num++) {
            System.out.println("total2 = " + total2 + " + " + num);
            total2 += num;
        }

        System.out.println("total2 : 1부터 " + random + "까지의 합은 : " + total2);

    }

    // 자습으로 만들어보기
    public void testExample4() {
        /*
        * 두개의 숫자를 입력받아서 작은 수에서 큰 수까지의 합계를 구하세요
        * 단, 두 숫자는 같은 숫자를 입력하지 않는다는 조건
        * */
    }

    public void printSimpleGugudan() {

        /*
        * 키보드로 2 ~ 9 사이의 구구단을 입력받아
        * 2 ~ 9 사이인 경우 해당 단의 구구단을 출력하고,
        * 그렇지 않은 경우 반드시 2 ~ 9 사이의 양수를 입력해야 합니다. (출력 내용)
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 구구단의 단 수를 입력하세요 : ");
        int num = sc.nextInt();

        if( (num >= 2) && (num <= 9) ) {
        for (int i = 1; i < 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    } else {
            System.out.println("반드시 2~9 사이의 양수를 입력해야 합니다.");
        }
}
}
