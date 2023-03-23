package com.bange.designmode.designmode.factory.abstractfactory;

/**
 * 需要哪种产品就可以很好的扩展
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        // 下单--手机类产品
        Order order = new Order(new PhoneFactory());
        order.placeOrder(1);
        // 下单--服装类产品
        Order order2 = new Order(new ClothFactory());
        order2.placeOrder(2);
        // 猫粮类
        Order order3 = new Order(new FoodFactory());
        order3.placeOrder(3);

    }
}
