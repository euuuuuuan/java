package com.ohgiraffers.section01.array;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 5명의 자바 점수를 정수로 입력받아서,
        * 합계와 평균을 실수로 구하는 프로그램
        * */

        int[] scores = new int[5];
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg;

        for(int i = 0; i < scores.length;/*i<5*/ i++) {
            System.out.println((i+ 1) + "번째 학생의 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
        }

        for(int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        avg = (double) sum / scores.length;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);

/*        System.out.print("Enter grade 5 times to transfer to integer : ");
        scores[0] = sc.nextInt();
        scores[1] = sc.nextInt();
        scores[2] = sc.nextInt();
        scores[3] = sc.nextInt();
        scores[4] = sc.nextInt();

        sum = scores.length;
        avg = sum / 5;
        for (int i = 0, value = 0; i < scores.length; i++) {
            System.out.println("sum = " + sum);
            System.out.println("avg = " + avg);*/





    }
}
