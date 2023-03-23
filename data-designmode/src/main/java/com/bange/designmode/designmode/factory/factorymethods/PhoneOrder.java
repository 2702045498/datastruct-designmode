package com.bange.designmode.designmode.factory.factorymethods;


// 子类实现抽象工厂方法
public class PhoneOrder extends Order{
    @Override
    Product create(int orderType) {
        Product  product=new Phone(orderType,"phone");
        return product;
    }
}
