package com.bange.designmode.designmode.factory.abstractfactory;

public class Cloth extends Product {
    public Cloth(int id, String name) {
        super(id, name);
    }

    @Override
    public void production() {
        System.out.println("生产衣服");
    }

    @Override
    public void deliverGoods() {
        System.out.println("衣服发货");
    }
}
