package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

public class Chocolate extends Decorater{
    public Chocolate(Drink drink) {
        super(drink);
        setDescript("巧克力");
        setPrice(BigDecimal.valueOf(15.00));
    }
}
