package com.ohgiraffers.section01.Practice;

import java.util.Scanner;

//영어와 수학의 점수를 입력 받는다.
//두 과목의 평균이 60점 이상이고, 두 과목 모두다 40점 이상이여야 합격이 가능하다.
//평균이 60점 미만일 경우 “시험 불합격”
//60점은 넘지만 한과목이 40점 미만일 경우 “한과목 과락으로 인한 불합격”
//두 조건다 통과할경우 “시험 합격”
//을 출력한다.

public class Practice2 {
    public void condition2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("영어 점수를 입력해 주세요.: ");
        int math = sc.nextInt();

        System.out.print("수학 점수를 입력해 주세요.: ");
        int eng = sc.nextInt();

        int sum = math + eng;
        int avg = sum / 2;
        System.out.println("평균값은 " + avg + "입니다.");

        if(avg >= 60 && (math > 40 && eng > 40)) {
            System.out.println("시험 합격");
        } else if(avg < 60) {
            System.out.println("시험 불합격");
        } else if ((avg >= 60) && ((math < 40) || (eng < 40))) {
            System.out.println("한과목 과락으로 인한 불합격");
        }

    }
}
