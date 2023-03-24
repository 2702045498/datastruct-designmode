package com.bange.designmode.designmode.strategy.general;

public abstract class AbstractDuck {

    public AbstractDuck() {
    }
    // 显示鸭子信息
     abstract void display();

    void sound(){
        System.out.println("鸭子嘎嘎叫");
    };

    void swimming(){
        System.out.println("鸭子会游泳");
    }

    void fly(){
        System.out.println("鸭子会飞翔");
    }


}
