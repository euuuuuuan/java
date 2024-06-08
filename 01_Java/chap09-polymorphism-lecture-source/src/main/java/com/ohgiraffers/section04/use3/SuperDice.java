package com.ohgiraffers.section04.use3;

import com.ohgiraffers.section01.polymorphism.Rabbit;
import com.ohgiraffers.section01.polymorphism.Tiger;

public class SuperDice implements Dice {
    private int min;
    private int max;

    public SuperDice() {
        this.min = 1;
        this.max = 10;
    }

    @Override
    public int getNumber() {

// (Math.random()*(max-min+1)+min);
        return this.min + (int) (Math.random() * ((this.max - this.min) + 1));
    }
}

