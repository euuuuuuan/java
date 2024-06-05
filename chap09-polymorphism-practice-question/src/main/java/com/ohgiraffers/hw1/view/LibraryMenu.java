package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.LibraryManager;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm;
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {

    }

    public void selectAll() {}

    public void searchBook() {}

    public void rentBook() {}

    public LibraryManager getLm() {
        return lm;
    }

    public void setLm(LibraryManager lm) {
        this.lm = lm;
    }
}
