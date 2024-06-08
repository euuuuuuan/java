package com.ohgiraffers.section04.use2;

// 빨간 밑줄은 추상메소드를 구현하면 해결
// alt + enter 키로 오버라이드 가능
public class DatabaseSaveProvider implements SaveProvider {

    @Override
    public boolean save(String data) {

        System.out.println("Database에 저장 성공했습니다.");
        return true;

    }
}
