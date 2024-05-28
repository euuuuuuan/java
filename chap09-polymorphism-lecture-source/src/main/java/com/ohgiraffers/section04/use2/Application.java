package com.ohgiraffers.section04.use2;

public class Application {
    public static void main(String[] args) {

//        SaveProvider saveProvider = new FileSaveProvider(); // new 뒤의 코드 한줄만 바꾸면 다른 클래스 실행가능
        SaveProvider saveProvider = new DatabaseSaveProvider(); // new 뒤의 코드 한줄만 바꾸면 다른 클래스 실행가능

        Person person = new Person(saveProvider);

        person.doSomething();
    }
}
