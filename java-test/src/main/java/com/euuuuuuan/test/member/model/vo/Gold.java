package com.euuuuuuan.test.member.model.vo;

public class Gold extends Member {
    public Gold() {
    }

    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return getPoint() * 0.5;
    }
}
