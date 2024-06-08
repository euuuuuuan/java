package com.ohgiraffers.api.member.run;

import com.ohgiraffers.api.member.Member;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Run {

    public static void main(String[] args) {
        String str = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

        // 문자열을 '|'를 기준으로 분리하여 회원 정보 배열을 생성합니다.
        String[] memberInfos = str.split("\\|");
        System.out.println("memberInfos.length : " + memberInfos.length);

        // 회원 객체를 저장할 배열을 생성합니다.
        Member[] members = new Member[memberInfos.length];

        // 각 회원 정보를 순회하면서 회원 객체를 생성하고 배열에 추가합니다.
        for (int i = 0; i < memberInfos.length; i++) {
            String[] fields = memberInfos[i].split(",");

            int memberNo = Integer.parseInt(fields[0]);
            String memberName = fields[1];
            int height = Integer.parseInt(fields[2]);
            int weight = Integer.parseInt(fields[3]);
            LocalDate birth = LocalDate.parse(fields[4], DateTimeFormatter.ofPattern("yyyyMMdd"));

            // 회원 객체 생성 및 배열에 추가
            members[i] = new Member(memberNo, memberName, height, weight, birth);
        }
        // 회원 객체 배열 출력 (예시)
        for (Member member : members) {
            System.out.println(member.toString());
        }

            /*
            LocalDate birth = LocalDate.parse(fields[4]);
            DateTimeParseException
            주어진 문자열을 LocalDate로 파싱할 때 발생한 에러입니다.
            이 에러는 LocalDate의 parse 메서드가 지정된 형식에 맞지 않는
            문자열을 파싱하려고 시도할 때 발생합니다.
            주어진 문자열 "19900905"는 "yyyyMMdd" 형식을 따르고 있습니다.
            그러나 parse 메서드는 기본적으로 ISO_LOCAL_DATE 형식을 기대하므로
            "yyyy-MM-dd"와 같은 형식을 요구합니다.
            따라서 문자열을 LocalDate로 파싱할 때 해당 형식을 명시적으로 지정해야 합니다.*/
    }
}
