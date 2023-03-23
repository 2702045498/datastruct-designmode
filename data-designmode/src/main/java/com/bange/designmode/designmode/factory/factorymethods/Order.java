package com.bange.designmode.designmode.factory.factorymethods;


//工厂模式--抽象方法
public abstract class Order {
// 抽象方法使子类进行继承实现具体的创建方法
    abstract Product create(int orderType);

    public Order() {
        int orderType=0;
        //构造使用抽象方法
        Product product=create(orderType);
        product.production();
        product.deliverGoods();
    }



}
