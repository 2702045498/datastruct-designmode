package com.bange.designmode.designmode.factory.factorymethods;

public class FactoryMethodsDemo {
    public static void main(String[] args) {
        PhoneOrder phoneOrder = new PhoneOrder();
        Product product = phoneOrder.create(1);

    }
}
