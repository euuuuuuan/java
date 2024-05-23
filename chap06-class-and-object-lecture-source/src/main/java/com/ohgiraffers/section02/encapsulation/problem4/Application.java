package com.ohgiraffers.section02.encapsulation.problem4;

public class Application {

    public static void main(String[] args) {

        Monster monster1 = new Monster();

        // kinds 필드는 private으로 접근 제한이 되어있기 때문이다.
        // 필드로 직접 접근이 불가
//        monster1.kinds = "??";
//        monster1.hp = 10;

        /*
        * 선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
        * public으로 접근을 허용한 메소드만 이용할 수 있게 해놓은 것
        * => 캡슐화(encapsulation)
        * */

        monster1.setKinds("프랑켄슈타인");
        monster1.setHp(200);

        System.out.println(monster1.getInfo());

        /*
        * 클래스 작성시, 특별한 목적이 아닌이상, 캡슐화가 기본 원칙으로 사용된다.
        * */
    }
}
