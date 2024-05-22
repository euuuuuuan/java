package Review.Array;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        /*세 학생의 점수를 정수로 입력받아 합계와 평균을 실수로 구하시오.
        (A학생 : 30점, B학생 : 52점, C학생 : 65점)*/

        int[] score = new int[3];
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        double avg;

        for(int i = 0; i < score.length; i++) {
            System.out.println("Student number: " + (i + 1) + " / Enter the score of the student");
            score[i] = scan.nextInt();
        }

        for(int i = 0; i < score.length; i++) {
            sum += score[i];
        }

        avg = (double) sum / score.length;
        System.out.println("Their sum score is : " + sum);
        System.out.println("Their avg score is : " + avg);

    }
}
