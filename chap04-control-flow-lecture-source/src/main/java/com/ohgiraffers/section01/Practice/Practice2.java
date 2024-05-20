package com.ohgiraffers.section01.Practice;

import java.util.Scanner;

public class Practice2 {
    public void condition2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("영어 점수를 입력해 주세요.: ");
        int math = sc.nextInt();

        System.out.print("수학 점수를 입력해 주세요.: ");
        int eng = sc.nextInt();


        int sum = math + eng;
        int sum2 = sum % 2;

    }
}
