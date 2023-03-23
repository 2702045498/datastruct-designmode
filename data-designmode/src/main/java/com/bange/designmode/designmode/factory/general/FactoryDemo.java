package com.bange.designmode.designmode.factory.general;

public class FactoryDemo {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderType(3);
        order.placeOrder();

    }
}
