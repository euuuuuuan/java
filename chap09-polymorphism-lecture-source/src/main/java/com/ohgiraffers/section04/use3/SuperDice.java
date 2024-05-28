package com.ohgiraffers.section04.use3;

import com.ohgiraffers.section01.polymorphism.Rabbit;
import com.ohgiraffers.section01.polymorphism.Tiger;

public class SuperDice implements Dice {
    int min = 1;
    int max = 10;

    @Override
    public int getNumber(int dice) {

// (Math.random()*(max-min+1)+min);
        return this.min + (int) (Math.random() * ((this.max - this.min) + 1));
    }
}

