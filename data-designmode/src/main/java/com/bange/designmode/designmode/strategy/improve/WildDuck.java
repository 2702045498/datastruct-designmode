package com.bange.designmode.designmode.strategy.improve;



public class WildDuck extends AbstractDuck {

    public WildDuck() {
        fly=new GoodFly();
    }

    @Override
    void display() {
        System.out.println("这是野鸭");
    }
}
