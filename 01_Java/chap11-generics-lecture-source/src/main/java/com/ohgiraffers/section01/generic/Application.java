package com.ohgiraffers.section01.generic;

public class Application {

    // Generic
    public static void main(String[] args) {

        /*
        * 제네릭(Generic)
        *
        * 제네릭의 사전적인 의미는 "일반적인" 이라는 의미
        * 자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.
        *
        * 제네릭 프로그래밍
        * 데이터의 형식에 의존하지 않고 하나의 값이 다른 데이터 타입들에 가질 수 있는
        * 기술에 중점을 두어 재사용성을 높일 수 있는 프로그램 방식
        *
        * 제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에
        * 저장하는 방법을 의미한다.
        * 컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서
        * 사용되는 객체의 타입 안정성을 높일 수 있으며,
        * 반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
        * */

        GenericTest<Integer> gt = new GenericTest<Integer>();

        gt.setValue(10);
        System.out.println("value: " + gt.getValue());

        System.out.println(gt.getValue() instanceof Integer); // gt의 value가 Integer 타입이다.

        GenericTest<String> gt1 = new GenericTest<String>();
        gt1.setValue("홍길동");
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof String);

        // 생성자 쪽에 타입 명시를 하지 않아도 적용 가능
        // 단, 빈 다이아몬드 연산자는 작성해야 함.
        GenericTest<Double> gt2 = new GenericTest<>();
        gt2.setValue(10.40);
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof Double);
    }
}
