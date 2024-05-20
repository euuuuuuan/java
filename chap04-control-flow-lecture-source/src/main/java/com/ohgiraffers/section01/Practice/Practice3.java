package com.ohgiraffers.section01.Practice;

import java.util.Scanner;

public class Practice3 {
    /*
     * 키보드로 정수를 하나 입력받아, 해당 정수만큼 한 행에 "*"을 행의 번호개씩 출력하세요.
     *
     * 예시) 정수를 입력하세요 : 5
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     *
     * */

    public void stars() {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄의 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) { // 1부터 n개의 줄 생성

            for (int j = 1; j <= i; j++) { // 행의 순서만큼(첫번째 줄 1, 두번째 줄 2...) 반복
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        for (int i = 1; i <= row; i++) { // 1부터 n개의 줄 생성

            for (int j = 1; j <= row-i; j++) { // 행의 순서만큼(첫번째 줄 1, 두번째 줄 2...) 반복
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        for (int i = 1; i <= row; i++) { // 1부터 n개의 줄 생성

            for (int j = 1; j <= row-i; j++) { // 행의 순서만큼(첫번째 줄 1, 두번째 줄 2...) 반복
                System.out.print(" ");
            }
            for (int k = 1; k <= row+i; k++){
                System.out.println("*");
            }
            System.out.println(); // 줄바꿈
        }

    }
}

