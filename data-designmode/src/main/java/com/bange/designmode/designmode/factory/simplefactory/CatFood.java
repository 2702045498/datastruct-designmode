package com.bange.designmode.designmode.factory.simplefactory;

public class CatFood  extends Product {
    public CatFood(int id, String name) {
        super(id, name);
    }

    public void production() {
        System.out.println("生产猫粮");
    }

    public void deliverGoods() {
        System.out.println("猫粮发货");
    }
}
