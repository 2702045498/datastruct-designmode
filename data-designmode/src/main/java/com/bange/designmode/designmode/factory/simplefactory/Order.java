package com.bange.designmode.designmode.factory.simplefactory;

public class Order {

    private  SimpleFactory simpleFactory;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    // 1.使用简单工厂模式
    public void placeOrder(int orderType){
        Product product=  simpleFactory.creatProduct(orderType);
        product.production();
        product.deliverGoods();
    }

}
