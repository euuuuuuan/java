package com.ohgiraffers.section03.abstraction4;

import java.util.Scanner;

public class User {
    /*
     * 3. 객체 상호작용 다이어그램
     * - 사용자 --> 키오스크(메뉴) --주문(메뉴)--> 바리스타 --> 커피
     *  <---------------------------- 커피 전달 --------------------
     *
     * - 사용자 ---<<메뉴를 보여줘>> --> 키오스크
     *         <----- 메뉴 노출 -----------
     *       -- 종류 / 옵션 / 수량 입력 ---->
     *     <---------- 주문 확인 -----------------
     *     ----------- 주문 승인 --------------> 주문에 따라서 만들어줘 ---> 바리스타 --> 커피*/


    public static void main(String[] args) {

        Kiosk kiosk = new Kiosk();
        Menu menu = new Menu();

        Scanner scan = new Scanner(System.in);
        menu.firstScreen();

    }

}

