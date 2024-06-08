package com.ohgiraffers.section02.encapsulation.excercise.ex2;

public class Book {

    private String writer;
    private String name;
    private int page;
    private String cover;

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getInfo() {
        return writer + name + page + cover;
    }

}
