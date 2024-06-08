package com.euuuuuuan.test.member.controller;

public class OverMemberException extends Throwable {
    public OverMemberException(String memberListIsFull) {
        super(memberListIsFull);
    }
}
