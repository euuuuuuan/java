package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    Scanner sc = new Scanner(System.in);
    CharacterProcess cp = new CharacterProcess();

    public static void main(String[] args) {
        Run r = new Run();
        r.printStr();
    }
    public void printStr() {

        System.out.println("사용할 문자열을 하나 입력하세요.");
        String txt = sc.nextLine();
        cp.countAlpha(txt);


    }
}
