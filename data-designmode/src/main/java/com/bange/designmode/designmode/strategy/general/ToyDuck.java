package com.bange.designmode.designmode.strategy.general;

public class ToyDuck  extends AbstractDuck{
    @Override
    void display() {
        System.out.println("这是玩具鸭子");
    }

    @Override
    void sound() {
        System.out.println("这是玩具鸭子不能叫");
    }

    @Override
    void swimming() {
        System.out.println("这是玩具鸭子不会游泳");
    }

    @Override
    void fly() {
        System.out.println("这是玩具鸭子不会飞翔");
    }
}
