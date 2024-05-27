package com.ohgiraffers.section01.user_type;

public class Application {
    public static void main(String[] args) {
        // 회원 (아이디, 비밀번호, 이름, 나이, 설명, 취미)
        // 위 정보들을 관리하려고 함.

        String id = "user01";
        String password = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("id = " + id);
        System.out.println("password = " + password);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("hobby = ");
//        for(int i = 0; i < hobby.length; i++) {
//            System.out.println(hobby[i] + " ");
//        }
        for (String i : hobby) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * 위와 같이 각각의 변수로 관리하게 되면 몇가지의 단점이 있다.
         * 1. 변수명을 다 관리해야 한다.
         * 2. 모든 회원 정보를 인자로 메소드 호출시, 값을 전달해야 하면,
         *   너무 많은 값을 인자로 전달해야해서 가독성이 떨어진다.
         * 3. 메소드에서 리턴은 1개의 값만 가능하기 때문에
         *   다른 타입의 여러 변수를 묶어서 리턴할 수가 없다.
         * */

        /*
         * 사용자 정의 자료형 사용하기
         *
         * [자료형] [변수명] = new [클래스명]();
         * 사용자 정의 자료형인 클래스를 이용하기 위해서는 new 연산자로
         * heap에 할당을 해주어야 한다.
         * 객체를 생성하게 되면 클래스에 정의한
         * 필드와 메소드대로 객체(instance)가 생성된다.
         * 아이디, 비밀번호, 이름, 나이, 성별, 취미를 연속된 메모리 주소에서
         * 사용하도록 heap에 공간을 만들었다.
         * */

        Member member = new Member();

        /*
         * 필드에 접근하기 위해서는 레퍼런스 변수명.필드명으로 접근한다.
         * '.'은 참조연산자, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미이다.
         * 배열은 인덱스로 접근, 객체는 필드명으로 접근한다.
         * */

        System.out.println("================= 생성한 객체 필드값 출력 : 1 =================");
        System.out.println("member id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);


        // 필드에 접근해 변수처럼 사용
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "홍길동";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[]{"축구", "볼링", "테니스"};

        System.out.println("================= 생성한 객체 필드값 출력 : 2 =================");
        System.out.println("member id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.print("member.hobby : ");
        for(String i : member.hobby) {
            System.out.print(i + " ");
        }
        System.out.println();
    }




}
