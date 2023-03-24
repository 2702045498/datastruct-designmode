package com.bange.designmode.designmode.strategy.improve;


public class BJDuck extends AbstractDuck {
    public BJDuck() {
        fly=new BadFly();
    }

    @Override
    void display() {
        System.out.println("北京鸭子");
    }

    @Override
    void fly() {
        if(fly!=null){
            fly.fly();
        }else{
            System.out.println("北京鸭子不能飞翔");
        }

    }
}
