package com.ohgiraffers.hw1.model.dto;

public class CookBook extends Book {
    boolean coupon;

    public CookBook() {}
    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    public boolean isCoupon() {
        return coupon;
    }

    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                '}';
    }
}
