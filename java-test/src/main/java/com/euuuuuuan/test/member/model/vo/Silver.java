package com.euuuuuuan.test.member.model.vo;

public class Silver extends Member {
    public Silver() {
    }

    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return getPoint() * 0.02;
    }

    @Override
    public int discountInterest() {
        return (int) (10000 * 0.02);
    }
}
