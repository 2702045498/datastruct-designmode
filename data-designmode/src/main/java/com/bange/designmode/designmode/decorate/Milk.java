package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

public class Milk  extends Decorater{
    public Milk(Drink drink) {
        super(drink);
        setDescript("牛奶");
        setPrice(BigDecimal.valueOf(5.00));
    }
}
