package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    // Computer는 하나의 Product 이지만, 모든 Product는 Computer가 아니다.

    private String cpu; // cpu
    private int hdd; // 하드디스크 용량
    private int ram; // 램 용량
    private String operationSystem; // 운영체제

    // 기본 생성자
    public Computer() {

        // super();
        System.out.println("Computer 클래스의 기본 생성자 호출함...");

    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manfucturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manfucturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    //    @Override
//    public String getInformation() {
//        // 부모클래스 필드까지 다 출력을 하려면
//        return "Computer ["
//                + "code = " + super.getCode()
//                + ", name = " + super.getName()
//                + ", price = " + super.getPrice()
//                + ", manufactureingDate = " + super.getManfucturingDate()
//                + ", cpu = " + this.cpu
//                + ", hdd = " + this.hdd
//                + ", ram = " + this.ram
//                + ", operationSystem = " + this.operationSystem
//                + "]";
//    }

    /*
    * super.getInformation() : 정상적으로 부모의 메소드를 호출
    * this.getInforamtion() : 재귀호출이 일어나면 stackOverFlow 발생
    * getInformation() : this. 이 자동으로 추가되어 재귀호출이 일어남.
    *
    * => 부모클래스에 있는 메소드를 사용하고 싶다면 super. 를 명시해주는 게 좋다.
    * */

//    @Override
//    public String getInformation() {
//        return super.getInformation()
//                + ", cpu = " + this.cpu
//                + ", hdd = " + this.hdd
//                + ", ram = " + this.ram
//                + ", operationSystem = " + this.operationSystem;
//
//    }




}
