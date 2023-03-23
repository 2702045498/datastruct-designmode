package com.bange.designmode.designmode.factory.factorymethods;

public class ClothOrder  extends Order{
    @Override
    Product create(int orderType) {
        return new Cloth(orderType,"衣服");
    }
}
