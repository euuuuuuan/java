package com.ohgiraffers.section03.grammar;

public class Application {
    // Enum 문법
    public static void main(String[] args) {

        UserRole1 admin = UserRole1.ADMIN;
        System.out.println(admin);
        System.out.println(admin.getNameToLowerCase());
    }
}
