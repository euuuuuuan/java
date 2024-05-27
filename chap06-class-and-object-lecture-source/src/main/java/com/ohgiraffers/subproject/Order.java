package com.ohgiraffers.subproject;

public class Order {
    private final String menuName; // 커피종류
    private final String option; // HOT or ICED
    private final int count; // 수량

    public Order(String menuName, String option, int count) {
        this.menuName = menuName;
        this.option = option;
        this.count = count;
    }

    // order클라스에 private으로 설정이 돼있어서 불러오려면 getter가 필요
    public String getMenuName() {
        return menuName;
    }

    public String getOption() {
        return option;
    }

    public int getCount() {
        return count;
    }

    // setter가 들어가지 않는 이유는 order클라스에 final이 들어가기 때문에 값을 바꿀 수 없어서.
}
