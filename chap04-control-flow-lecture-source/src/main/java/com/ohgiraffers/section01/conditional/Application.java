package com.ohgiraffers.section01.conditional;

public class Application {
    // 실행용 클래스
    public static void main(String[] args) {

        A_If aIf = new A_If();

//        aIf.testSimpleIfStatement(); // 단일 if 문
//        aIf.testNestedIfStatement();

        B_IfElse bIfElse = new B_IfElse();

//        bIfElse.testSimpleIfElseStatement();
//          bIfElse.testNestedIfElseStatement();

        C_IfElseIf cIfElseIf = new C_IfElseIf();

//        cIfElseIf.testSimpleIfElseIfStatement();

//        cIfElseIf.testNestedIfElseIfStatement2();
//        cIfElseIf.testNestedIfElseIfStatement();

        D_switch dSwitch = new D_switch();

//        dSwitch.testSimpleSwitchStatement();
//        dSwitch.testSwitchVendingMachine();
//        dSwitch.axeSwitch();
        dSwitch.meetSwitch();
    }
    }

