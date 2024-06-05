package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5] ;

    public void insertMember(Member mem) {
        // 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입

    }

    public Member myInfo(){
        // 회원 레퍼런스(mem) 주소 값 리턴
        return null;
    }

    public Book[] sellectAll() {
        // 도서 목록 레퍼런스(bList) 주소 값 리턴
        // 모든 책 조회 기능 구현
        return new Book[0];
    }

    public Book[] searchBook(String keyword) {
        // 책 검색 기능 구현
        // 검색 결과를 담아줄 새로운 Book 객체 배열 생성
        // 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
        // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
        // 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
        // 검색결과의 도서목록에 담기 → HINT : count 이용
        // 해당 검색결과의 도서목록 주소 값 리턴
        return new Book[0];
    }

    public int rentBook(int index) {
        // 책 대여 기능 구현
        return index;
    }

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }
}
