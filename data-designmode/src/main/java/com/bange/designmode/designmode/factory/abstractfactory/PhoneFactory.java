package com.bange.designmode.designmode.factory.abstractfactory;
// 子类工厂负责具体创建对象
public class PhoneFactory  implements ProductFactory{
    @Override
    public Product create(int orderType) {
        return new Phone(orderType,"手机类产品");
    }
}
