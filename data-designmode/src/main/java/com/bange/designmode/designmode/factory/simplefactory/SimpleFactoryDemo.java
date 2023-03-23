package com.bange.designmode.designmode.factory.simplefactory;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Order order = new Order();
        order.setSimpleFactory(simpleFactory);
        order.placeOrder(2);
    }
}
