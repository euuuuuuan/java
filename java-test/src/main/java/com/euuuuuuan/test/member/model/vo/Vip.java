package com.euuuuuuan.test.member.model.vo;

public class Vip extends Member {
    public Vip() {
    }

    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return getPoint() * 0.1;
    }
}
