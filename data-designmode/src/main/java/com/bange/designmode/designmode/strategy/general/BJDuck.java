package com.bange.designmode.designmode.strategy.general;

public class BJDuck  extends AbstractDuck{
    @Override
    void display() {
        System.out.println("北京鸭子");
    }

    @Override
    void fly() {
        System.out.println("北京鸭子不能飞翔");
    }
}
