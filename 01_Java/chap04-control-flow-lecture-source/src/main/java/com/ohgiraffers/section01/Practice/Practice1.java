package com.ohgiraffers.section01.Practice;

import java.util.Scanner;

public class Practice1 {

    public void condition1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요.: ");
        int age = sc.nextInt();

        System.out.print("키를 입력하세요.: ");
        int tall = sc.nextInt();

        if (tall < 110 & age < 9) {
            System.out.println("나이가 9살 미만이고, 키가 110cm 미만이라 탑승할 수 없습니다.");
        } else if(age < 9) {
            System.out.println("나이가 9살 미만이라 탑승할 수 없습니다.");
        } else if(tall < 110) {
            System.out.println("키가 110cm 미만이라 탑승할 수 없습니다.");
        } else {
            System.out.println("탑승이 가능합니다.");
        }


    }
}
