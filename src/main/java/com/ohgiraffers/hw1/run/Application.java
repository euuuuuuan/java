package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.EmployeeDTO;
import com.ohgiraffers.hw1.model.dto.StudentDTO;
import com.ohgiraffers.hw1.model.dto.PersonDTO;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

//        StudentDTO[] school = new StudentDTO[3];

//        school[0] = new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
//        school[1] = new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과");
//        school[2] = new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");

        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서
        StudentDTO[] school = {
                new StudentDTO("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
                new StudentDTO("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
                new StudentDTO("강개순", 23, 167.0, 45.0, 4, "정보통신공학과")
        };


        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함
        for (StudentDTO i : school) {
            System.out.println(i.toString());
        }

        EmployeeDTO[] work = new EmployeeDTO[1];

        Scanner sc = new Scanner(System.in);

//        String[] name = new String[work];
//        int[] age = new int[work];
//        double[] height = new double[work];
//        double[] weight = new double[work];
//        int[] salary = new int[work];
//        String[] dept = new String[work];

        int count = 0;
        while (true) {

            System.out.println("이름을 입력하세요. \n");
            String name = sc.next();

            System.out.println();
            System.out.println("나이를 입력하세요. \n");
            int age = sc.nextInt();

            System.out.println();
            System.out.println("신장을 입력하세요. \n");
            double height = sc.nextDouble();

            System.out.println();
            System.out.println("무게를 입력하세요. \n");
            double weight = sc.nextDouble();

            System.out.println();
            System.out.println("급여를 입력하세요. \n");
            int salary = sc.nextInt();

            System.out.println();
            System.out.println("부서를 입력하세요. \n");
            String dept = sc.next();

//            EmployeeDTO em = new EmployeeDTO(name, age, height, weight, salary, dept);
//            work[count] = em;
            work[count] = new EmployeeDTO(name, age, height, weight, salary, dept);
            count++;

            System.out.println("계속 입력하시겠습니까? (Y/N)");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                continue;
            } else if (ch == 'n' || ch == 'N') {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println(count + "명 입력되었습니다.");

            for(int i = 0; i < count; i++){
            System.out.println(work[i].toString());
            }

        }

    }


// 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
// 현재 기록된 사원들의 정보를 모두 출력

//        3. 사용 데이터
//        이름 나이 신장 몸무게 학년 전공
//        홍길동 20 178.2 70.0 1 정보시스템공학과
//        김말똥 21 187.3 80.0 2 경영학과
//        강개순 23 167.0 45.0 4 정보통신공학과
//        이름 나이 신장 몸무게 급여 부서
//        박보검 26 180.3 72.0 100000000 영업부
//        강동원 38 182.0 76.0 200000000 기획부

}

