package com.bange.designmode.designmode.strategy.improve;

public abstract class AbstractDuck {

      IFly fly;

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
        if(fly!=null){
            fly.fly();

        }else{
            System.out.println("鸭子会飞翔!!!!");
        }

    }

    public void setFly(IFly fly) {
        this.fly = fly;
    }
}
