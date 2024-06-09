package com.euuuuuuan.test.member.controller;

import com.euuuuuuan.test.member.model.vo.Member;
import com.euuuuuuan.test.member.controller.OverMemberException;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> memberList = new ArrayList<>();

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
        for (Member member : memberList) {
            System.out.println(member.getGrade() + " 등급 회원 "
                    + member.getName() + "는 " + price +"원 상품을 "
                    + (price - member.discountInterest()) + "원에 구매합니다.");
        }
    }

    public void printData() {
        for (Member member : memberList) {
            System.out.println(member.getGrade() + " 등급 회원 "
                    + member.getName() + "의 포인트는 " + member.getPoint()
                    + "이고, 이자 포인트는 " + member.calculateInterest() + "입니다.");
        }
    }
}

