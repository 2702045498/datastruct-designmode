package com.bange.designmode.designmode.factory.abstractfactory;

public class Phone extends Product {
    public Phone(int id, String name) {
        super(id, name);
    }

    @Override
    public void production() {
        System.out.println("生产手机");
    }

    @Override
    public void deliverGoods() {
        System.out.println("手机发货");
    }
}
