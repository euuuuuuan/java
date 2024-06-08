package com.ohgiraffers.section04.use2;

public class FileSaveProvider implements SaveProvider {

    @Override
    public boolean save(String data) {

        System.out.println("[" + data + "] 내용을 " + "파일 저장에 실패했습니다.");
        return false;
    }

    // SaveProvider를 상속받고, save()를 구현해라.
    // return은 무조건 false
    // 안내 문구
    // "파일 저장에 실패했습니다."
}
