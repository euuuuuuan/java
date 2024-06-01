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
            total += value;
        }
        System.out.println(total);

        for (int value = 0; value < this.oprands.length; value++) {
            total += value;
        }
        System.out.println(total);
    }

    public void avg() {
        int total = 0;
        for (int value : this.oprands) {
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}
