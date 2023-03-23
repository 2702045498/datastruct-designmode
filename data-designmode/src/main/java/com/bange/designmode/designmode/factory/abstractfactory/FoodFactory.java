package com.bange.designmode.designmode.factory.abstractfactory;

public class FoodFactory  implements ProductFactory{
    @Override
    public Product create(int orderType) {
        return new CatFood(orderType,"猫粮类食品");
    }
}
