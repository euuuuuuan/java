package com.ohgiraffers.section02;

import com.ohgiraffers.section02.exception.NotEnoughMoneyException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws Exception {

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다!!");
        } else {
            throw new NotEnoughMoneyException("가지고 있는 돈보다 상품 가격이 더 비쌉니다.");
        }
    }
}
