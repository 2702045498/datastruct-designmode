package com.bange.designmode.principle.di2;


public class DiDemo2 {
    public static void main(String[] args) {
        Food food = new Shrimp();
        Cat2 cat = new Cat2(food);
        cat.eat();

    }
}
