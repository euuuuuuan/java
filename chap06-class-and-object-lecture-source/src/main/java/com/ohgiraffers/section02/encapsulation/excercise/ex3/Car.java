package com.ohgiraffers.section02.encapsulation.excercise.ex3;

public class Car {

    private String setModel;
    int year;
    String engineType;

    public void setModel(String model) {
        this.setModel = model;
    }

    public void year(int year) {
        this.year = year;
    }

    public void engineType(String engineType) {
        this.engineType = engineType;
    }

    public String getInfo() {
        return "해당 차량의 모델은 " + setModel + "이며, " + year + "년식의 " + engineType +" 타입의 차량입니다.";
    }


}
