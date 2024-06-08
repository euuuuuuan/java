package com.euuuuuuan.test.member.controller;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;


public class MemberRepository {
    private List<Member> memberList = new ArrayList<Member>();

    public MemberRepository() {
    }

    public void insertMember(Member m) throws OverMemberException {
        // 최대 회원 수가 10명을 넘어가면 OverMemberException 발생
        if (memberList.size() > 10) {
            throw new OverMemberException("Member List is full");
        }
        memberList.add(m);
        // 멤버리스트에 멤버 추가
    }

    public void printBuyInfo(int price) {
    }

    public void printData() {
        for (Member member : memberList) {
            System.out.println("이름: " + member.getName());
//            System.out.println("등급: " + member.getGrade());
//            System.out.println("포인트: " + member.getPoint());
        }
    }
}


