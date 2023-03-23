package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

public class Soybean  extends Decorater{
    public Soybean(Drink drink) {
        super(drink);
        setDescript("豆浆");
        setPrice(BigDecimal.valueOf(3.00));
    }
}
