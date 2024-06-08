package com.ohgiraffers.calc;

public class Calculator {
    int[] oprands;
    public void setOprands(int[] oprands) {
        this.oprands = oprands;
    }
    // 좌우항의 입력값은 10과 20
    public void sum(){
        int total = 0;
        for (int value : this.oprands) {
            System.out.println("total 값 = " + total);
            System.out.println("value 값 = " + value);
            total += value;
        }
        System.out.println(total);

//        System.out.println("=================Cut Line=================");
//        for (int value = 0; value < this.oprands.length; value++) { // 배열의 길이값 만큼을 더하는 것 : 출력값 1
//            total += value;
//            System.out.println("total 값 = " + total);
//            System.out.println("value 값 = " + value);
//        }
//        System.out.println(total);

        // 추가 의문점 : 그렇다면 일반 for문으로 향상된 for문 연산과 동일하게 하려면 어떡할까
        // 하단의 for문을 참고하자.

//        for (int i = 0; i < this.oprands.length; i++) { // 배열의 길이값 만큼을 더하는 것 : 출력값 1
//            total += this.oprands[i];
//            System.out.println("total 값 = " + total);
//            System.out.println("value 값 = " + i);
//        }
//        System.out.println(total);

    }
//
//    public void avg() {
//        int total = 0;
//        for (int value : this.oprands) {
//            total += value;
//        }
//        System.out.println(total/this.oprands.length);
//    }
}
