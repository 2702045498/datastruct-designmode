package com.bange.designmode.designmode.strategy.improve;

public class BadFly  implements IFly{
    @Override
    public void fly() {
        System.out.println("飞翔不好");
    }
}
