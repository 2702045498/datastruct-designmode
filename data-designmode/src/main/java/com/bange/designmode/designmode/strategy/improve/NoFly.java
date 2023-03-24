package com.bange.designmode.designmode.strategy.improve;

public class NoFly  implements IFly{
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
