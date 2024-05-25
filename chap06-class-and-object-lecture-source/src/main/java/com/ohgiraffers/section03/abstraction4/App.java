package com.ohgiraffers.section03.abstraction4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        /*
         * 1. 요구사항
         * - 사용자는 키오스크를 통해 커피를 주문할 수 있다.
         * - 사용자는 키오스크에 제시된 메뉴를 선택할 수 있다.
         * - 커피를 주문시에 종류, 옵션(HOT/ICE), 수량등을 선택할 수 있다.
         * - 사용자는 주문한 내용을 확인하고, 취소할 수 있다.
         * - 주문이 완료되면 바리스타에게 제조요청이 전달되어야 한다.
         * - 바리스타는 주문내용을 확인하고, 그에 맞게 제조한다.
         * - 바리스타는 커피 제조시마다 재고량을 관리한다.
         *
         * 2. 객체도출
         * - 사용자
         * - 바리스타
         * - 키오스크
         * - 커피(종류, 옵션, 수량)
         * - 메뉴
         * - 주문
         *
         * 3. 객체 상호작용 다이어그램
         * - 사용자 --> 키오스크(메뉴) --주문(메뉴)--> 바리스타 --> 커피
         *  <---------------------------- 커피 전달 --------------------
         *
         * - 사용자 ---<<메뉴를 보여줘>> --> 키오스크
         *         <----- 메뉴 노출 -----------
         *       -- 종류 / 옵션 / 수량 입력 ---->
         *     <---------- 주문 확인 -----------------
         *     ----------- 주문 승인 --------------> 주문에 따라서 만들어줘 ---> 바리스타 --> 커피
         * 4. 객체가 수신해야 하는 메세지
         *  - 키오스크 :
         *       메뉴를 제공해줘
         *           사용자 선택에 따라 주문을 생성해라
         *           생성된 주문을 사용자에게 확인하라
         *           주문을 바라스타에게 전달해라
         *  - 바리스타 :
         *       주문에 따라 커피를 만들어라(커피객체 반환)
         *       재고량을 관리
         * */
//        Kiosk kiosk = new Kiosk();
//        Scanner scan = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("========== Welcome to Euanbottle ==========");
//            System.out.println("1. Order");
//            System.out.println("2. Show me the menu you've got");
//            System.out.println("Please enter the number you want");
//
//            int num = scan.nextInt();
//            switch (num) {
//                case 1:
//                    kiosk.receivingOrder();
//                case 2:
//                    kiosk.showingMenu();
//                    System.out.print("Please enter the number you want : ");
//
//                    int num2 = scan.nextInt();
//                    switch (num2) {
//                        /*case 1:
//                            kiosk.coffee();
//                            if (num2 == 8) {
//                                kiosk.deserts();
//                                break;
//                            } else if (num2 == 9) {
//                                kiosk.nonCoffee();
//                                break;
//                            } else if (num2 == 0) {
//                                kiosk.showingMenu();
//                                break;
//                            } else {
//                                System.out.println("You entered an invalid number.");
//                            }*/
///*
//                        case 2:
//                            kiosk.nonCoffee();
//
//                            if (num == 8) {
//                                kiosk.tea();
//                                break;
//                            } else if (num == 9) {
//                                break;
//                            } else if (num == 0) {
//                                break;
//                            } else {
//                                System.out.println("You entered an invalid number.");
//                            }
//
//                        case 3:
//                            kiosk.tea();
//
//                            if (num == 8) {
//                                kiosk.deserts();
//                                break;
//                            } else if (num == 9) {
//                                break;
//                            } else if (num == 0) {
//                                break;
//                            } else {
//                                System.out.println("You entered an invalid number.");
//                            }
//
//                        case 4:
//                            kiosk.deserts();
//
//                            if (num == 8) {
//                                kiosk.coffee();
//                                break;
//                            } else if (num == 9) {
//                                break;
//                            } else if (num == 0) {
//                                break;
//                            } else {
//                                System.out.println("You entered an invalid number.");
//                            }*/
//                    }
//                    break;
//            }
//        }

//        Kiosk kiosk = new Kiosk();
//        kiosk.menu();
//        new Kiosk().menu();
    }
}
