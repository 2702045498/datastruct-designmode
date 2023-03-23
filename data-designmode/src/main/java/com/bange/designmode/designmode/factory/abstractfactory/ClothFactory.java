package com.bange.designmode.designmode.factory.abstractfactory;

public class ClothFactory  implements ProductFactory{
    @Override
    public Product create(int orderType) {
        return new Cloth(orderType,"服装类产品");
    }
}
