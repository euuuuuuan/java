package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;
import com.ohgiraffers.hw1.model.dto.Book;
import com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        System.out.println("회원의 이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("회원의 나이를 입력해주세요.");
        int age = sc.nextInt();
        System.out.println("회원의 성별을 입력해주세요.");
        char gender = sc.next().charAt(0);

        Member member = new Member(name, age, gender);
        lm.insertMember(member);

        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            System.out.println("메뉴를 선택해주세요: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    lm.myInfo();
                    break;
                case 2:
                    lm.sellectAll();
                    break;
                case 3:
                    lm.searchBook("read");
                    break;
                case 4:
                    lm.rentBook(1);
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return; // 종료
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
            // 이름, 나이, 성별을 키보드로 입력 받은 후 Member 객체 생성
            // LibraryManager의 insertMember() 메소드에 전달

//        ==== 메뉴 ==== // 무한 반복 실행
//        1. 마이페이지 // LibraryManager의 myInfo() 호출하여 출력
//        2. 도서 전체 조회 // LibraryMenu의 selectAll() 호출
//        3. 도서 검색 // LibraryMenu의 searchBook() 호출
//        4. 도서 대여하기 // LibraryMenu의 rentBook() 호출
//        0. 프로그램 종료하기

        }
    }

    public void selectAll() {
        Book[] books = lm.sellectAll();
        // LibraryManager의 selectAll() 메소드 호출하여 도서 목록 가져오기

        if (books.length == 0) {
            System.out.println("현재 등록된 도서가 없습니다.");
        } else {
            System.out.println("도서 목록:");
            for (Book book : books) {
                System.out.println(book); // 각 도서를 출력
            }
        }
//        LibraryManager의 selectAll 메소드 호출
//        → 결과 값을 Book[] 자료형으로 받 아준 뒤
//        for문을 통해 도서 전체 목록 출력
    }

    public void searchBook() {
        System.out.println("검색할 도서 제목 키워드를 입력해주세요: ");
        String keyword = sc.nextLine();

        Book[] foundBooks = lm.searchBook(keyword); // LibraryManager의 searchBook() 메소드 호출하여 검색 결과 받아오기

        if (foundBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("검색 결과:");
            for (Book book : foundBooks) {
                System.out.println(book); // 각 검색 결과 도서 출력
            }
        }
//        검색할 제목 키워드를 입력 받고
//        그 키워드를 LibraryManager의
//        searchBook 메소드로 전달
//        → 결과 값을 Book[] 자료형으로 받아준 뒤
//        향상된 for문을 이용하여 출력
    }

    public void rentBook() {
        System.out.println("검색할 도서 제목 키워드를 입력해주세요: ");
        String keyword = sc.nextLine();

        Book[] foundBooks = lm.searchBook(keyword); // LibraryManager의 searchBook() 메소드 호출하여 검색 결과 받아오기

        if (foundBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("검색 결과:");
            for (int i = 0; i < foundBooks.length; i++) {
                System.out.println(i + 1 + ". " + foundBooks[i]); // 각 검색 결과 도서를 순서대로 번호를 붙여서 출력
            }

            // 도서 선택
            System.out.println("대여할 도서 번호를 입력해주세요: ");
            int bookNumber = sc.nextInt();
            sc.nextLine(); // Consume newline character

            if (bookNumber < 1 || bookNumber > foundBooks.length) {
                System.out.println("잘못된 번호입니다.");
                return;
            }

            // 선택한 도서 대여
            lm.rentBook(bookNumber);
        }
//        대여할 도서 인덱스를 입력 받아
//        LibraryManager의 rentBook 메소드로 전달
//        → 결과 값을 result로 받아 result가
//        0일 경우, 1일 경우, 2일 경우 각각에 해당하는 출력문 출력

    }

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}

