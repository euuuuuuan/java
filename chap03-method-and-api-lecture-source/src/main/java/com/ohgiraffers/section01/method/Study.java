package com.ohgiraffers.section01.method;

public class Study {
    public static void main(String[] args) {
       // int key = 170;

        Study study = new Study();
        study.printMethod(170);
//        study.printMethod1(170);

        //1-3
        int tall = 170;
        Study.printMethod(tall);

        byte byteTall = 126;
        Study.printMethod(byteTall);

        short shortTall = 170;
        Study.printMethod(shortTall);

        long longTall = 170;
        Study.printMethod((int)longTall);

        //4.
        int age = 10;
        String name = "홍길동";
        int tall2 = 170;
        study.printMethod1(age, name, tall2);

        //6.
        System.out.println(printMethod2());

        //7.
        int first = 10;
        int second = 20;
        System.out.println( "두 수를 더한 결과 : " + study.printMethod3(first, second));
    }

    //1.
    public static void printMethod(int tall) {
        System.out.println("당신의 키는 " + tall + "입니다.");

    }

    public static void printMethod1(int age, String name, int tall2){
        System.out.println("저는 " + age + "살 " + name + "이고, " + tall2 + "센치입니다.");
    }
 /*   public void printMethod1(int tall) {
        System.out.println("당신의 키는 " + tall + "입니다.");

    }*/
    public static String printMethod2() {
        return "Welcome";
    }

    public int printMethod3(int first, int second) {
        return first + second;
    }




}
