package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

/**
 * 装饰者类
 * 1.装饰者类相当于调料类
 * 2.Drink为主体类，装饰者类包含主体类
 */
public class Decorater extends Drink {

    // 组合关系 (主体类--单品咖啡)
    private Drink drink;

    public Decorater(Drink drink) {
        this.drink = drink;
    }

    @Override
    public BigDecimal cost() {
        //装饰者类本身（调料类价格）+单品价格（被装饰者--主体类）
       BigDecimal totalPrice=  super.getPrice().add(drink.cost());
        return totalPrice;

    }

    @Override
    public String getDescript() {
        return this.drink.getDescript()+ " && " +super.getDescript()  ;
    }
}
