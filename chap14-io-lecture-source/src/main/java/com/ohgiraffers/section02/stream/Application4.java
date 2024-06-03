package com.ohgiraffers.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
    // FileWriter
    public static void main(String[] args) {

        /*
        * FileWriter
        * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
        * character (1글자) 단위로 데이터를 처리한다.
        * */

        FileWriter fw = null;

        try {
            // 파일이 존재하지 않으면 생성을 해준다.
            // 두번째 인자로 true를 전달하면 이어쓰기가 된다. (기본값 false)
            fw = new FileWriter("src/main/java/com/ohgiraffers/section02/stream/testWriter.txt");

            fw.write(97); // a

            // 직접 char 자료형으로 내보내기도 가능.
            fw.write('a');

            char[] charr = {10, 'a', 'p', 'p', 'l', 'e', 10}; // 10은 개행 기능

            // 문자 배열로도 내보내기 가능
            fw.write(charr);

            // 문자열로도 가능
            fw.write("동해물과 백두산이 마르고 닳도록");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 자원 반환
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
