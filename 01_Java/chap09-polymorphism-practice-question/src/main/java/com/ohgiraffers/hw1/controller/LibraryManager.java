package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

public class LibraryManager {
    private Member mem = null;
    private Book[] bList = new Book[5] ;

    public void insertMember(Member mem) {
        // 전달받은 mem 주소 값을 해당 회원 레퍼런스(mem)에 대입
        this.mem = mem;
    }

    public Member myInfo(){
        // 회원 레퍼런스(mem) 주소 값 리턴
        return mem;
    }

    public Book[] sellectAll() {
        // 도서 목록 레퍼런스(bList) 주소 값 리턴
        // 모든 책 조회 기능 구현
        return bList;
    }

    public Book[] searchBook(String keyword) {
        // 책 검색 기능 구현
        // 검색 결과를 담아줄 새로운 Book 객체 배열 생성
        // 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
        // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
        // 전달받은 keyword를 포함하고 있으면 → HINT : String 클래스의 contains() 참고
        // 검색결과의 도서목록에 담기 → HINT : count 이용
        // 해당 검색결과의 도서목록 주소 값 리턴

        // 책 검색 기능 구현
        // 검색 결과를 담아줄 새로운 Book 객체 배열 생성
        // 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
        Book[] searchResult = new Book[5];
        int count = 0; // 검색 결과 도서 목록의 개수를 세는 변수

        // for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
        for (Book book : bList) {
            // 전달받은 keyword를 포함하고 있으면 검색 결과에 추가
            if (book.getTitle().contains(keyword)) { // 예시로 도서 제목을 기준으로 검색
                searchResult[count] = book;
                count++;
            }
        }

        // 검색 결과의 도서 목록 주소 값 리턴
        return searchResult;
    }

    public int rentBook(int index) {
        // 책 대여 기능 구현
//        result를 0으로 초기화 한 후 전달받은 인덱스의 도서가 만화책인 경우
//        회원의 나이와 해당 만화책의 제한 나이를 비교하여 회원 나이가
//        더 적은 경우 result를 1로 초기화 아니면 전달받은 인덱스의
//        도서가 요리책인 경우 해당 요리책의 쿠폰 유무가 유일 경우 회원의
//        couponCount를 1증가 시킨 후 result 2로 초기화 → result 리턴

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
