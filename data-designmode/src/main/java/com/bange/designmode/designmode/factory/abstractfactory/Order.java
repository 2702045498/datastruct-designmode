package com.bange.designmode.designmode.factory.abstractfactory;

/**
 * 工厂抽象接口的使用类
 */
public class Order {
    // 1.聚合抽象工厂接口
    ProductFactory productFactory;

    public Order(ProductFactory productFactory) {
        this.productFactory = productFactory;
    }

    // 2.抽象工厂模式
    public void placeOrder( int orderType){
        Product product = productFactory.create(orderType);
        product.production();
        product.deliverGoods();
    }

}
