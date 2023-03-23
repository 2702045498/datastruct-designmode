package com.bange.designmode.designmode.decorate;

import java.math.BigDecimal;

public class CafeLatteCoffee extends Coffee{
    public CafeLatteCoffee() {
        setDescript("美式咖啡");
        setPrice(BigDecimal.valueOf(45.00));
    }
}
